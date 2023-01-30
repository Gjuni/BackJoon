#include <stdio.h>

int arr[10000] = {0};

int main(void)
{
    int length =0, lowNumber =0;

    scanf("%d %d", &length, &lowNumber);

    for(int i =0; i< length; i++)
    {
        scanf("%d", &arr[i]);
    }

    for(int i =0; i< length; i++)
    {
        if(arr[i] < lowNumber)
        {
            printf("%d ", arr[i]);
        }
    }

    return 0;
}