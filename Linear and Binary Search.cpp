#include <iostream>

using namespace std;

int main()
{
    int n;
    int temp;
    cout << "enter the number of elements in array:  " ;
    cin >> n;

    int array[n];
    cout << "enter the elements of array:" << endl;
    for (int i = 0; i < n; i++)
    {
        cin >> array[i];
    }

    for (int i = 0; i < n ; i++)
    {
        cout << "  " << array[i] << endl;
    }

    cout << "Elements are sorted using BUBBLE sort: " << endl;

    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - 1; j++)
        {
            if (array[j] > array[j+1])
            {
                temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;
            }
        }
    }
    for (int i = 0; i < n ; i++)
    {
        cout <<"  "<< array[i] << endl;
    }

    int y;
    cout << "enter a element to be searched using linear search:  ";
    cin >> y;

    for (int i = 0; i < n; i++)
    {
        if (array[i] == y)
            cout << array[i] << "  " << i << endl;
    }

    int lower = 0;
    int upper = n-1;
    int mid;
    int x;

    cout <<"enter a element to be searched using binary search:   ";
    cin >> x;

    while (lower <= upper)
    {
        mid = (lower + upper)/2;
        if (array[mid]==x)
            break;
        else if (array[mid]>x)
            upper = mid -1;
        else
            lower = mid+1;
    }
    cout << "\n"<< array[mid] << "  " << mid;

}
