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
// Driver code 
int main() 
{ 
//    int arr[] = {}
    
    int arr[SIZE];
	int i = 0;
	int numOfElements = 0;
	int input = 0;
	
cout << "Before inserting the value:"<<endl;
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
  cout<<"Enter the position and value to be inserted:"<<endl;
  
    int x ; 
  
    // position at which element is to be inserted 
    int pos;
  cin>>pos>>x;
    cout<<"After inserting the value:";

    // Insert x at pos 
    insertX(n, arr, x, pos); 
  
    // print the updated array 
    for (i = 0; i < n + 1; i++) 
        cout << "\n"<<arr[i]; 
    cout << endl; 

    return 0; 
}
