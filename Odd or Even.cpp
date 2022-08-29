#include <iostream>

using namespace std;

void OE( int x )
{
    if(x%2==0)
    {
        cout << "entered value is even " << x;
    }
    else
    {
        cout << "entered value is odd " << x;
    }
}

int main()
{
    int a;
    cout << "enter a value to check whether it is even or odd:" << endl;
    cin >> a;

    OE(a);
}
