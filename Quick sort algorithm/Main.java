#include<iostream>
using namespace std;

void swap(int* a, int* b) 
{ 
	int t = *a; 
	*a = *b; 
	*b = t; 
} 

int partition(int a[], int l, int h) 
{ 
    int pi=a[h];
    int i=(l-1);
    for(int j=l;j<=h-1;j++)
    {
        if(a[j]<=pi)
        {
            i++;
            swap(&a[i],&a[j]);
        }
       
    }
     swap(&a[i+1],&a[h]);
     return i+1;
} 
  
void quickSort(int arr[], int l, int r) 
{ 
    int pi;
    if (l < r) 
    { 
  
        pi=partition(arr, l, r); 
        quickSort(arr,l,pi-1); 
        quickSort(arr, pi+1, r); 
  
    } 
} 

int main()
{
  int n,x;
    cin>>n;
	int arr[n]; 
	for(int i=0;i<n;i++)
	{
	    cin>>arr[i];
	}
	
	quickSort(arr,0,n-1);
	for(int i=0;i<n;i++)
	{
	    cout<<arr[i]<<" ";
	}
	
	return 0;
	
}