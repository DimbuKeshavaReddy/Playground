#include<iostream>
using namespace std;

int main()
{
  int n,x;
    cin>>n;
	int arr[n]; 
	for(int i=0;i<n;i++)
	{
	    cin>>arr[i];
	}
  x=(arr[n - 1] - arr[0]) / n;
  
  for(int i=0;i<n;i++)
  {
    if(arr[i]+x!=arr[i+1])
    {
      cout<<arr[i]+x;
      break;
    }
  }
  return 0;
}