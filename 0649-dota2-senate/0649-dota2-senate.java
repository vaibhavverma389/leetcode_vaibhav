class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> r = new LinkedList<>();
        Queue<Integer> d = new LinkedList<>();
        int n=senate.length();
        for(int i=0;i<n;i++)
        {
            if(senate.charAt(i)=='R')
            {
                r.add(i);
            }
            else
            {
                d.add(i);
            }
        }  
        while(!r.isEmpty() && !d.isEmpty())
        {
            int a=r.poll();
            int b=d.poll();
            if(a<b)
            {
                r.add(a+n);
            }
            else
            {
                d.add(a+n);
            }
        }     
        if(r.isEmpty())
        {
            return "Dire";
        }
        else
        {
            return "Radiant";
        }
    }
}