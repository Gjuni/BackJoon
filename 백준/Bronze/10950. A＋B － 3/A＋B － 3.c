#include <stdio.h>


int main(void)
{
    int arr[100][2]={0};
    int n;
    int arr2[100] ={0};
    
    scanf("%d", &n);

    for(int i =0; i< n; i++)
    {
        scanf("%d %d", &arr[i][0], &arr[i][1]);
        arr2[i] = arr[i][0] + arr[i][1];
    }

    for(int i =0; i < n; i++)
    {
        printf("%d\n", arr2[i]);
    }
    return 0;
}