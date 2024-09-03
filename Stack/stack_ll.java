import java.util.*;

class node
{
    int value;
    node next;

    node()
    {
        next=null;
    }
}

class stack
{
    public node top;
    public int count=0;
    Scanner sc=new Scanner(System.in);
    stack()
    {
        this.top=null;
    }
    public void push()
    {
        System.out.println("Enter the element to insert in stack");
        int element=sc.nextInt();
       
        node temp=new node();
        temp.value=element;

        if(top==null)
        {
            top=temp;
        }
        else
        {
            temp.next=top;
            top=temp;
        }
        count++;
        System.out.println(element+" is inserted in stack at position "+count);
    }
    public int pop()
    {
        if(top==null)
        return -1;
        else
        {
            int element=top.value;
            top=top.next;
            count--;
            return element;
        }
    }
    public void showTop()
    {
        if(top==null)
        System.out.println("Stack is empty, top is not assigned");
        else
        System.out.println("==========     top-> "+top.value+"     ==========");
    }
    public void show()
    {
        node temp=new node();
        System.out.println("--------------------------");
        if (top==null)
        System.out.println("Stack is empty");
        else
        {
        System.out.println("Elements in Stack -");
        for(temp=top;temp!=null;temp=temp.next)
            System.out.println(temp.value+" ");
        }
        System.out.println("--------------------------");
    }
}

public class stack_ll
{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in))
        {
        stack stack=new stack();
        int control=1,choice;
        while(control==1)
        {
            System.out.println("1.Push\n2.Pop\n3.Show Top\n4.Display Stack\n5.No of elemnts in stack");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    stack.push();
                    break;
                case 2:
                    int res=stack.pop();
                    if(res==-1)
                        System.out.println("Stack is empty , error in performing pop operation");
                    else
                        System.out.println(res+" is removed from stack");
                    break;
                case 3:
                    stack.showTop();
                    break;
                case 4:
                    stack.show();
                    break;
                case 5:
                    System.out.println("Elements in stack = "+stack.count);
                    break;
                default:
                    System.out.println("\nPlease select valid operation");
            }
            System.out.println("\n------------------\nDo you want to continue? (1 to continue /// 0 to exit)");
            control=sc.nextInt();
        }
        }

    }
}