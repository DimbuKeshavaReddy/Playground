#include <iostream>
using namespace std;

double division(int a, int b)
{
  float x;
   if( b == 0 ) 
   {
      throw "Exception: Division by zero";
   }
  else
    x=1.0*b;
   return (a/x);
}

int main () {
   int x,y;
  cout<<"Enter two numbers:\n";
  cin>>x>>y;
  double z;
 
   try 
   {
      z = division(x, y);
      cout << "a/b = "<<z << endl;
   } 
  catch (const char* msg) {
     cout << msg << endl;
   }

   return 0;
}