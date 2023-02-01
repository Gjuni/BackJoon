#include <stdio.h>
#include <string.h>

char arr[1000000];

int main(void)
{
    scanf("%[^\n]s", arr);

    int length = strlen(arr);
    int num=0;

    for(int i =0; i< length; i++)
    {
        if(arr[i] == 32)
        {
            num++;
        }
    }

    if(arr[0] == 32 && arr[length-1] ==32)
    {
        num -= 2;
    }
    else if(arr[0] == 32 || arr[length-1] ==32)
    {
        num -= 1;
    }
    printf("%d", num+1);

    return 0;
}