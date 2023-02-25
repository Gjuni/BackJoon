#include <stdio.h>

int arr[1000][10] ={0};
int result[1000][3] = {0};

int main(void)
{
    int t =0; // value of columns

    scanf("%d", &t);

    for(int i =0; i < t; i++)
    {
        for(int j =0; j< 10; j++)
        {
            scanf("%d", &arr[i][j]);
        }
    }

    for(int i =0; i< t; i++) // total columns count
    {
        for(int j =0; j<3; j++) // find third big number
        {
            int index = 0; 
            int max = arr[i][0];

            for(int h =0 ; h < 10; h++)
            {
                if(max < arr[i][h])
                {
                    max = arr[i][h];
                    index = h;
                }
            }
            if(j<2)
            {
                arr[i][index] = 0;
            }
            result[i][j] = index;
        }
        printf("%d\n", arr[i][result[i][2]]);
        
    }

    
    return 0;
}