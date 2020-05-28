
#include<iostream>
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
    temp->next = (*root); 
    (*root)=temp;
  
    
    
} 
  
void display(Node* root) 
{ 
    while (root != NULL) { 
        cout << root->data <<endl; 
        
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
  
// Driver code 
int main() 
{ 
//    int arr[] = {}
    
    int arr[SIZE];
	int i = 0;
	int numOfElements = 0;
	int input = 0;
	
//cout << "Type #s. 'x' to stop: ";
	cin >> input;
	
	while((input > 0))
	{	numOfElements++;
		arr[i] = input;
		i++;
		cin >> input;
		
	}
    
  int n = numOfElements; 
    Node* root = arrayToList(arr, n); 
    display(root); 
    return 0; 
}
