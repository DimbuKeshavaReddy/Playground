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
void removeDuplicates(struct Node *start) 
{ 
    struct Node *ptr1, *ptr2, *dup; 
    ptr1 = start; 
  
    /* Pick elements one by one */
    while (ptr1 != NULL && ptr1->next != NULL) 
    { 
        ptr2 = ptr1; 
  
        /* Compare the picked element with rest 
           of the elements */
        while (ptr2->next != NULL) 
        { 
            /* If duplicate then delete it */
            if (ptr1->data == ptr2->next->data) 
            { 
                /* sequence of steps is important here */
                dup = ptr2->next; 
                ptr2->next = ptr2->next->next; 
                delete(dup); 
            } 
            else /* This is tricky */
                ptr2 = ptr2->next; 
        } 
        ptr1 = ptr1->next; 
    } 
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
    cout<<"Linked list before removal of duplicates\n";
  int n = numOfElements; 
    Node* start = arrayToList(arr, n); 
    display(start); 
  cout<<"Linked list after removal of duplicates\n";
  removeDuplicates(start); 
      display(start); 
    return 0; 
}
