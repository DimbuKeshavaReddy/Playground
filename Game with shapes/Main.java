#include<iostream>
using namespace std;
int main()
{
  int r,s;
  cin>>r>>s;
  float a,b;
  a=2*r;
  b=s;
  if( a>b )
    cout<<"circle cannot be inside a square";
  else
    cout<<"circle can be inside a square";
}