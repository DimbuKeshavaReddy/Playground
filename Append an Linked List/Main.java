#include<iostream>
using namespace std;
class Node 
{
    public:
    int data;
    Node *next;
};

Node *root=NULL;
void insertatend(int x)
{
    Node *t=new Node();
    t->data=x;
    t->next=NULL;
      if (root==NULL)
    {
        root=t;
    }
    else 
    {
        Node *temp=root;
    while(temp->next!=NULL)
    {
        temp=temp->next;
    }
    temp->next=t;
    
    }
    
}
/* void insertatbegin(int x)
{
    Node *t=new Node();
    t->data=x;
    t->next=NULL;
    if (root==NULL)
    {
        root=t;
    }
    else 
    {
        t->next=root;
        root=t;
    }
}*/

void display()
{
    Node *t=root;
    while(t->next!=NULL)
    {
        cout<<t->data;
      cout<<"\n";
        t=t->next;
    }
    cout<<t->data;
}

int main()
{
    int x;
    cin>> x;
    while(x>0)
    {
        insertatend(x);
        cin>> x;
    }
    display();
    return 0;
}
