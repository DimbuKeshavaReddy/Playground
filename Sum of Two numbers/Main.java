#include<iostream>
using namespace std;
class A
{
  public:
  int a;
};
class B : public A
{
  public:
  int b;
  void display()
  {
  cout<<"The sum of two numbers: "<<a+b;
  }
  
};
int main()
{
  int x,y;
  cin>>x>>y;
  B s;
  s.a=x;
  s.b=y;  
 cout<<"Enter the integer value of class A:\nEnter the integer value of class B:\n";
   s.display();
     //Type your code here..
}