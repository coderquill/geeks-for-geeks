#include<stdio.h>
#include<stdlib.h>
struct node{
        int data;
        struct node *next;
        };

int main(){
        struct node *head=NULL,*second=NULL,*third=NULL;
        printf("enter the data\n");
	head=(struct node *)malloc(sizeof(struct node));
	second=(struct node *)malloc(sizeof(struct node));
	third=(struct node *)malloc(sizeof(struct node));

                scanf("%d",&head->data);
                head->next=second;
                scanf("%d",&second->data);
                second->next=third;
                scanf("%d",&third->data);
                third->next=NULL;
                printf("\n%d",head->data);
                 printf("\n%d",second->data);
                 printf("\n%d",third->data);
        return 0;
        }                
