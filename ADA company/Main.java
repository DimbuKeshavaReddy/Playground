#include<iostream>
using namespace std;
int main()
{
  int x;
  cin>>x;
  try
  {
    if(x<50)
      throw "first round not cleared";
    else
      cout<<"first round cleared\neligible for second round"<<endl;
  }
  catch (const char* msg)
  {
     cout << msg <<endl;
  }
   //Type your code here..
}