#include <stdio.h>

int arr[1000][2];

int main(void)
{
    int index=0;
    while(1)
    {
        scanf("%d %d", &arr[index][0], &arr[index][1]);

        if(arr[index][0] == 0 && arr[index][1] == 0)
        {
            break;
        }
        index++;
    }

    for(int i =0; i< index; i++)
    {
        printf("%d\n", arr[i][0]+arr[i][1]);
    }

    return 0;
}