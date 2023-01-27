#include <stdio.h>

int main(void)
{
    int arr[1000000];
    int n;
    int max;
    int min;

    scanf("%d", &n);

    for(int i =0; i<n; i++)
    {
        scanf("%d", &arr[i]);
    }

    max = arr[0];
    min = arr[0];

    for(int i =0; i< n; i++)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
        else if(arr[i] < min)
        {
            min = arr[i];
        }
    }

    printf("%d %d", min, max);
    return 0;
}