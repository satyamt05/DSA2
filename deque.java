import java.util.*;
import java.io.*; 
public class Deque 
{
    // Initialize your data structure.
    int size;
    int front;
    int rear;
    int[] dq;

    public Deque(int n) 
    {
        // Write your code here.
        size = n;
        front = -1;
        rear = -1;
        dq = new int[size];
    }
    
    // Pushes 'X' in the front of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushFront(int x) 
    {
        // Write your code here.
        if(isFull()){
            return false;
        }
        // return true;
        if(front==-1){
            front=0;
            rear=0;
        }
        else if(front==0){
            front= size-1;
        }
        else{
            front--;
        }
        dq[front]=x;
        return true;

    }

    // Pushes 'X' in the back of the deque. Returns true if it gets pushed into the deque, and false otherwise.
    public boolean pushRear(int x) 
    {
        // Write your code here.
        if(isFull()){
            return false;
        }
        if(rear==-1){
            front=0;
            rear=0;
        }
        else{
            rear=(rear+1)%size;
        }
        dq[rear]=x;
        return true;
    }

    // Pops an element from the front of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popFront() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }
        int temp= dq[front];
        if(rear==front){
            front=-1;
            rear=-1;
        }
        else{
            front=(front+1)%size;
        }
        return temp;
    }

    // Pops an element from the back of the deque. Returns -1 if the deque is empty, otherwise returns the popped element.
    public int popRear() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }
        int temp= dq[rear];
        if(rear==front){
            front=-1;
            rear=-1;
        }
        else if(rear==0){
            rear=size-1;
        }
        else{
            rear=(rear-1)%size;
        }
        return temp;
        
    }

    // Returns the first element of the deque. If the deque is empty, it returns -1.
    public int getFront() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }
        return dq[front];
    }

    // Returns the last element of the deque. If the deque is empty, it returns -1.
    public int getRear() 
    {
        // Write your code here.
        if(isEmpty()){
            return -1;
        }
        return dq[rear];
    }

    // Returns true if the deque is empty. Otherwise returns false.
    public boolean isEmpty() 
    {
        // Write your code here.
        if(front==-1){
            return true;
        }
        return false;
    }

    // Returns true if the deque is full. Otherwise returns false.
    public boolean isFull() 
    {
        // Write your code here.
        if((rear+1)%size == front){
            return true;
        }
        return false;
    }
}