#include <iostream>

using namespace std;

int main()
{
// the array is based what user input in the terminal 
	int data[9], i, key, num;
	
	
// prompt the search key
	cout << "How many elements in array ? " << endl;
	cin >> key;

	cout << "Enter " << key << " numbers" << endl;

	// read input 
	for (i = 0; i < key; i++){
        cin>>data[i];
	}
	cout<<" What data are you looking for ? ";
	cin>>num;

	/* search */
		for(i = 0; i < key; i++){
				if(data[i]== num)
				{
						cout<< "Found in index "<< i;
						break;
				}
				if(i == key)
				{
						cout<<"Not found...."<< endl; 
				}
				return 0;
	}
		
}

/* #include <iostream>
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
*/
