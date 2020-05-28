#include<iostream>
#include<string>
using namespace std;
class Student
{
  public:
  int a;
  int b;
  int c;
  Student(int a,int b,int c)
  {
    this->a=a;
    this->b=b;
    this->c=c;
  }
};
int main()
{
  int a;
  int b;
  int c,d,e,f,m,s;
  cin>>a>>b>>c>>d>>e>>f;
  Student s1(a,b,c);
  Student s2(d,e,f);
  cout<<"Enter time:"<<endl;
  cout<<"Hours :\nMinutes :\nSeconds :"<<endl;
  cout<<"Enter time:"<<endl;
  cout<<"Hours :\nMinutes :\nSeconds :"<<endl;
  int h=s1.a+s2.a;
  m=s1.b+s2.b;
  s= s1.c+s2.c;
  if (s>60)
  {
    int x=s/60;
    s=s-x*60;
    m=m+x;
  }
  if (m>60)
  {
    int y=m/60;
    m=m-y*60;
    h=h+y;
  }
  
cout<<"Time after add: "<<h<<":"<<m<<":"<<s;
  
  
  //cout<<a<<b<<c;
}