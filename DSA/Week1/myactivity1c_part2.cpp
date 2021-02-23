#include <iostream>
using namespace std;

int main(){
	// declare an array
	string data[6] = {"Nicky","David","Guntur","Cindy","Rizqy","James"};
	string key;
	
	// prompt the search key
	cout << "What data are you searching for?" << endl;
	cin >> key;

    for(int i = 0; i < 6; i++) {
        if (key == data[i]) {
            cout << "Found in index : " << i << endl;  
        }else{
            cout << "Not Found" << endl;
        }
        }
}
