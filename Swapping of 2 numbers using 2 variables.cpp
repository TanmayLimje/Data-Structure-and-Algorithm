#include <iostream>

using namespace std;

void swp( int x , int y )
{
    x = x + y;
    y = x - y;
    x = x - y;

    cout << endl << " after swapping " << endl;
    cout << x <<" "<< y;
}
int main()
{
    int a , b ;

    cout << "enter value for a" << endl;
    cin >> a;

    cout << "enter value for c" << endl;
    cin >> b;

    cout << "before swapping" << endl;
    cout << a << "  " << b;

    swp(a,b);


    return 0;
}
