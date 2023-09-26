/**
 * Node
 */
public class Node {
    int value;
    Node next;
    Node previous;

    Node(){
        this.next=null;
        this.previous=null;
    }
    
    Node(int value){
        this.value=value;
    }
    
}