#include <stdio.h>

int main(void)
{
    int dice[3] = {0};
    int max =0;
    int score =0;

    scanf("%d %d %d", &dice[0], &dice[1], &dice[2]);

    if(dice[0] == dice[1] && dice[0] == dice[2] && dice[1] == dice[2])
    {
        score = 10000 +(dice[0]*1000);
    }
    else if(dice[0] == dice[1] && dice[0] != dice[2]&& dice[1] != dice[2])
    {
        score = 1000 + (dice[0]*100);
    }
    else if(dice[0] != dice[1] && dice[0] == dice[2] && dice[1] != dice[2])
    {
        score = 1000 + (dice[0]*100);
    }
    else if(dice[0] != dice[1] && dice[0] != dice[2]&& dice[1] == dice[2])
    {
        score = 1000 + (dice[1]*100);
    }
    else if(dice[0] != dice[1] && dice[0] != dice[2] && dice[1] != dice[2])
    {
        for(int i = 0; i<3; i++)
        {
            if(max < dice[i])
            {
                max = dice[i];
            }
        }
        score = max * 100;
    }

    printf("%d", score);

    return 0;
}