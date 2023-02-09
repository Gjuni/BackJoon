#include <stdio.h>

int main(void)
{
    int arr[9][9] ={0};
    int max =0;
    int column=0, row=0;

    for(int i =0; i < 9; i++)
    {
        for(int j=0; j < 9; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }
    max = arr[0][0];

    for(int i =0; i < 9; i++)
    {
        for(int j=0; j < 9; j++)
        {
            if(max < arr[i][j])
            {
                max = arr[i][j];
                column = i;
                row = j;
            }
        }
    }

    printf("%d\n%d %d", max, column+1, row+1);



    return 0;
}