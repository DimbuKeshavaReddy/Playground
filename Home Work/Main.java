#include <iostream>
using namespace std;

double division(int a, int b) {
   if( b == 0 ) {
      throw "Division by zero Exception";
   }
   return (a/b);
}

int main () {
   int x,y;
  //cout<<"Enter two numbers:\n";
  cin>>x>>y;
  double z;
 
   try 
   {
      z = division(x, y);
      cout<<z << endl;
   } 
  catch (const char* msg) {
     cout << msg << endl;
   }

   return 0;
}