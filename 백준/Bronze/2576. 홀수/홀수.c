#include <stdio.h>

int main(void)
{
    int arr[7] = {0};
    int total =0, min=999999999;

    for(int i =0; i< 7; i++)
    {
        scanf("%d", &arr[i]);
    }

    for(int i =0; i< 7; i++)
    {
        if(arr[i]%2 != 0)
        {
            total += arr[i];
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
    }
    
    if(total != 0)
    {
        printf("%d\n%d", total, min);
    }
    else if(total == 0)
    {
        printf("%d", -1);
    }
    return 0;
}