#include <stdio.h>
int main()
{
   int i,j,size;
    //2
    
    scanf("%d",&size);
    
    //3
    for(i=0; i < size ;i++)
    {
        //4
        for(j=0; j < size ;j++)
        {
            //5
            if(i==j || j==(size-i-1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        //6
        printf("\n");
    }
  
	// Type your code here
	return 0;
}