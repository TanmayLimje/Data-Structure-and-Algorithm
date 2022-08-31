//Bubble sorting

#include <iostream>

using namespace std;

void input();

void bubblesort(int n, int array[])
{
    cout << "bubble sorting:  " << endl;
    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0; j < n-1; j++)
        {
            if (array[j] > array[j+1])
            {
                int temp = 0;
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    for (int a=0; a < n; a++)
    {
        cout << array[a] << "\t" ;
    }
}


void input()
{
    int n;
    cout << "enter the length of the array:" << endl;
    cin >> n;
    int array[n];
    cout << "enter the elements of array: " << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> array[i];
    }
    bubblesort(n, array);

}



int main()
{
    input();
}
