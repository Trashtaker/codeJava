/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_2;

/**
 *
 * @author macbook
 */
public class Node {
    int data;
    Node next;
    
    public Node( int d, Node nx)
    {
        data = d;
        next = nx;
    }
    public Node ( int d)
    {
        this.data = d;
        this.next = null;
    }
    public int getData() {return data;}
    public Node getNext() {return next;}
    public void setData(int d) { data = d;}
    public void setNext(Node n) { next = n;}
    
    
    
}
