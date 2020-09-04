/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>

int main()
{
    long num;
    scanf("%ld",&num);
    int temp=num;
    int sum=0;
     while (temp > 0 || sum > 9)  
        { 
            if (temp == 0) { 
                temp = sum; 
                sum = 0; 
            } 
            sum += temp % 10; 
            temp/= 10; 
        } 
    printf("%d",sum);
    

    return 0;
}
