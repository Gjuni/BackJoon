#include <stdio.h>

int main(void)
{
    int people[2] ={0};
    int news[5] ={0};

    int result[5] ={0};

    scanf("%d %d", &people[0], &people[1]);

    int total_people = (people[0] * people[1]);

    for(int i =0; i< 5; i++)
    {
        scanf("%d", &news[i]);
        result[i] = news[i] - total_people;
    }
    for(int i =0; i< 5; i++)
        printf("%d ", result[i]);
    

    return 0;
}