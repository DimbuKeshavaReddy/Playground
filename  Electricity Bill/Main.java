#include<iostream>
#include<string>
#include<cmath>
using namespace std;
int main()
{
  int a,b;
  string c;
  cin>>b>>c>>a;
  cout<<b<<endl;
  cout<<c<<endl;
  cout<<a<<endl;
  if(a<=100)
    cout<<floor(a*1.20);
  else if (a<=300)
    cout<<floor(((a-100)*2)+100*1.20);
   else 
     cout<<floor(((a-100)*3)+100*1.20);
 
    

    
    
	return 0;
}