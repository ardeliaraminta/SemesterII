#include <iostream>
using namespace std;

int main(){
	
	int x = 99;
	
	cout << "The content of x is " << x << endl;
	cout << "The address of x is " << &x << endl;

	// your code here
    int* ptr;
    ptr = &x;
    

    x = 115;

    cout<< endl<<" The address of pi :  " << ptr << endl;
    cout<<" The value of pi : " << *ptr << endl;

    int *cats; new int; 
    *cats = 333;

    cout<< endl<<" The address of pi :  " << cats << endl;
    cout<<" The value of pi : " << *cats << endl;

}
