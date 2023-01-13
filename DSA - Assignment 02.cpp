/*
Assignment 2:- Stack
Implement stack as an abstract data type using singly linked list and use this ADT for conversion of infix expression to postfix, prefix and evaluation of postfix and prefix expression.
*/

#include <iostream>
#include<string.h>
using namespace std;
class stack
{
private:
	struct node
	{
		char data;
		struct node *next;
	}*top;
public:
	stack()
{
		top=NULL;
}
	char top_element();
	void push(char x);
	char pop();
	int empty();
	//void display(node *top);
};
char stack::top_element(){
	return(top->data);
}
void stack::push(char x)
{
	struct node *p;
	p=new node;
	p->data=x;
	p->next=top;
	top=p;
}
char stack::pop()
{
	int x;
	node *temp;
	temp=top;
	top=top->next;
	x=temp->data;
	delete temp;
	return(x);
}
int stack::empty()
{
	if(top==NULL)
	{
		//cout<<"\nStack underflow";
		return 1;
	}
	else
	{
		return 0;
	}
}
class stack1
{
	struct node
	{
		int data;
		struct node *next;
	}*top;
public:
	stack1()
{
		top=NULL;
}
	void push(int num);
	int pop();
	int empty();
	void display(node *top);
};
int stack1::empty()
{
	if(top==NULL)
	{
		//cout<<"\nStack underflow";
		return 1;
	}
	else
	{
		return 0;
	}
}
void stack1::push(int num)
{
	struct node *p;
	p=new node;
	p->data=num;
	p->next=top;
	top=p;
	//cout<<"\nInsert number successfully";
}
int stack1::pop()
{
	int item;
	struct node *temp;
	stack s;
		temp=top;
		top=top->next;
		item=temp->data;
		delete temp;
		return(item);
}
class operations
{
public:
	int priority(char x);
	void infix_postfix(char infix[30],char postfix[30]);
	int eval(int p1,int p2,char op);
	void infix_prefix(char infix[30],char prefix[30]);
	void post_eval(char postfix[30]);
	void pre_eval(char prefix[30]);
};
int operations::priority(char x)
{
	if(x=='$')
		return (4);
	else if(x=='*'||x=='/'||x=='%')
		return (3);
	else if(x=='+'||x=='-')
		return (2);
	else if(x=='(')
		return (1);
	else
		return 0;
}
void operations::infix_postfix(char infix[30],char postfix[30])
{
	stack s;
	char x;
	int i,j;
	char token;
	j=0;
	for(i=0;infix[i]!='\0';i++)
	{
		token=infix[i];
		if(isalpha(token))
			postfix[j++]=token;
		else if(token=='(')
			s.push('(');
		else if(token==')')
			while((x=s.pop())!='(')
				postfix[j++]=x;
		else
		{
			while(priority(token)<=priority(s.top_element()) && !s.empty())
			{
				x=s.pop();
				postfix[j++]=x;
			}
			s.push(token);
		}
	}
	while(!s.empty())
	{
		x=s.pop();
		postfix[j++]=x;
	}
	postfix[j]='\0';

}
void operations::infix_prefix(char infix[30],char prefix[30])
{
	int i,j;
	char x,in1[30];
	for(i=strlen(infix)-1,j=0;i>=0;i--,j++)
	{
		in1[j]=infix[i];

	}
	in1[j]='\0';
	for(i=0;in1[i]!='\0';i++)
	{
		if(in1[i]=='(')
			in1[i]=')';
		else if(in1[i]==')')
			in1[i]='(';
	}
	infix_postfix(in1,prefix);
	for(i=0,j=strlen(prefix)-1;i<j;i++,j--)
	{
		x=prefix[i];
		prefix[i]=prefix[j];
		prefix[j]=x;
	}
}
int operations::eval(int p1,int p2,char op)
{
	if(op=='+')
		return(p1+p2);
	else if(op=='-')
		return(p1-p2);
	else if(op=='*')
		return(p1*p2);
	else if(op=='/')
		return(p1/p2);
}
void operations::post_eval(char postfix[30])
{
	char op;
	stack1 p;
	int val,p1,p2,p3;
	for(int i=0;postfix[i]!='\0';i++)
	{
		op=postfix[i];
		if(isalpha(op))
		{
			cout<<"\nEnter the value of char\t"<<op<<":";
			cin>>val;
			p.push(val);
		}
		else
		{
			p2=p.pop();
			p1=p.pop();
			p3=eval(p1,p2,op);
			p.push(p3);
		}
	}
	p3=p.pop();
	cout<<"\nAfter evaluation result"<<p3<<endl;
}
void operations::pre_eval(char prefix[30])
{

	char op;
	stack1 p;
	int val,c1,c2,c3;
	for(int i=strlen(prefix)-1;i>=0;i--)
	{
		op=prefix[i];
		if(isalpha(op))
		{
			cout<<"\nEnter the value of char\t"<<op<<":";
			cin>>val;
			p.push(val);
		}
		else
		{
			c2=p.pop();
			c1=p.pop();
			c3=eval(c1,c2,op);
			p.push(c3);
		}
	}
	c3=p.pop();
	cout<<"\nAfter evaluation result"<<c3<<endl;
}
int main()
{
	char infix[30],postfix[30],prefix[30];
	int ch;
	operations p;
	stack1 s1;
	do
	{
		cout<<"\nStack Operations";
		cout<<"\n1.INFIX_POSTFIX \n2.INFIX_PREFIX \n3.POSTFIX EVALUATION \n4.PREFIX EVALUATION";
		cout<<"\nEnter your choice";
		cin>>ch;
		switch(ch)
		{
		case 1:
			cout<<"\nEnter the infix expression:";
			cin>>infix;
			p.infix_postfix(infix,postfix);
			cout<<"\nThe postfix expression :"<<postfix<<endl;
			break;
		case 2:
			cout<<"\nEnter the infix expression:";
			cin>>infix;
			p.infix_prefix(infix,prefix);
			cout<<"\nThe prefix expression :"<<prefix<<endl;
			break;
		case 3:
			cout<<"\nEnter the postfix expression";
			cin>>postfix;
			p.post_eval(postfix);
			break;
		case 4:
			cout<<"\nEnter the prefix expression";
			cin>>prefix;
			p.pre_eval(prefix);
			break;
		}
		cout<<"\nDo u want to continue(1/0)?";
		cin>>ch;
	}while(ch==1);
	return 0;
}
