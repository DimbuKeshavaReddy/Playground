#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e;
  cin>>a>>b>>c;
  d=(b/100.0)*a;

  e=(c/100.0)*(a-d);
  cout<<d<<endl<<e<<endl<<(a-d-e)/3;
  
}