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
void deleteatend()
{
    if (root==NULL)
        return ;
    else 
    {
        Node *temp=root;
        while(temp->next->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=NULL;
    }
    
}
void display()
{
    Node *t=root;
    while(t->next!=NULL)
    {
        cout<<t->data;
      cout<<endl;
        t=t->next;
    }
    cout<<t->data;
}

int main()
{
    int x;
    cin>> x;
  	int count =0;
    while(x>0)
    {
        insertatend(x);
        cin>> x;
      	count++;
    }
  	//cout<<"count value: "<<count<<endl;
  	cout<<"Before deletion:"<<endl;
  	
  	display();
  	int a=1;
    while(count>1)
    {
      	cout<<endl<<"After "<<a<<" deletion:"<<endl;
      	a++;
      	count--;
      	deleteatend();
      	display();
    }
  	cout<<endl<<"After "<<a<<" deletion:"<<endl;
  	cout<<"No value to delete"<<endl;
   
    return 0;
}