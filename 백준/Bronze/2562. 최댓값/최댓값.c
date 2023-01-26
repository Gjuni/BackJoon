#include <stdio.h>

int main(void)
{
    int array[9];
    int index;

    for(int i =0; i< 9; i++)
    {
        scanf("%d", &array[i]);
    }
    int max= 0;

    for(int i =0; i< 9; i++)
    {
        if(array[i] > max)
        {
            max = array[i];
            index = i;
        }
    }
    printf("%d\n%d", max, index+1);

    return 0;
}