#include <iostream>
#include <string>
using namespace std;
template <typename T>

struct NODE {
	int data;
	NODE<int>* link;
};

class SimpleLL {
	public:
		void insert(const int& data)
		{

		
			NODE<int>* newNode = newNode; 
			newNode->data = data;
			newNode->link = NULL;
		
			if (this->first == NULL)
			{
				this->first = newNode;
				this->last = newNode;
			
				newNode = NULL;
		}
		else
		{

			this->first->link = newNode;
			this->last = newNode;
			
		}		
		
		this->count++;
			
		}
		
	void print() const
        {
            if (this->first != NULL)
            {
                NODE<int>* currentNode = this->first;
                while(currentNode != NULL)
                {
                        cout << currentNode->data << endl;
                        currentNode = currentNode->link;
                }
            }
        }		
		

		
		bool search(const int& item) const;
		void destroy();
		SimpleLL();
		~SimpleLL();
		
	private:
		int count;
		NODE<int>* first;
		NODE<int>* last;
};
