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
void deleteatbegin()
{
    Node *temp=root;
    root=root->next;
    delete temp;
}

void deleteatend()
{
     Node *temp=root;
    // Node *x;
    while(temp->next->next!=NULL)
    {
        temp=temp->next;
    }
    delete temp->next;
   temp->next=NULL;
} 
 void insertatbegin(int x)
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
}

void display()
{
  if(root==NULL)
    cout<<"No value to delete";
  else
  {
    Node *t=root;
    while(t->next!=NULL)
    {
        cout<<t->data<<"\n";
        t=t->next;
    }
    cout<<t->data<<endl;
}
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
    //display();
  cout<<"Before deletion:"<<endl;
  display();
  int i=1;
  while(root !=NULL)
  {
    cout<<"After "<< i <<" deletion:"<<endl;
    deleteatbegin();
    display();
    i++;
  }
 // cout<<"No value to delete";
    return 0;
}
