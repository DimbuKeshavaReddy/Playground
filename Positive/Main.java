#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  try
  {
    if(x<0)
      throw "Exception Caught as ";
  }
  catch (const char* msg)
  {
     cout << msg <<x<< endl;
  }
   //Type your code here..
}