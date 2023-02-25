#include <stdio.h>

int main(void)
{
    int A, B;

    scanf("%d %d", &A, &B);

    int total = A*B;

    printf("%d", total-1);
    return 0;
}