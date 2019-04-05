class Longest_Turbulent_Subarray {
    public int maxTurbulenceSize(int[] A) {
        int i=0;
        int j=0;
        int n=A.length;
        int max=0;
        int count=0;
        int key=0;
        
        if(n==1)
            return 1;
        while(j<n-1){
            count++;
            
            if(count==1){
            if(A[j]<A[j+1]){
                key=1;
                j++;
            }
            else if(A[j]>A[j+1]){
                key=2;
                j++;
            }
                
            }
            else{
               
                if(key==1){
                    if(A[j]>A[j+1]){
                         key=2;
                        j++;
                    }
                    else{
                        i++;
                        j=i;
                        count=0;
                    }
                }
                else if(key==2){
                    if(A[j]<A[j+1]){
                         key=1;
                        j++;
                    }
                    else{
                        i++;
                        j=i;
                        count=0;
                    }
                }
            }
            if(key==0){
                i++;
                j=i;
                count=0;
            }
            max=Math.max(max,j-i+1);
            
        }
        return max;
    }
}