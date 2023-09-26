/**
 * this is java linkedList implementation for integers. It covers some methods
 * we can use to handle linkedList problems.
 * linkedList
 * 
 * some methods specifications: We should have a signle lisnkedList with at
 * least one element
 * 
 * void push(int val): add node with value val to the end of the linkedList
 * int pop(): retrieve the last node from the LS and returns its value.
 * int shift():retrieve the first node from the LS and returns its value.
 * boolean search (int value): returns true if the value "value" exists, false
 * otherwise.
 * void delete(int value): delete node with value "value".
 * void update(int origin,int newValue): update the origin value "origin" by the
 * value "newValue".
 * linkedList sort(linkedList list): sort the linkedList list and returns the
 * final sorted list.
 * void displayLinkedList(): print all valus of each node in the linkedList
 */
public class LinkedList {

    Node head;
    Node tail;
    int length;

    LinkedList() {
        this.head = null;
        this.tail = head;
        this.length = 0;
    }

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = null;

        if (this.head == null) {
            this.head = newNode;
            // set previous node adress for the newNode
            newNode.previous = this.tail;
            this.tail = newNode;

        } else {
            newNode.previous = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;

        }

        this.length++;
    }

    int pop() {

        int value = this.tail.value;
        // here we dessociate the last node from the rest of the linkedList
        (this.tail).previous.next = null;
        this.tail = this.tail.previous;

        this.length--;
        return value;

    }

    int shift() {
        int storedValue = this.head.value;
        (this.head.next).previous = null;
        this.head = this.head.next;

        this.length--;
        return storedValue;
    }

    boolean search(int value) {

        Node cell = this.head;
        boolean found = false;
        while (cell != null && !found) {
            if (cell.value == value)
                found = true;

            cell = cell.next;
        }

        return found;
    }

    void delete(int value) {
        if (search(value)) {
            Node cell = this.head;
            while (cell.value != value) {

                cell = cell.next;
            }
            // here we know that cell is the node with the wanted value

            Node previousNode = cell.previous;
            previousNode.next = cell.next;
            (cell.next).previous = previousNode;
            this.length--;

        }

        else {
            System.out.println("Value " + value + " doesn't exist");
        }

    }

    void update(int origin, int newValue) {

        if (search(origin)) {
            Node cell = this.head;

            while (cell != null && cell.value != origin) {
                cell = cell.next;

            }
            if (cell != null)
                cell.value = newValue;
            else {
                System.out.println("Cannot update value " + origin + ("It doesn't exist"));
            }

        } else {
            System.out.println("Cannot update value " + origin + ("It doesn't exist"));
        }

    }

    void displayLinkedList() {

        if(this.length==0)
            System.out.println("Empty list !");
        Node cell = this.head;
        System.out.println("-------------------------------------");
        System.out.println("Length: " + this.length);
        while (cell != null) {
            System.out.print(" " + cell.value);
            cell = cell.next;
        }
        System.out.println();
        System.out.println("-------------------------------------");
    }


    //this is bubble sort algorithme for linkedList
    void sort() {
  
        assert (head != null);
        if (this.length == 1)
            return ;


        Node current =this.head;
        Node index=null;

        while(current!=null){
            index=current.next;
            int tmp;
            while(index!=null){
                if(current.value>index.value){
                    tmp=index.value;
                    index.value=current.value;
                    current.value=tmp;

                }

                index=index.next;
            }

            current=current.next;
        }

       
    }
}
