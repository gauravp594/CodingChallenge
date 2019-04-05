class MaxConsecutiveones {
    public int longestOnes(int[] A, int k) {
        int i=0;
        int j=0;
        int n=A.length;
        int locate=0;
        int count=0;
        int max=0;
        
        int x=k;
        while(j<n){
            
            if(A[j]==1)
            {
                count+=1;
                max=Math.max(max,count);
                j++;
                continue;
            }
            else{
                if(k>0){
                    k--;
                    count+=1;
                    j++;
                    max=Math.max(max,count);
                }
                else if(k==0){
                    i++;
                    j=i;
                    k=x;
                    count=0;
                }
            }
        }
        return max;
        
    }
}