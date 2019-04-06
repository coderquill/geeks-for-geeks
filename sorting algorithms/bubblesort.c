#include <stdio.h>

void sort(int a[], int n);

int main() 
{
	//code
	int t,n,i,a[1000],j;
	scanf("%d",&t);
	while(t--)
	{
    	scanf("%d",&n);
    	for( i=0; i<n; i++)
    	{
    	    scanf("%d",&a[i]);
    	}
    	
    	sort(a,n);
    	
    	for( i=0; i<n; i++)
    	{
    	   printf("%d ",a[i]);
    	}
    	printf("\n");
	}
	
	return 0;
}

void sort(int a[], int n)
{
    int temp, flag;
    for(int i=1; i<n; i++)
    {
        flag=0;
        for(int j=0; j<n-1; j++ )
        {
            if(a[j]>a[j+1])
            {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag++;
            }
        }
        if(flag==0)
        break;
 
    }
}
