/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinklist;

/**
 *
 * @author macbook
 */
public class Node {
    int data;
    Node previous, next;

    public Node(int data, Node previous, Node next) {
        this.data = data;
        this.previous = previous;
        this.next = next;
    }
    public Node ( int d)
    {
        this.data = d;
        this.next = null;
        this.previous = null;
    }
    
    
}
