package Queue;
import java.util.*;

class node
{
    int value;
    node next;

    node()
    {
        this.next=null;
    }
}

class queue
{
    public int count=0;
    public node front,rear;
    Scanner sc=new Scanner(System.in);

    queue()
    {
        this.front=null;
        this.rear=null;
    }
    public void enqueue()
    {
        System.out.println("Enter the element to insert in queue");
        int element=sc.nextInt();
       
        node temp=new node();
        temp.value=element;

        if(rear==null)
        {
            front=rear=temp;
        }
        else
        {
            rear.next=temp;
            rear=temp;
        }
        count++;
        System.out.println(element+" is inserted in queue at position "+count);
    }
    public void dequeue()
    {
        if(front==null)
            System.out.println("Queue is empty, top is not assigned");
        else
        {
            System.out.println(front.value+" is removed from the queue");
            count--;
            if(front==rear)
            front=rear=null;
            else
            front=front.next;
        }
        
    }
    public void frontRear()
    {
        if(front==null)
        System.out.println("Queue is empty, front & rear is not assigned");
        else
        {
        System.out.println("==========     Front - >"+front.value+"     ==========");
        System.out.println("==========      Rear - >"+rear.value+"     ==========");
        }
    }
    public void show()
    {
        node temp=new node();
        System.out.println("--------------------------");
        if (front==null)
        System.out.println("Queue is empty");
        else
        {
        System.out.println("Elements in Queue -");
        for(temp=front;temp!=null;temp=temp.next)
            System.out.print(temp.value+" ");
        }
        System.out.println("\n--------------------------");
    }
}
public class queue_ll
{
    public static void main(String[] args) 
    {
        try(Scanner sc=new Scanner(System.in))
        {
        queue queue=new queue();
        int control=1,choice;
        while(control==1)
        {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Show front & rear\n4.Display queue\n5.No of elements in queue");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    queue.enqueue();
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.frontRear();
                    break;
                case 4:
                    queue.show();
                    break;
                case 5:
                    System.out.println("Elements in stack = "+queue.count);
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