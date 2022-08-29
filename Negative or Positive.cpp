#include <iostream>

using namespace std;

void check(int x )
{
    if(x>0)
    {
        cout << x << " is positive";
    }
    else
    {
        cout << x << " is negative";

    }
}

int main()
{
    int a;

    cout  << " enter 1st value: " << endl;
    cin >>a;

    check(a);

    return 0;
}
