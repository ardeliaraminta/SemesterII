#include <iostream>
using namespace std;

void swap(int *x, int *y);

int main(){
    int a = 20; 
    int b = 25;
	
	cout << "Enter first number " << endl;
	cin >> a;
	
	cout << "Enter second number " << endl;
	cin >> b;
	
	// print before swap
	cout << "BEFORE SWAP: First number is " << a << " and the Second number is " << b << endl;
    cout << "BEFORE SWAP: First number's address is " << &a << " and the Second number's address is " << &b << endl;
	
	// try to swap
	swap(&a, &b);
	
	// print before swap
	cout << endl << "AFTER SWAP: First number is " << a << " and the Second number is " << b << endl;
    cout <<"AFTER SWAP: First number's address is " << &a << " and the Second number's address is " << &b << endl;
    
	
}

void swap(int *x, int *y){
    int swaps; 
    swaps = *x;
    *x = *y;
    *y = *x;

    return;


}

