package fundamentals;

import edu.princeton.cs.algs4.StdOut;

import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Created by Edric on 17/1/11.
 */

class DeleteLastNode<Item>{
    private Node first;
    private Node last;
    private int N;
    private class Node {
        Item item;
        Node next;
    }
    public boolean isEmpty() { return N == 0; }
    public int size() { return N; }

    public void add(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else oldlast.next = last;
        N++;
    }

    public Item deleteLast() {
        if (isEmpty()) throw new NoSuchElementException();
        else if (first == last) {
            N--;
            return first.item;
        } else {
            Node secondLast = first;
            while (secondLast.next != last)
                secondLast = secondLast.next;
            N--;
            Item item = secondLast.next.item;
            last = secondLast;
            return item;
        }
    }
}

public class E1_3_19_DeleteLastNode {
    public static void main(String[] args) {
        Random rand = new Random();
        DeleteLastNode<Integer> dlnode = new DeleteLastNode<>();
        for (int i = 0; i < 10; i++) {
            Integer num = rand.nextInt(50);
            dlnode.add(num);
            StdOut.print(num + " ");
        }
        Integer item = dlnode.deleteLast();
        StdOut.println("\nDelete the last node with Item: " + item);
    }
}
