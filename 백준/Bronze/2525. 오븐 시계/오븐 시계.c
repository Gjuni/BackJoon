#include <stdio.h>

int main(void)
{
    int A=0, B=0;
    int min =0;

    scanf("%d %d", &A, &B);
    scanf("%d", &min);
    
    B = min + B;
    A = A + B/60;
    B = B%60;

    if(A > 23)
    {
        A = A - 24;
    }

    printf("%d %d",A ,B);
    
    
    return 0;
}