#include <iostream> 
using namespace std; 

int main(){
    int n,i=1,sum=0;
    cin >> n;
       while(i<n){
       if(n%i==0)
       sum=sum+i;
       i++; 
}
 
if(sum==n)
    cout << "Yes"; 
else
    cout <<"No";
return 0;
}