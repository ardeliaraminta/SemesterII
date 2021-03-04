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

#include <iostream>
using namespace std;

// base class or super class
class Shape {
	public:
		int getWidth(){
			return width;
		}
		
		int getHeight(){
			return height;
			
		}
		void setWidth(int w){
			width = w;	
		}
	
		void setHeight(int h){
			height = h;	
		}
		
		int getArea(){
			return width*height;
		}
        Shape(int w, int h){
            int weight;
            int height;
		}
	private:
		int width;
		int height;
	
};
