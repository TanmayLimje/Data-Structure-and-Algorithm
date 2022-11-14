#include <iostream>
using namespace std;
#define MAX 5

class CircularQueue
{

    int array[MAX];
    int f,r;

public:

    CircularQueue()
    {
        f = r = -1;
    }

    void enqueue(int);
    int dequeue();
    void display();

};

void CircularQueue ::enqueue(int x)
{

    if (r == -1)
    {
        r = (r+1) % MAX;
        f = (f+1) % MAX;
        array[r] = array[f] = x;
    }

    else if ((r+1) % MAX == f)
        cout << "Max limit reached" << endl;

    else
    {
        r = r + 1;
        array[r] = x;
    }

}

int CircularQueue :: dequeue()
{
    int x;

    if(f != -1)
    {
        x = array[f];
        f = f + 1;
        cout << "Element dequeued successfully" << endl;
    }

    else
        cout << "The queue is empty." << endl;

    return x;
}

void CircularQueue ::display()
{

    cout << "Elements of queue: " ;
    for (int i = f; i <= r; i++)
        cout << "\t" << array[i];

}

int main()
{

    CircularQueue CQ;
    int input,x;

    do
    {
        cout << "\n------MENU-----" << endl;
        cout << "1. Enqueue element" << endl;
        cout << "2. Dequeue element" << endl;
        cout << "3. Display elements" << endl;
        cout << "4. Exit" << endl;
        cout << "Enter your choice:";
        cin >> input;

        switch(input)
        {
            case 1:
                cout << "Enter the element:" ;
                cin >> x;
                CQ.enqueue(x);
                cout << "Element enqueued successfully" << endl;
                CQ.display();
                break;

            case 2:
                CQ.dequeue();
                CQ.display();
                break;

            case 3:
                CQ.display();
                break;
        }
    }while(input != 4);

}