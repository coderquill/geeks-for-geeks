/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
  Print elements of a linked list on console 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  struct Node
  {
     int data;
     struct Node *next;
  }
*/
//https://practice.geeksforgeeks.org/problems/print-linked-list-elements/1
void display(struct Node *head)
{
   //add code here
   while(head->next!=NULL){
   printf("%d ",head->data);
   head=head->next;
   }
   printf("\n");
}
