#include<stdio.h>
int main()
{
 char str[100];
  	int i, len, flag;
  	flag = 0;
 
  	
  	gets(str);
  	
  	len = strlen(str);
  	 	   	
  	for(i = 0; i < len; i++)
	{
		if(str[i] != str[len - i - 1])
		{
			flag = 1;
			break;	
		} 
	}
	if(flag == 0)
	{
		printf("%s is a palindrome", str);
	}
	else
	{
		printf("%s is not a palindrome", str);
	}	 //Type your code here
  return 0;
}