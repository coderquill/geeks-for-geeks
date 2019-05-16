//https://practice.geeksforgeeks.org/problems/count-odd-even-java/1/?track=module-2-arrays-and-strings-java&batchId=114

class Geeks{
    static void countOddEven(int a[], int n){
        int even = 0, odd = 0;
        for(int i = 0; i<n; i++){
            if(a[i] %2 == 0)
                even ++;
            else
                odd++;
        }
        System.out.println(odd +" "+even);
        
    }
}
