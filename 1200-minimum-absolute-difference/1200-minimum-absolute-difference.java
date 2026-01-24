class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> all = new ArrayList<>();
        Arrays.sort(arr);
        int n=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if((arr[i+1]-arr[i])<n)
            {
                n=arr[i+1]-arr[i];
            }
        }
        for(int i=1;i<arr.length;i++){
            ArrayList<Integer> al= new ArrayList<>();
            if((arr[i]-arr[i-1])==n)
            {
                al.add(arr[i-1]);
                al.add(arr[i]);
            }
            if(al.size() !=0)
            {
                all.add(al);
            }
            
        }
       return all; 
    }
}