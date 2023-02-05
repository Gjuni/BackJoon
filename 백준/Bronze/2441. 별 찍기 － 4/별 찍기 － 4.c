#include <stdio.h>

int main(void)
{
    int n =0;
    scanf("%d", &n);

    for(int i =n; i >=0; i--)
    {
        for(int j = n-1; j >= i; j--)
        {
            printf(" ");
        }
        for(int t =0; t<i; t++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}