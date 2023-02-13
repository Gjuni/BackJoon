#include <stdio.h>

int main(void)
{
    int arr[3][4] ={0};

    for(int i =0; i< 3; i++)
    {
        for(int j =0; j<4; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }

    for(int i =0; i< 3; i++)
    {
        int total =0;
        for(int j =0; j<4; j++)
        {
            total += arr[i][j];
        }
        if(total == 3)
        {
            printf("A\n");
        }
        else if(total == 2)
        {
            printf("B\n");
        }
        else if(total == 1)
        {
            printf("C\n");
        }
        else if(total == 4)
        {
            printf("E\n");
        }
        else if(total == 0)
        {
            printf("D\n");
        }
    }
    return 0;
}