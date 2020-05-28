#include<iostream>
using namespace std;
int main()
{
  int n,x,c=0;
    cin>>n;
	int arr[n]; 
	for(int i=0;i<n;i++)
	{
	    cin>>arr[i];
      if(arr[i]==1)
        c++;
	}
  cout<<"Count of 1's in given array is "<<c;
  return 0;
}
  