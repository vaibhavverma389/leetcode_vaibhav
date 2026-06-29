class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder str= new StringBuilder("");
        for(char i:s.toCharArray())
        {
            if(i=='(')
            {
                count++;
                if(count >1)
                {
                    str.append(i);
                }
            }
            else
            {
                count--;
                if(count>0)
                {
                    str.append(i);
                }
            }

        }
        return str.toString();
    }
}