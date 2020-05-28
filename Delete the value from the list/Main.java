#include<iostream>
#include<stdlib.h>
using namespace std;
const int SIZE = 100;

struct Node { 
    int data; 
    Node* next; 
}; 
  
// Function to insert node 
void insert(Node** root, int item) 
{ 
    Node* temp = new Node; 
    Node* ptr; 
    temp->data = item; 
    temp->next = NULL; 
  
    if (*root == NULL) 
        *root = temp; 
    else { 
        ptr = *root; 
        while (ptr->next != NULL) 
            ptr = ptr->next; 
        ptr->next = temp; 
    } 
} 
  
void display(Node* root) 
{ 
    while (root != NULL) { 
        cout << root->data<<"\n"; 
        root = root->next; 
    } 
} 
  
Node *arrayToList(int arr[], int n) 
{ 
    Node *root = NULL; 
    for (int i = 0; i < n; i++) 
        insert(&root, arr[i]); 
   return root; 
} 
  int* insertX(int n, int arr[], 
             int x, int pos) 
{ 
    int i; 
  
    // increase the size by 1 
    n++; 
  
    // shift elements forward 
    for (i = n; i >= pos; i--) 
        arr[i] = arr[i - 1]; 
  
    // insert x at pos 
    arr[pos - 1] = x; 
  
    return arr; 
} 
void deleteNode(Node **head_ref, int pos)
{
    //
   if (*head_ref == NULL)
   {
      return;
   }
   //temp to store head
   struct Node* temp = *head_ref;
   //Delete head node
    if (pos == 0)
    {
        *head_ref = temp->next; 
        free(temp);               
        return;
    }
    //store previous of to be deleted node
    for (int i=0; temp!=NULL && i<pos-1; i++)
    {
        temp = temp->next;
    }
    if (temp == NULL || temp->next == NULL)
    {
        return;
    }
    //delete node at pos (next of pos-1)
    struct Node *next = temp->next->next;
    free(temp->next);  
    temp->next = next; 
}
int main() 
{ 
//    int arr[] = {}
    
    int arr[SIZE];
	int i = 0;
	int numOfElements = 0;
	int input = 0;
	
cout << "Before deletion:"<<endl;
	cin >> input;
	
	while((input > 0))
	{	numOfElements++;
		arr[i] = input;
		i++;
		cin >> input;
	//	cout<<"\n";
	}
    
  int n = numOfElements; 
    Node* root = arrayToList(arr, n); 
    display(root); 


    int k;
   cout<<"Enter the value to be deleted:"<<endl;
   cin>>k;
    //delete node at pos k
    deleteNode(&root, k-1);
    

    cout<<"After deletion:\n";
    display(root);
   
  //cout<<"No value to delete";
    return 0; 
}
