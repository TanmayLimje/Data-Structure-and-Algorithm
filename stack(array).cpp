//creating a stack of array of size 5.
//using simple functions like push and pop.  xd

#include <iostream>
using namespace std;

//#define max [5];

class stack
{
	int S[5];
	int top = -1;

	
	

	public:
		/*
		stack()
		{
			top = -1;
		}
		*/

		int empty();
		int full();
		void push(int);
		int pop();
		void display();
};

int stack :: empty()
{
	
	if (top == -1)
		return 1;
	else
		return 0;

}

int stack :: full()
{

	if (top == 5-1)
		return 1;
	else
		return 0;
	
}

void stack :: push(int x)
{

	if ( full() )
		cout << "Stack is full" << endl;
	else
	{
		top++;
		S[top] = x;
	}

}

int stack :: pop()
{
	
	int a;

	if ( empty() )
		cout << "Stack is empty" << endl;
	else
	{
		a = S[top];
		top--;
		return a;
	}

}

void stack :: display()
{
	cout << "the elements are: " << endl;
	/*int i;
	while(i < top)
	{
		cout << S[i] <<endl;
	       i++;
	}	       
	*/

	for(int i = 0; i <= top ; i++)
		cout << S[i] << endl;

}

int main()
{

	stack S;
	int n, input;

	cout << "Enter the elements: " << endl;
	for (int i = 0; i < 5; i ++)
	{
		cin >> input;
		S.push(input);
	}
	
	S.display();

	cout << "popped: " ;
	
	S.pop();

	S.display();


	/*
	S.push(2);
	S.push(4);
	S.push(12);
	S.push(3);
	S.push(5);
	S.display();
	int P = S.pop(12);
	S.display();
	*/
}
