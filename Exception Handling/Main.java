#include<iostream>
using namespace std;
int main()
{
  int a,b;
  float y,c;
  char x;
  try
  {
    cin>>a;
    if(a==0)
    {
      throw "Bad Operation";
    }
    cin>>x;
    if(!((x=='+')||(x=='-')||(x=='*')||(x=='/')))
    {
      throw "It is not a Valid Operator";
    }
    else
    {
      cin>>b;
      if(b==0)
        {
      throw "Bad Operation";
        }
      else
      {
      
      if(x=='+')
        c=a+b;
      if(x=='-')
        c=a-b;
      if(x=='*')
        c=a*b;
      if(x=='/')
      {
          y=1.0*b;
          c=a/y;
      }
      cout<<a<<" "<<x<<" "<<b<<" = "<<c;
    }
    }    
  }
  catch (const char* msg) 
  {
     cerr << msg << endl;
  }
	return 0;
}