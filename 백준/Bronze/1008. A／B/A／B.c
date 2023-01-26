#include <stdio.h>

int main(void)
{
    int a,b;
    double total=0;

    scanf("%d %d", &a, &b);

    total = (double)a/(double)b;

    printf("%.16lf", total);
    return 0;
}