#include <stdio.h>
#include <math.h>

int arr[1000][3]={0};

int main(void)
{
    int column = 0;

    while(1)
    {   
        scanf("%d %d %d", &arr[column][0], &arr[column][1], &arr[column][2]);

        if(arr[column][0] == 0 && arr[column][1] == 0 && arr[column][2] == 0)
        {
            break;
        }
        column ++;
    }

    int num = column;
    column =0;

    while(num != column)
    {
        int max = 0;
        int index=0;
        int total =0;
        int total2 = 0;

        for(int i =0; i < 3; i++)
        {
            if(max < arr[column][i])
            {
                max = arr[column][i];
                index = i;
            }
        }

        for(int i =0; i< 3; i++)
        {
            if(i == index)
            {
                total = pow(max, 2);
            }
            else
            {
                total2 += pow(arr[column][i],2);
            }
        }

        if(total == total2)
        {
            printf("right\n");
        }
        else if(total != total2)
        {
            printf("wrong\n");
        }
        column++;
    }

    return 0;
}