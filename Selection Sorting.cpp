#include <iostream>

using namespace std;

int main()
{
    int n,temp;
    cout << "enter the length of array: " << endl;
    cin >> n;

    int array[n];

    cout << "enter the elements of array:" << endl;
    for (int a = 0; a <= n - 1; a++)
        cin >> array[a];

    cout << "the elements of array are:" << endl;
    for (int b = 0; b <= n-1; b++)
        cout << "\t" << array[b];

    for (int i = 0; i <= n-1; i++)
    {
        for (int j = i+1 ; j <n; j++)
        {
            if (array[i] > array[j])
            {

                temp = array[j];
                array[j] = array[i];
                array[i] =temp;
            }
        }
    }

    cout << endl << "selection sorted elements are: " << endl;
    for (int c = 0; c <=n-1; c++)
        cout << " " <<array[c];
}
