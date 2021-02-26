#include <iostream>
using namespace std;

class Box{
    private:
    int length;
    int width;
    int height;

	// function members (methods)
	public:
        Box(); // default constructor
		Box(int l, int w, int h); // constructor

		int getLength();
		int getWidth();
		int getHeight();
		void setLength(int l);
		void setWidth(int w);
		void setHeight(int h);
		int calculateArea();
		int calculateVolume();

};

// your code here
//default constructor
Box::Box(){
    length = 0;
    width = 0;
    height = 0;
}

int Box::getWidth(){
    return width;
}

int Box::getLength(){
    return length;
}

int Box::calculateArea(){
    return width*length; 
}

int main () {
    // you have to create an object before being able to call its name
    Box box;
    box.calculateArea();

    return 0;

}