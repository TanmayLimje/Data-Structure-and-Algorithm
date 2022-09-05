/*
CREATION OF DATABASE NAMED STUDENT
USING BUBBLE SORT FOR SORTING STUDENT DETAILS ACCORING TO ROLL NUMBER
USING LINEAR SEARCH TO FIND THE DETAILS OF STUDENT BY TAIKING SGPA AS AN INPUT
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

    return 0;
}
