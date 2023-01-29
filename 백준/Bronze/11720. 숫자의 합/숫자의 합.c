#include <stdio.h>

int main(void)
{
    int n =0;
    int total=0;

    scanf("%d",&n);

    char num[n];

    for(int i =0; i<n; i++)
    {
        scanf(" %c", &num[i]);
        total += num[i] -'0';
    }

    printf("%d", total);

    return 0;
}