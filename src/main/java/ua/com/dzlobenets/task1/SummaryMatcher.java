package ua.com.dzlobenets.task1;

import javax.annotation.Nonnegative;

public class SummaryMatcher {
    private final int size;
    private boolean[] values;

    public SummaryMatcher(@Nonnegative int size) {
        this.size = size;
        this.values = new boolean[size+1];
    }

    public void calculate() {

        final int middle = size /  2;

        System.out.println("Result:");

        for (int i = 0; i <= middle; i++) {
            if (values[i] && values[size - i]) {
                System.out.println(""+ i + " + " + (size - i) + " = " + (i + (size - i)));
            }
        }
    }

    public void add(int i) {
//        System.out.println("added: " + i);
        if (i < values.length) {
            values[i] = true;
        }
    }
}
