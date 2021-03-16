class Stack
{
private:
	int st[MAX],
	int top=-1;

public:

	void push(int val) {
		if(top>=MAX-1)
		cout << " Overflow " << endl;
		else {
			top++;
			st[top] = val; 
		}
		
	}
	
	int Stack::pop(){
		if(top <= -1 || top == 0)
		cout << " Underflow " << endl;
		else {
			cout << "the pop element : " st[top] << endl;
			top--;
		}
	}
	
	int Stack::peek() {
	if(top == 0){
		return st[top];
	}else {
		cout << "no data" << endl; 
	}
	
	void Stack::display() {
		if(top > = 0){
			cout << "Stack elements are: ";
			for ( int i = top; i>= 0; i--)
			cout << stack[i] << " ";
			cout<< endl; 
		}else
		cout << " Stack is empty ";	
	}
}