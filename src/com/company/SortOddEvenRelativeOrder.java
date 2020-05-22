package com.company;

public class SortOddEvenRelativeOrder {
    // Java program to segregate odd and even numbers from list in a relative order.

    Node head;  // head of the list
    public class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void segregateOddEven() {

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
    public void push(int new_data) {
        //  Allocate the Node &Put in the data
        Node new_node = new Node(new_data);

        //  Make next of new Node as head
        new_node.next = head;

        //Move the head to point to new Node
        head = new_node;
    }

    // Method to print a linked list
    public void printList() {
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
        SortOddEvenRelativeOrder list = new SortOddEvenRelativeOrder();
        // Taking a random numbers in to linked list, which have mix up of odd and even
        // numbers.To test the out put with respect to the the input relative sequence
        list.push(17);
        list.push(20);
        list.push(16);
        list.push(7);
        list.push(3);
        list.push(5);
        list.push(50);
        list.push(13);
        list.push(4);
        list.push(32);
        list.push(31);
        list.push(19);
        list.push(12);
        list.push(21);
        list.push(34);

        System.out.println("Original List");
        list.printList();
        list.segregateOddEven();

        System.out.println("Modified  List");
        list.printList();
    }

}

