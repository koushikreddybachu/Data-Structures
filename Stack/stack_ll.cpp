#include<iostream>
using namespace std;
int count=0;
struct node
{
    int value;
    struct node *next;
};
struct node *top;

class stack
{
    public:
        int x;
        void push()
        {
            cout<<"Enter the number to insert"<<endl;
            cin>>x;
            struct node *temp;
            temp=new node;
            temp->value=x;
            temp->next=NULL;
            if(top==NULL)
            top=temp;
            else
            {
                temp->next=top;
                top=temp;
            }
            count++;
            cout<<x<<" is inserted in stack in position "<<count<<endl;
        }
        void pop()
        {
            struct node *temp;
            temp=new node;
            if(top==NULL)
            cout<<"Stack is empty , error in performing pop operation";
            else
            {
            temp=top;
            top=temp->next;
            count--;
            cout<<temp->value<<" is removed from stack"<<endl;
            delete temp;
            }
        }
        void show_top()
        {
            if(top==NULL)
            cout<<"Stack is empty, top is not assigned\n";
            else
            cout<<"==========     top-> "<<top->value<<"     ==========";
        }
        void show()
        {
            struct node *temp;
            temp=new node;
             cout<<"--------------------------"<<endl;
            if(top==NULL)
            cout<<"Stack is empty";
            else
            {
            cout<<"Elements in stack"<<endl;
            for(temp=top;temp!=NULL;temp=temp->next)
            cout<<temp->value<<" ";
            }
            cout<<"\n--------------------------\n";
        }
};

int main()
{
    stack s1;
    int c=1,ch;
    while(c)
    {
        cout<<"1.Push\n2.Pop\n3.Show Top\n4.display Stack\n5.No of elements in stack"<<endl;
        cin>>ch;
        switch(ch)
        {
            case 1:
            s1.push();
            break;
            case 2:
            s1.pop();
            break;
            case 3:
            s1.show_top();
            break;
            case 4:
            s1.show();
            break;
            case 5:
            cout<<"Elements in stack = "<<count;
            break;
            default:
            cout<<"\nPlease select valid operation"<<endl;
            break;
        }
        cout<<"\n-----------\n Do you want to continue? (1 to continue /// 0 to exit)"<<endl;
        cin>>c;
    }
}