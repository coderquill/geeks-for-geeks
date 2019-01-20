/*Given a sorted array A, size N, of integers; every element appears twice except for one. Find that element in linear time complexity and without using extra memory.

Input:
The first line of input consists of T, the number of the test cases. T testcases follow. Each testcase contains two lines of input.
The first line of each test case contains the size of the array, and the second line has the elements of the array.

Output:
For each testcase, in a new line, print the number that appears only once in the array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
0 ≤ A[i] ≤ 1017

Example:
Input:
1
11
1 1 2 2 3 3 4 50 50 65 65
Output:
4*/

#include<bits/stdc++.h>
#include<bits/stdc++.h>
using namespace std;
#define f(in,n) for(int i=in;i<n;i++)
int main()
 {
	int q,n,num=0,m,p;
	cin>>q;
	while(q--)
	{
	    num=INT_MIN;
	    cin>>n;
	    f(0,n)
	    {
	        cin>>m;
	        if(i&1 && num==INT_MIN)
	        {
	            if(m!=p)
	            num=p;
	        }
	        else
	        p=m;
	    }
	    if(num==INT_MIN)
	    cout<<m<<endl;
	    else
	    cout<<num<<endl;
	}
	return 0;
}
