#include <iostream>

using namespace std;

void Swap_1(int x, int y)
{
    cout << "Swapping using 3 variables" << endl;

    int temp;
    temp = x;
    x = y;
    y = temp;

    cout << "Numbers after swapping are:  " << x << "  " << y << endl;

}

void Swap_2(int x , int y)
{
    cout << "Swapping using 2 variables" << endl;

    x = x + y;
    y = x - y;
    x = x - y;

    cout << "Numbers after swapping are:  " << x << "  " << y << endl;
}

void input()
{
    int x, y;
    cout << "Swapping of Two Numbers" << endl;

    cout << "Enter First number:  ";
    cin >> x;

    cout << "Enter Second number:  ";
    cin >> y;

    Swap_1(x,  y);
    Swap_2(x , y);

}


int main()
{
  input();
}
