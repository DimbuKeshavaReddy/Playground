#include <iostream>
using namespace std;
class Shape {
   public:
  Shape(int a)
  {
    width=a;
    cout<<"Base class constructor"<<endl;
  }
  virtual void getarea()=0;      
   protected:
      int width;
};
class Rectangle: public Shape {
   public:
      Rectangle(int a) : Shape(a)
      {
        cout<<"Derived class constructor"<<endl;
      }
      void getarea() { 
       cout<<"The given input is "<<width<<endl;
      }
};

int main(void) {
  int x;
  cin>>x;
   Rectangle Rect(x);
  Rect.getarea();
  
   return 0;
}