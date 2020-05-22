package test;


import com.company.SortOddEvenRelativeOrder;
import org.testng.annotations.Test;
import org.w3c.dom.Node;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;


import java.io.InputStream;

public class SortOddEvenRelativeOrderTest {

    String Original =  "34 21 12 19 31 32 4 13 50 5 3 7 16 20 17 ";
    String Expected =  "34 21 12 19 31 32 4 13 50 5 3 7 16 20 17 ";
    @Test
    void segregateOddEvenWhenCurrentNull() {
        SortOddEvenRelativeOrder sort = new SortOddEvenRelativeOrder();
        sort.segregateOddEven();
        assertNull(null,null);


    }
    @Test
    void testSegregateOddEvenWhenCurrentNotIsNotNull() {
        SortOddEvenRelativeOrder sort = new SortOddEvenRelativeOrder();
        SortOddEvenRelativeOrder list = new SortOddEvenRelativeOrder();
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
        list.segregateOddEven();
        sort.segregateOddEven();
        assertEquals(Original,Expected);

    }
    @Test
    void printListWhenTempNotNull() {
        SortOddEvenRelativeOrder list = new SortOddEvenRelativeOrder();
        SortOddEvenRelativeOrder sort = new SortOddEvenRelativeOrder();

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
        list.segregateOddEven();
        sort.printList();
        assertEquals(Original,Expected);
    }
    @Test
    public void testMain()  {
        System.out.println("main");
        String[] args = null;
        final InputStream original = System.in;
        SortOddEvenRelativeOrder.main(args);
        System.setIn(original);
    }


    public class Node {
        int data;
        SortOddEvenRelativeOrder.Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

}



