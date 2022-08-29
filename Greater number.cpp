#include <iostream>
using namespace std;


int grt(int x,int y)
{
   if(x > y)
   {
       cout << x << " is greater than " << y;
   }
   else
   {
       cout << y << " is greater than " <<x;
   }
   return 0 ;
}

int main()
{
    int a,b;
    cout << "enter value 1: " << endl;
    cin >> a;

    cout<< "enter value 2: " << endl;
    cin >> b;

    grt(a,b);
    return 0;
}
