#include<stdio.h>

void copy(char s[], char s2[])
{	
	int i;
	for(i=0; s[i]!='\0'; i++)
	{
		s2[i]=s[i];
	}
	s2[i]='\0';


}
int main()
{
	char s[100];
	char s2[100];
	scanf("%s",s);
	printf("%s",s);
	copy(s,s2);
	printf("\nsecond string:%s",s2);
	return 0;
}
