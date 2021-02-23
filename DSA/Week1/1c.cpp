#include <iostream>
using namespace std;

int main(){
	// declare an array
	int data[9] = {3,49,1,6,33,13,9,4,6};
	int key;
	
	// prompt the search key
	cout << "What data are you searching for?" << endl;
	cin >> key;

    for(int i = 0; i < 9 ; i++) {
        if (key == data[i]) {
            cout << "Found in index :\n " << i << endl;
            }
        if (key != data[i]) {
            cout << "\n Not Found" << endl;
		
        }
        }
}
