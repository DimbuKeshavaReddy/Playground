#include<iostream>
#include<string>
using namespace std;
class Student
{
  public:
 // string a;
  int b;
 // int c;
  Student(int b)
  {
    //this->a=a;
    this->b=b;
   // this->c=c;
  }
  void display()
  {
    float d=3.14*b*b;
    cout<<"Area of Circle : "<<d<<endl;
    //cout<<b<<endl;
    //cout<<c<<"%"<<endl;
     //cout<<"Percentage: "<<d<<endl;
  }
};
int main()
{
  //string a;
  int b;
 // int c;
  cin>>b;
  Student r(b);
 cout<<"Enter the value of Radius :"<<endl;
   // cout<<"Enter roll number:"<<endl;
    //cout<<"Enter total marks outof 500:"<<endl;
  //cout<<"Student details:"<<endl;
  
  r.display();
  
  //cout<<a<<b<<c;
}