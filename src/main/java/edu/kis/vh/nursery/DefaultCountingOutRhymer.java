package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int STACK_SIZE = 12;
    private static final int STACK_EMPTY = -1;
    private static final int STACK_FULL = STACK_SIZE - 1;
    private static final int ERR_CODE = -1;

    private final int[] numbers = new int[STACK_SIZE];

    private int total = STACK_EMPTY;

    public static int getStackSize() {
        return STACK_SIZE;
    }

    public static int getStackEmpty() {
        return STACK_EMPTY;
    }

    public static int getStackFull() {
        return STACK_FULL;
    }

    public static int getErrCode() {
        return ERR_CODE;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == STACK_EMPTY;
    }

    public int getTotal() {
        return total;
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

    public int[] getNumbers() {
        return numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
