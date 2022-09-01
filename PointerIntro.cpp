#include <iostream>

using namespace std;

class Node{
public:
    int data;
    Node* next;
};


void display(Node* n){
    cout << "Linked List: " <<endl;
    while(n != NULL){
        cout << n->data  <<  " Addcess: " << n->next << endl;
        n = n->next;
    }
}

int main()
{
    Node*head = NULL;
    Node* first = NULL;

    head = new Node();
    first = new Node();

    head->data = 12;
    head->next = first;

    first->data = 33;
    first->next = NULL;

    display(head);

    return 0;
}
