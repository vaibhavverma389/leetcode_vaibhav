class Solution {
    public int calPoints(String[] operations) { 
        Stack<Integer> stack= new Stack<>();
        for(String i:operations)
        {
            if(i.equals("C"))
            {
                stack.pop();
            }
            else if(i.equals("D"))
            {
                int a=stack.peek();
                stack.push(a*2);
            }
           else if(i.equals("+"))
            {
                int a=stack.pop();
                int b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }
            else
            {
                stack.push(Integer.parseInt(i));
            }
        }
        int ans=0;
        for(int i:stack)
        {
            ans+=i;
        }
        return ans;
        
    }
}