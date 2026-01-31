class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int c=i;
            boolean v=true;
            while(c>0){
                int b=c%10;
                if(b==0 || i%b!=0 ){
                    v=false;
                    break;
                }
                c=c/10;
            }
            if(v)
            {
                arr.add(i);
            }
        }

        return arr;
        
    }
}