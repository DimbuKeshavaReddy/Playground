#include<iostream>
#include<string>
using namespace std;
class Student
{
  public:
  string a;
  int b;
  int c;
  Student(string a,int b,int c)
  {
    this->a=a;
    this->b=b;
    this->c=c;
  }
  void display()
  {
    float d=(c/500.0)*100;
    cout<<"Name: "<<a<<endl;
    cout<<"Roll Number: "<<b<<endl;
    cout<<"Total: "<<c<<endl;
       cout<<"Percentage: "<<d<<endl;
  }
};
int main()
{
  string a;
  int b;
  int c;
  cin>>a>>b>>c;
  Student s(a,b,c);
  cout<<"Enter name:"<<endl;
    cout<<"Enter roll number:"<<endl;
    cout<<"Enter total marks outof 500:"<<endl;
  cout<<"Student details:"<<endl;
  
  s.display();
  
  //cout<<a<<b<<c;
}