#include<stdio.h>

void quicksort(int a[],int l, int u);
int partition(int a[],int l,int u);

int main() 
{
	//code
	int t,n,i,a[100000],j,k;
	
	scanf("%d",&t);
	while(t--)
	{
	
    	scanf("%d%d",&k,&n);
    	
    	for( i=0; i<k*n; i++)
    	{
    	    scanf("%d",&a[i]);
    	}
    	
    	n=k*n;
    	
    	quicksort(a,0,n-1);
    	
    	for( i=n-1; i>=0; i--)
    	{
    	   printf("%d ",a[i]);
    	}
    	printf("\n");
    	
    
    	    
    
	}
	
	return 0;
}

void quicksort(int a[],int l,int u)
{
    int j;
    if(l<u)
    {
        j=partition(a,l,u);
        quicksort(a,l,j-1);
        quicksort(a,j+1,u);
    }
}

    
int partition(int a[],int l,int u)
{
    int i,j,v,temp;
    v=a[l];
    i=l;
    j=u+1;
    do
    {
        do
        {
            i++;
        }while(a[i]<v&&i<j);
        do
        {
            j--;
        }while(a[j]>v);
        if(i<j)
        {
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
        }
    }while(i<j);
    a[l]=a[j];
    a[j]=v;
    return j;
    
}
    
    
    
