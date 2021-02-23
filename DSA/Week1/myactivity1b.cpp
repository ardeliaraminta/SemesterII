
#include <iostream>
using namespace std;

int main(){

  // declare array of days in week
    string weekly[7] = {"Monday",
                        "Tuesday",
                        "Wednesday", 
                        "Thursday", 
                        "Friday",
                        "Saturday",
                        "Sunday"
    };
      // declare variables
    string days;

    // print message to the console
    cout << "What day is it today?" << endl;

    // get input data
    cin >> days;


    for(int i = 0; i < 7; i++) {
        if (days == weekly[i]){
            if (i<5){
                cout << "I'm studying" << endl;
            }else{
                cout << "I go fishing" <<endl;
            }
        }
    }
}