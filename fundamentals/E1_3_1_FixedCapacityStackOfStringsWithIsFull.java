package fundamentals;

/**
 * Created by Edric on 17/1/10.
 */
public class E1_3_1_FixedCapacityStackOfStringsWithIsFull{
    private String[] a;
    private int N;
    public E1_3_1_FixedCapacityStackOfStringsWithIsFull(int cap) {
        a = new String[cap];
    }
    public boolean isEmpty() { return N == 0; }
    public int size() { return N; }
    public void push(String item) {
        a[N++] = item;
    }
    public String pop() {
        return a[--N];
    }
    public boolean isFull(int cap) { return N == a.length; }
}
