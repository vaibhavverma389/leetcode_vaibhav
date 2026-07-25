class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> al= new ArrayList<>();
        while(n>0)
        {
            int b=n%10;
            n=n/10;
            al.add(b);
        }
        int b=al.size();
        Collections.sort(al);
        return al.get(b-1)*al.get(b-2);
        
    }
}