package com.company;

public class SortOddEvenRelativeOrder {
    // Java program to segregate odd and even numbers from list in a relative order.

    Node head;  // head of the list
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void segregateEvenOdd() {

        Node oddStart = null;
        Node oddEnd = null;
        Node evenStart = null;
        Node evenEnd = null;
        Node currentNode = head;

        while(currentNode != null) {
            int element = currentNode.data;

            if(element % 2 != 0) {

                if(evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = currentNode;
                    evenEnd = evenEnd.next;
                }

            } else {

                if(oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = currentNode;
                    oddEnd = oddEnd.next;
                }
            }
            currentNode = currentNode.next;
        }


        if(oddStart == null || evenStart == null) {
            return;
        }

        evenEnd.next = oddStart;
        oddEnd.next = null;
        head=evenStart;
    }
    void push(int new_data) {
        //  Allocate the Node &Put in the data
        Node new_node = new Node(new_data);

        //  Make next of new Node as head
        new_node.next = head;

        //Move the head to point to new Node
        head = new_node;
    }

    // Method to print a linked list
    void printList() {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Driver method to test above functions */
    public static void main(String args[]) {
        SortOddEvenRelativeOrder llist = new SortOddEvenRelativeOrder();
        // Taking a random numbers in to linked list, which have mix up of odd and even
        // numbers.To test the out put with respect to the the input relative sequence
        llist.push(17);
        llist.push(20);
        llist.push(16);
        llist.push(7);
        llist.push(3);
        llist.push(32);
        llist.push(31);
        llist.push(19);
        llist.push(12);
        llist.push(21);
        llist.push(34);

        System.out.println("Original List");
        llist.printList();

        llist.segregateEvenOdd();

        System.out.println("Modified  List");
        llist.printList();
    }

}

