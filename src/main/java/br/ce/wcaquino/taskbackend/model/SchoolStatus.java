package br.ce.wcaquino.taskbackend.model;

import java.util.Arrays;

public enum SchoolStatus {
    APPROVED(60,100),
    RECOVERY(40,59),
    DISAPPROVED(0,39);

    private int minimum;
    private int maximum;

    SchoolStatus(int minimum, int maximum) {
        this.minimum = minimum;
        this.maximum = maximum;
    }

    public static SchoolStatus whatStatus(int grade){
        return Arrays.stream(SchoolStatus.values())
                .filter(s -> grade >= s.getMinimum() && grade <= s.getMaximum())
                .findFirst()
                .get();
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }

}
