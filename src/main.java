/**
 * main
 */
public class main {

    public static void main(String[] args) {

        linkedList list = new linkedList();
        list.push(9);
        list.push(2);
        list.push(7);
        list.push(3);
        list.push(44);
        list.displayLinkedList();
        list.shift();
        list.shift();
        list.shift();
        list.pop();
        list.push(-544);
        list.push(0);
        list.push(987);
        list.push(1);
        list.pop();
        list.displayLinkedList();

        list.sort();
        list.displayLinkedList();




    }
}