#include <stdio.h>
#include <stdbool.h>
#include<string.h>
#define MAX_STACK_SIZE 1000
bool IsEmpty(int top){
    if(top <0)
        return true;
    else
        return false;
}

bool IsFull(int top){
    if(top>=MAX_STACK_SIZE-1)
        return true;
    else
        return false;
}
void push(int* top,int value,int stack[]){
    if(IsFull(*top)==true)
        printf("스택 full");
    else
        stack[++(*top)] = value;
}
int pop(int* top, int stack[]){
    if(IsEmpty(*top)==true)
        printf("스택 empty");
    else 
        return stack[(*top)--];
}
bool check(char *list){
    int i;
    int cnt = 0;
    int top = -1;
    int target_data;
    int stack[MAX_STACK_SIZE];
    for(i = 0;i<strlen(list);i++){
        
        if(list[i+1] == '"')
        {
            if(cnt >= 1)
                cnt = 0;
            else
                cnt++;
        }
        else if(cnt >= 1)
            continue;
        else if(list[i+1]=='(' || list[i+1]=='{' || list[i+1]=='[')
            push(&top,list[i+1],stack);
        else if(list[i+1]==')' || list[i+1]=='}' || list[i+1]==']')
        {
            if(IsEmpty(top) == true)
                return false;
            else
            {
                target_data = pop(&top,stack);
                if((target_data == '(' && list[i+1] != ')') ||
                   (target_data == '{' && list[i+1] != '}') ||
                   (target_data == '[' && list[i+1] != ']'))
                    {
                        return false;
                    }
            }
        }
        
     }
    if(IsEmpty(top) == true)
        return true;
    else
        return false;
}


int main(void)
{
    char* list = "asdad{fvewve[fevsdvesfvsvevsd]vdvd}v(fv";
    printf("%d",check(list));
    return 0;
}

