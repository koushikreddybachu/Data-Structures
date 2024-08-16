//Stack using arrays
#include<iostream>
using namespace std;
int a[100],x,top=-1;
int s;
class stack
{
    public:
        void push()
        {
            if(top==s-1)
            cout<<"Stack is full, you can't insert element anymore\n";
            else
            {
                cout<<"Enter element to insert in stack\n";
                cin>>x;
                top++;
                a[top]=x;
                cout<<x<<" is pushed to stack\n";
            }
        }
        void pop()
        {
            int temp;
            temp=a[top];
            if(top==-1)
            cout<<"Stack is empty, error in performing operation\n";
            else
            {
                top--;
                cout<<temp<<" is poped from stack";
            }
        }
        void show_top()
        {
            if(top==-1)
            cout<<"Stack is empty, unable to find top\n";
            else
            cout<<"==========     top -> "<<a[top]<<"       ==========\n";
        }
        void show()
        {
            cout<<"-----------------------\n";
            if(top==-1)
            cout<<"Stack is empty\n";
            else
            {
            cout<<"Elements in stack"<<endl;
            for(int temp=top;temp!=-1;temp--)
            cout<<a[temp]<<" ";
            }
            cout<<"\n-----------------------\n";
        }
};
int main()
{
    stack s1;
    cout<<"Enter the size of Stack\n";
    cin>>s;
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
            cout<<"Elements in stack = "<<top+1;
            break;
            default:
            cout<<"\nPlease select valid operation"<<endl;
            break;
        }
        cout<<"\n-----------\n Do you want to continue? (1 to continue /// 0 to exit)"<<endl;
        cin>>c;
    }
}