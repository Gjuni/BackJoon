#include <stdio.h>

int main(void)
{
    int num1;
    scanf("%d", &num1);

    if(num1 >= 90 && num1 <= 100)
    {
        printf("A");
    }
    else if(num1 >= 80 && num1 <= 89)
    {
        printf("B");
    }
    else if(num1 >= 70 && num1 <= 79)
    {
        printf("C");
    }
    else if(num1 >= 60 && num1 <= 69)
    {
        printf("D");
    }
    else
    {
        printf("F");
    }
}