#include <stdio.h>

int main(void)
{
    int n=0;

    scanf("%d", &n);

    for(int i =0; i< n; i++)
    {
        for(int j=n-1; j >i; j--)
        {
            printf(" ");
        }
        for(int t=0; t<2*(i+1)-1; t++)
        {
            printf("*");
        }
        printf("\n");
    }
    return 0;
}