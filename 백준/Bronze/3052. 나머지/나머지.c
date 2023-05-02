#include <stdio.h>

int main(void)
{
    int count =0;
    int arr_first[10] = {0,};
    int arr_left[10] = {0,};

    for(int i =0; i < 10; i++)
    {
        scanf("%d", &arr_first[i]);
    }
    for(int i =0; i< 10; i++)
    {
        arr_left[i] = arr_first[i]%42;
    }

    for(int i =0; i< 10; i++)
    {
        for(int j =0; j < 10; j++)
        {
            if(i != j)
            {
                if(arr_left[i] == arr_left[j])
                {
                    arr_left[j] = -1;
                }
            }
        }
    }

    for(int i =0; i< 10; i++)
    {
        if(arr_left[i] >= 0)
        {
            count +=1;
        }
    }

    printf("%d", count);
    return 0;
}