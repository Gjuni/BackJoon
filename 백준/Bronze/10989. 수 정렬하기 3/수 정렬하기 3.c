#include <stdio.h>

int main(void)
{
    int arr[10000] ={0};
    int n=0;

    scanf("%d", &n);

    for(int i =0; i<n; i++)
    {
        int index =0;

        scanf("%d", &index);
        arr[index-1] ++;
    }

    for(int i =0; i< 10000; i++)
    {
        for(int j= 0; j< arr[i]; j++)
        {
            printf("%d\n", i+1);
        }
    }
    
    return 0;
}