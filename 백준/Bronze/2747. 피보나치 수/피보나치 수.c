#include <stdio.h>

int main(void)
{
    int n =0; 

    scanf("%d", &n);

    int a =0;
    int b =1;
    int c = 0;

    for(int i =1; i< n; i++)
    {
        c = a + b;
        a = b;
        b = c;
    }

    printf("%d", b);

    return 0;
}