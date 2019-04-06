#include<stdio.h>
int main(){
	char* s[100];
	int count;
	scanf("%s",s);
	for( int i=0;s[i]!='\0';i++)
		{
			count++;
			char b=s[i];
			printf("\n%c",&b);
		}
	printf("\n%d",count);
	

}
