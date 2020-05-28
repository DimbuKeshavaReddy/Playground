#include<bits/stdc++.h>
using namespace std;

bool isChar(char a){
	if (a=='+'||a=='-'||a=='*'||a=='/'){
		return true;
	}
	return false;
}
bool solve(string arr,int lenght){
	stack<char> st; 
    for (int aaa=0;aaa<lenght;aaa++) { 
 
        if (arr[aaa] == ')') { 
            char top = st.top(); 
            st.pop(); 
            bool flag = true; 
  
            while (top != '(') { 
                if (top =='+'|| top == '-' ||  
                    top == '*' || top == '/') 
                    flag = false; 
                top = st.top(); 
                st.pop(); 
            } 
            if (flag == true) 
                return true; 
        } 
  
        else
            st.push(arr[aaa]);
    } 
    return false; 
}
int main()
{
	
	string arr;
	cin>>arr;
	int length=arr.length();
	if (solve(arr,length)){
			cout<<"Yes"<<endl;
		}
		else{
			cout<<"No"<<endl;
		}
	return 0;
}