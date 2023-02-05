#include <stdio.h>
#include <math.h>

int main(void)
{
    int upper_num =0, lower_num =0;
    int lower_arr[3] ={0};
    int total =0;
    int arr[3] = {0};
    
    scanf("%d", &upper_num);
    scanf("%d", &lower_num);


    for(int i =0; i < 3; i++)
    {
        lower_arr[i] = lower_num%10; 
        lower_num = lower_num/10; 
    }
    for(int i =0; i< 3; i++)
    {
        arr[i] = lower_arr[i]*upper_num;
        printf("%d\n", arr[i]);
        arr[i] = arr[i]*pow(10,i);
        total += arr[i];
    }

    printf("%d\n", total);


    return 0;
}