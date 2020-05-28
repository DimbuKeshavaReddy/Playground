#include <iostream>
#include <stdio.h>
using namespace std;
int main () {
   float x,y;
  //cout<<"Enter two numbers:\n";
  cin>>x>>y;
  double z;
 
   try 
   {
       if( y== 0 )
       {
      throw "Exception occurred\nMath error: Attempted to divide by Zero";
        }
       else
       {
         float a= 1.0*y;
         z=x/a;
     cout << "The quotient is "<<float(x/a)<< endl;
         //printf("a/b = %.1f",x/a);
   }
   }
  catch (const char* msg) 
  {
     cout << msg << endl;
   }

   return 0;
}