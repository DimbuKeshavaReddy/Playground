#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int p,r,n;
  cin>>p>>r>>n;
  float i,a,d,fs;
  i=(p*r*n)/100;
  a=p+i;
  d=0.02*i;
  fs=a-d;
  cout<<i<<endl<<a<<endl<<d<<endl<<fs;//fill your code
}