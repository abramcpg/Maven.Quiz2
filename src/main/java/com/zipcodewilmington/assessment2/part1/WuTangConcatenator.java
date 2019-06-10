package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    public WuTangConcatenator(Integer input) {
    }

    public Boolean isWu(Integer input) {
        return (input % 3 == 0);
    }

    public Boolean isTang(Integer input) {
        return (input % 5 == 0);
    }

    public Boolean isWuTang(Integer input) {
        return (input % 15 == 0);
    }
}
