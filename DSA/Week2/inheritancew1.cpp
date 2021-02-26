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

	private:
		int width;
		int height;
	
};


// Derived class or sub class
class Triangle: public Shape{
	public:
		int getArea(){
			return 0.5*getWidth()*getHeight();
			
		}
	
};

class Rectagle: public Shape{
	public:
		int getArea(){ 
			int area = getWidth()*getHeight();
			return area;

		}
};

// your code here
int main() {
	Triangle myT = Triangle();
	Rectagle myR = Rectagle();

	myT.setWidth(4);
	myT.setHeight(3);

	myR.setWidth(5);
	myR.setHeight(15);

//getter

cout << "My triangle's width is " << myT.getWidth() <<endl;
cout << "My triangle's height is " << myT.getHeight() <<endl;
cout << "My triangle's area is " << myT.getArea() << endl;

cout << "My rectangle's width is " << myR.getWidth() <<endl;
cout << "My rectangle's height is " << myR.getHeight() <<endl;
cout << "My rectagle's area is " << myR.getArea() << endl;

	

};
