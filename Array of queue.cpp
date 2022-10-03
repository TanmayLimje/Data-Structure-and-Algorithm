#include <iostream>
using namespace std;
#define MAX 8


class queue
{
	int array[MAX];
	int front,rear;

	public:
		queue()
		{
			front = -1;
			rear = -1;
		}
		
		int empty();
		int full();
		void enqueue(int);
		int dequeue();
		void display();
};

int queue :: empty()
{
	if (rear == -1)
		return 1;
	else
		return 0;
}

int queue :: full()
{
	if (rear == MAX - 1)
		return 1;
	else
		return 0;
}

void queue :: enqueue(int x)
{
	if( empty() )
	{
		front = rear = 0;
		array[rear] = x;
	}

	else
	{
		rear++;
		array[rear] = x;
	}
}

int queue :: dequeue()
{
	int x = array[front];

	if ( rear == front )
		front = rear = -1;
	else
		front++;

	return x;
}

void queue :: display()
{	
	cout << "DISPLAY" << endl;
	for (int i = front; i <= rear; i++)
	{
		cout << " " << array[i] << endl;; 
	}
}

int main()
{

	queue Q;


	/*
	int x;
	cout << "Enter the 8 values: " << endl;
	for (int i = 0; i < MAX; i++)
		cin >> x;

	Q.enqueue(x);
	Q.display();
	
	int y;
	y = Q.dequeue();
	Q.display();
	*/



	int input = -1;

	do
	{
		cout << "---MENU---" << endl;
		cout << "1. Enqueue" << endl;
		cout << "2. Dequeue" << endl;
		cout << "3. Display" << endl;
		cout << "4. EXIT" << endl;
		cout << "Enter your choice: " ;
		cin >> input;
	
		switch(input)
		{	

		case 1:
			cout << "Enter values: " << endl;
			int x;
			cin >> x;

			Q.enqueue(x);
			cout << "Value have been added." << endl;
	
			break;
				
		case 2:
			int y;
			y = Q.dequeue();
			cout << "First value has been deleted." << endl;
			
			break;
		
		case 3:
//			cout << "Display" << endl;
			Q.display();
	
		}
	}while(input != 4);
}
