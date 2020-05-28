#include<iostream>
using namespace std;
class Shape
{
  public:
  int a;
  virtual void area()=0;
   void set(int w) 
   {
     //cout<<"vsde";
         a = w;
    }
}; 
class Rec : public Shape
{
public:
void area()
{
cout<<"Rectangle"<<endl;
cout<<"The given input is "<<a<<endl;
}
};
class Cir : public Shape
{
public:
void area()
{
cout<<"Circle"<<endl;
cout<<"The given input is "<<a<<endl;
}
};
int main()
{
  int x;
  cin>>x;//Type your code here
  Rec obj;
  Cir ob;
  obj.set(x);
  obj.area();
   ob.set(x);
  ob.area();
  return 0;
}