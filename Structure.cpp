/*
CREATION OF DATABASE NAMED STUDENT
USING BUBBLE SORT FOR SORTING STUDENT DETAILS ACCORING TO ROLL NUMBER
USING LINEAR SEARCH TO FIND THE DETAILS OF STUDENT BY TAIKING SGPA AS AN INPUT
USING BINARY SEARCH FIND THE STUDENT DETAILS TAKING NAME AS INPUT
*/

#include <iostream>

using namespace std;

struct student
{
    int rollno;
    char name[20];
    float SGPA;
}temp;

int main()
{
    int n;
    cout << "enter the no of students: " ;
    cin >> n;

    struct student s[n];

    for (int i=0; i < n; i++)
    {
        cout << "Enter the roll no of student:  ";
        cin >> s[i].rollno;
        cout << "Enter the name of student:  ";
        cin >> s[i].name;
        cout << "Enter the marks(sgpa) of student;  ";
        cin >> s[i].SGPA;
    }

    for (int i=0; i < n; i++)
    {
        cout << s[i].rollno << "  " << s[i].name << "  " << s[i].SGPA << endl;
    }

    cout << "Sorting of list using Bubble sort: " << endl;
    for (int i=0; i < n; i++)
        for (int j=0; j < n; j++)
    {
        if (s[j].rollno > s[j+1].rollno)
        {
            temp = s[j];
            s[j] = s[j+1];
            s[j+1] = temp;
        }
    }

     for (int i=0; i < n; i++)
    {
        cout << s[i].rollno << "  " << s[i].name << "  " << s[i].SGPA << endl;
    }

    float x;
    cout << "Enter SGPA to find the details of student:  ";
    cin >> x;

     for (int i=0; i < n; i++)
    {
        if (s[i].SGPA == x)
             cout << s[i].rollno << "  " << s[i].name << "  " << s[i].SGPA << endl;
    }

    int lower = 0;
    int upper = n-1;
    int mid;
    char y[20];

    cout << "enter a name to be searched using binary search:  ";
    cin >> y;

    while (lower <= upper)
    {
        mid = (lower+upper)/2;
        if (strcmp(s[mid].name,y)==0)
            break;
        else if (strcmp(s[mid].name,y)>1)
            upper=mid-1;
        else
            lower=mid+1;
    }
      cout << s[mid].rollno << "  " << s[mid].name << "  " << s[mid].SGPA << endl;

        
    return 0;
}
