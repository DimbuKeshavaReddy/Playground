#include<iostream>
#include<string>
using namespace std;
int main()
{
  int acno,bal,dep,withd;
  string name,actype;
  cin>>acno>>name>>actype>>bal>>dep>>withd;
  cout<<"Enter Details:\nAccout No:\nName:\nAccount Type:\nBalance:\nEnter Deposit Amount =\nEnter Withdraw Amount ="<<endl;
  if((bal+dep-withd)<0)
  {
    cout<<"Cannot Withdraw Amount"<<endl;
  }
  cout<<"Accout No: "<<acno<<endl;
  cout<<"Name: "<<name<<endl;
  cout<<"Account Type: "<<actype<<endl;
  cout<<"Balance: "<<bal+dep-withd<<endl;
}