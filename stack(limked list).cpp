// Stack of linked list

#include <iostream>
using namespace std;

struct node
{
	int data;
	node *next;
};

class stack
{
//	node *head;
	node *top;

	public:
		stack()
		{ 
			top = NULL;
		}
		void push (int);
		int pop();
		void display();

};

void stack :: push(int x)
{

	node *p;
	p = new node;
	p -> data = x;
	p -> next = top;
	top = p;

}

int stack :: pop()
{
	if (top == NULL)
		cout << "satck is empty" << endl;
	else
	{
		int x;
		node *temp;
		temp = top;
		top = top -> next;
		x = temp -> data;
		delete temp;
		return x; 
	}
}

void stack :: display()
{

	node *p;
	p = top;
	while (p ->next != NULL)
	{
		if (top == NULL)
			cout << "Stack is empty";
		else
		{
			cout << p -> data << endl;
			p = p -> next;
			
		}
	}
	cout << p -> data << endl;
}

int main()
{

	stack S;
	/*
	int x;

	cout << "Enter 5 Elements:" << endl;
	for (int i = 0; i < 5; i++)
	{
		cin >> x;
		S.push(x);		
	}		
	

	S.display();
	
	int num = S.pop();
	
	*/
	int input = -1;
	while (input != 4)
	{
	//	int input = -1;
		cout << "1. Push a value" << endl;
		cout << "2. POP" << endl;
		cout << "3. display" << endl;
		cout << "4. Exit" << endl;
		cout << "Enter your choice:  ";
		cin >> input;
				
		switch(input)
		{
			case 1:
				int x;
				cout << "Enter value" << endl;
				cin >> x;
				S.push(x);
				break;

			case 2:
				S.pop();
				break;
			
			case 3:
				S.display();
				break;

			case 4: 
				break;
		}
	
	}	

}
