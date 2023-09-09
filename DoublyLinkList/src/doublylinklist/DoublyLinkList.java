/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublylinklist;

/**
 *
 * @author macbook
 */
public class DoublyLinkList {
    Node head, tail;
    public void addToTail(int data)
    {   
        Node current = head;
        Node newNode = new Node(data);
        if(head == null )
        {
            head = newNode;
            tail = head;
            return;
        }
        else
        {
            while (current.next != null)
            {
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
            }
        }
    }
    
    public void addToHead(int data)
    {
        if(head == null)
        {
            head = tail = new Node(data);                    
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head.previous = newNode;
        head =newNode;
    }
    public void addMiddle(int index, int data)
    {
        Node newNode = new Node(data);
        if(head == null )
        {
            newNode = head;
            newNode = tail;
            return;
        }
        else
        {
            Node current = head;
            while (current != null) {
                 if( current.data == data)
                 {
                    newNode.next = current.next;
                    current.next.previous = newNode;
                    newNode.previous = current;
                    current.next = newNode;
                    
                 }
                        
            }
        }    
    }
    
    
    
}
