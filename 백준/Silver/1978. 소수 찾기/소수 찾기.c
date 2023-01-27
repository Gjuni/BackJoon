#include <stdio.h>

int main(void)
{
    int n=0;
    int arr[100];
    int index=0;

    scanf("%d", &n);

    for(int i =0; i< n; i++)
    {
        scanf("%d", &arr[i]);
    }

    for(int i =0; i < n; i++)
    {
        int count=0;
        for(int j=1; j<=arr[i]; j++)
        {
            if(arr[i]%j == 0)
            {
                count++;
            }
        }
        if(count == 2)
        {
            index++;
        }
    }

    printf("%d", index);

    return 0;
}