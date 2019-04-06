
//https://practice.geeksforgeeks.org/problems/kth-element-in-amatrix/1

class KthEleInMatrix{
	public static void kthSmallest(int[][] a,int n,int l){
        
        
        int [] temp = new int[n*n];
        int k=0;
        for(int i=0; i<n; i++){
           for(int j=0; j<n; j++){
                temp[k]=a[i][j];
                k++;
            }
        }
        Arrays.sort(temp);
        System.out.println(temp[l-1]);
        
        
        
    }
    
}

