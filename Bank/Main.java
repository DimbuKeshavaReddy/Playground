#include<iostream>
#include <string>
using namespace std;
class Bank
{
  public:
  int a,b,c,d;
  string e, f;
  Bank(int a, int b, int c, int d, string e, string f)
  {
    this->a=a;
    this->b=b;
    this->c=c;
    this->d=d;
    this->e=e;
    this->f=f;
  }
  void display()
  {
    if(b+c < d)
    {
      cout<<"Cannot Withdraw Amount"<<endl;
    }
    cout<<"Accout No. : "<<a<<endl;
    cout<<"Name : "<<e<<endl;
    cout<<"Account Type : "<<f<<endl;
    cout<<"Balance : "<<b+c-d<<endl;
  }
  
};
int main()
{
  int a,b,c,d;
  string e,f;
  cout<<"Enter Details:\nAccount No.\nName :\nAccount Type :\nBalance :\nEnter Deposit Amount =\nEnter Withdraw Amount =\n";
  cin>> a>>e>>f>>b>>c>>d;
  Bank x(a,b,c,d,e,f);
  x.display();
  //Type your code here...
}