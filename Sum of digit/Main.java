#include<iostream>
using namespace std;
int main()
{
	//type your code here;
    int n,r,x=0;
    cin>>n;
    while(n>0)
    {
      r=n%10;
      x=x+r;
      n=n/10;
    }
  cout<<x;
    
	return 0;
}