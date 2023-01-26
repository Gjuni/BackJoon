#include <stdio.h>

int main(void)
{
    int num[3];
    int total=1;
    int array[10] = {0};
    int index=0;

    for(int i =0; i< 3; i++)
    {
        scanf("%d", &num[i]);
        total *= num[i];
    }

    while(1)
    {
        if(total%10 == 0)
        {
            array[0] += 1;
        }
        else if(total%10 == 1)
        {
            array[1] += 1;
        }
        else if(total%10 == 2)
        {
            array[2] += 1;
        }
        else if(total%10 == 3)
        {
            array[3] += 1;
        }
        else if(total%10 == 4)
        {
            array[4] += 1;
        }
        else if(total%10 == 5)
        {
            array[5] += 1;
        }
        else if(total%10 == 6)
        {
            array[6] += 1;
        }
        else if(total%10 == 7)
        {
            array[7] += 1;
        }
        else if(total%10 == 8)
        {
            array[8] += 1;
        }
        else if(total%10 == 9)
        {
            array[9] += 1;
        }
        total = total/10;

        if(total < 1)
        {
            break;
        }
    }

    for(int i =0; i< 10; i++)
    {
        printf("%d\n", array[i]);
    }
    
    return 0;
}