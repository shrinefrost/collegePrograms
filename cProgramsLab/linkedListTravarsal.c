#include<stdio.h>
#include<stdlib.h>


struct  Node
{   
    int data;
    struct Node *link;
};

int main()
{
    struct Node *head;
    struct Node *second;
    struct Node *third;

    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));

    head->data = 44;
    head->link = second;

    second->data = 44;
    second->link = third;

    third->data = 44;
    third->link = NULL;

    printf("compiled");

        return 0;
}