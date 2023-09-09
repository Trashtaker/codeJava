/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_2;

/**
 *
 * @author macbook
 */
public class SinglyLinkedList {
    
    
    Node head;
    
    public void add(int data)
    {
        Node newNode = new Node(data);
        //Checking if the List is Empty
        if ( head == null) 
        {
            head = newNode;
            return;
        }
        Node current = head;
        //Traversing to the Last Node
        while (current.next != null)
        {
            current = current.next;
        }
        //Adding the New Node to the End
        current.next = newNode;
    }
    
    public void remove(int target)
    {
        if ( head == null)
        {
            return;
        }
        if (head.data == target) 
        {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null)
        {            
            if( current.next.data == target)
            {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    public Node findPreviousNode(int data) {
        Node current = head;
        while (current != null && current.next != null && current.next.data != data) {
            current = current.next;
        }
        return current;
    }
    
    void sort()
        {
            Node y = head;
            Node g = head.next;
            for(int i = 0; i<this.getLength(); i++)
            {
                for(int j = i+1; j<this.getLength(); j++)
                {
                    if(y.data>g.data)
                    {
                        int valY = y.data;
                        int valG = g.data;
                        Node temp = new Node(valY,y.next);
                        y = new Node(valG, g.next);
                        g = temp;
                    }
                    g=g.next;
                }
                y = y.next;
                g = y.next;
            }
        }
    int getLength(){
            int ans = 0;
            Node p = head;
            while(p!=null)
            {
                ans++;
                p=p.next;
            }
            return ans;
        }
   
    public void swap(int data1, int data2) {
        Node previousNode1 = findPreviousNode(data1);
        Node previousNode2 = findPreviousNode(data2);
        if (previousNode1 == null || previousNode2 == null) {
            return;
        }
        Node tmp = previousNode1.next;
        previousNode1.next = previousNode2.next;
        previousNode2.next = tmp;
    }
    
        public boolean search(int target)
    {
        if( head== null || head.data == target)
        {
            return false;
        }
        Node current = head;
        while (current.next != null) {
            if( current.next.data == target)
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void AddAtHead(int input){
        Node newNode = new Node(input); 
        if ( head == null) 
        {
            head = newNode;
            return;
        }
        else{
        newNode.next = head;
        head = newNode;
        }
    }
    
    
    public void AddMiddle(int target, int obj)
    {
        //if the list currently is: 1 2 3 4 5 6 
        //then insertMiddle(2,99), will make the list become
        // 1 2 99 3 4 5 6
        Node newNode = new Node(obj);
        Node current = head;

        if( head.data == target && head.next == null)
        {
            head.next = newNode;
        }
        else
        {
            while(current != null)
            {
                
                if(  current.data == target)
                {                    
                    newNode.next = current.next;
                    current.next = newNode;
                }
                current = current.next;
            }
        }
    }
    
    public void deleteAtIndext(int index)
    {
        Node current = head;
        int size = 0;
        if (index == 0) {
            if (head != null)
            {
                head = head.next;
            }
        }
        
        else
        {
            while(current != null && size == index - 1)
            {
                size++;
                current = current.next;
            }
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }   
    }
    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    
                   
                
    
}

