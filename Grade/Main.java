#include<iostream>
#include<string>
using namespace std;
class Student
{
  public:
  string name,grade,gen;
  int age,total;
  Student(string n, string g,string ge, int a,int t)
  {
    name=n;
    grade=g;
    gen=ge;
    age=a;
    total=t;
  }
  
};
class Child: public Student
{
  public:
  Child(string n, string g,string ge, int a,int t):Student( n, g, ge, a, t)
  {
  
  }
  void display()
  {
  float per=(total/500.0)*100;
     cout<<"Name: "<<name<<endl;  
      cout<<"Age: "<<age<<endl; 
      cout<<"Gender: "<<gen<<endl; 
      cout<<"Total Marks: "<<total<<endl; 
      cout<<"Percentage: "<<int(per)<<endl; 
       cout<<"Grade: "<<grade<<endl;  
  }
};

int main()
{
  string name,grade,gen;
  int age,total;
  cin>>name>>age>>gen>>total>>grade;
  cout<<"Enter student's basic information:\nName:\nAge:\nGender:\n\n";
 cout<<"Enter student's result information:\nTotal Marks:\nGrade:\n";
  Child obj=Child(name,grade,gen,age,total);
  obj.display();
  //Type your code here...
}