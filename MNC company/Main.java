#include <iostream>
#include <stdio.h>
using namespace std;
int main () {
   int x,y;
  cout<<"Enter two numbers:\n";
  cin>>x>>y;
  double z;
 
   try 
   {
       if( y== 0 )
       {
      throw "Exception: Division by zero";
        }
       else
       {
         float a= 1.0*y;
         z=x/a;
         if(z<1)
         {
           cout<<"Exception: Division is less than 1";
         }
         else
         {
     cout << "a/b = "<<float(x/a)<< endl;
         //printf("a/b = %.1f",x/a);
        } 
   }
   }
  catch (const char* msg) 
  {
     cout << msg << endl;
   }

   return 0;
}