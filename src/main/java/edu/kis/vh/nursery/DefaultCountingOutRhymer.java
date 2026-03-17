package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int STACK_SIZE = 12;
    public static final int STACK_EMPTY = -1;
    public static final int STACK_FULL = STACK_SIZE - 1;
    public static final int ERR_CODE = -1;

    private final int[] numbers = new int[STACK_SIZE];

    public int total = STACK_EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_EMPTY;
    }

    public boolean isFull() {
        return total == STACK_FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }

}
