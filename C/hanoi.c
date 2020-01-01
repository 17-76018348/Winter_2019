#include<stdio.h>
int cnt = 0;
void top_3(int beg, int end, int thd)
{

    printf("1 from:%d  to:%d\n",beg,end);
    printf("2 from:%d  to:%d\n",beg,thd);
    printf("1 from:%d  to:%d\n",end,thd);
    printf("3 from:%d  to:%d\n",beg,end);
    printf("1 from:%d  to:%d\n",thd,beg);
    printf("2 from:%d  to:%d\n",thd,end);
    printf("1 from:%d  to:%d\n",beg,end);
    cnt += 7;
}
void top_1(int bot ,int beg, int end)
{
    printf("%d from:%d  to:%d\n",bot,beg,end);
    cnt++;
}
void cal(int bot, int beg, int end, int thd)
{
    int num = 0;
    if(bot == 3)
        top_3(beg,end,thd);
    else
    {
        num = bot -1;        
        cal(num,beg,thd,end);
        top_1(bot,1,3);
        cal(num,thd,end,beg);
    }
}
int main(void)
{
    int layer = 0 ;
    scanf("%d",&layer) ;
    if(layer == 3)
    {
        top_3(1,3,2);
    }
    else 
    {
        cal(layer,1,3,2);
    }
    printf("cnt:%d\n",cnt);
    


    return 0 ;
}
