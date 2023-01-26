#include <stdio.h>

int main(void)
{
    int num;
    int arr[1000];
    double total=0;

    scanf("%d", &num);


    for(int i =0; i< num; i++)
    {
        scanf("%d", &arr[i]);
    }

    int max=0;

    for(int i =0; i< num; i++)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }

    for(int i =0; i< num; i++)
    {
        total+= (double)arr[i]/(double)max*100;
    }

    printf("%.8f", total/num);

    return 0;
}