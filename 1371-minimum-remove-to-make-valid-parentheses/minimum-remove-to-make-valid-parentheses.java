class Solution {
    public String minRemoveToMakeValid(String s) 
    {
        StringBuilder str=new StringBuilder(s);
        Stack<Integer> stack=new Stack<>();
        for(int ind=0;ind<str.length();ind++)
        {
            if(str.charAt(ind)=='(')
            {
                stack.push(ind);
            }
            else if(str.charAt(ind)==')')
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                else
                {
                    str.setCharAt(ind,'*');
                }
            }
        }
        while(!stack.isEmpty())
        {
            str.setCharAt(stack.pop(),'*');
        }
        StringBuilder ans=new StringBuilder();
        for(int ind=0;ind<str.length();ind++)
        {
            if(str.charAt(ind)!='*')
            {
                ans.append(str.charAt(ind));
            }
        }
        return ans.toString();
    }
}