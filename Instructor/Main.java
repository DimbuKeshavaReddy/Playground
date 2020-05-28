#include<iostream>
#include<string>
using namespace std;
int main()
{
   //Type your code here..
  int n,id,i;
  string name,subname,tcname,depname;
  cin>>n;
  cout<<"Enter No. of Instructor Details You Want :\n";
  for(i=0;i<n;i++)
  {
    cout<<"Enter Id  :\nEnter Name :\nEnter Subject Name :\nEnter Teacher Name :\nEnter Department Name :\n";
  }
   for(i=0;i<n;i++)
  {
     cin>>id>>name>>subname>>tcname>>depname;
     cout<<"Id :  "<<id<<endl;
     cout<<"Name :  "<<name<<endl;
     cout<<"Subject Name  :  "<<subname<<endl;
     cout<<"Teacher Name  :  "<<tcname<<endl;
     cout<<"Department Name :  "<<depname<<endl;
   }
}