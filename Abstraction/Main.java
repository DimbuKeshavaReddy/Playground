#include<iostream>
using namespace std;
class Face
{
  private:
  int a,b;
  public:
  Face(int a, int b)
  {
    this->a=a;
    this->b=b;
  }
  void display()
  {
     cout <<"a = "<<a<<endl;
     cout <<"b = "<<b;
  }
};


int main()
{
  int a,b;
  cin>>a>>b;
  Face obj=Face(a,b);
  obj.display();
  return 0;
}