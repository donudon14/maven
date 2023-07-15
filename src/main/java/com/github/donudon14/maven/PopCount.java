package com.github.donudon14.maven;

public final class PopCount {
    public static int popCount(int x) {
        x = (x & 0X55555555) + ((x >>>  1) & 0X55555555);
        x = (x & 0X33333333) + ((x >>>  2) & 0X33333333);
        x = (x & 0X0F0F0F0F) + ((x >>>  4) & 0X0F0F0F0F);
        x = (x & 0X00FF00FF) + ((x >>>  8) & 0X00FF00FF);
        x = (x & 0X0000FFFF) + ((x >>> 16) & 0X0000FFFF);
        return x;
    }

    public static int popCount(long x) {
        x = (x & 0X5555555555555555L) + ((x >>>  1) & 0X5555555555555555L);
        x = (x & 0X3333333333333333L) + ((x >>>  2) & 0X3333333333333333L);
        x = (x & 0X0F0F0F0F0F0F0F0FL) + ((x >>>  4) & 0X0F0F0F0F0F0F0F0FL);
        x = (x & 0X00FF00FF00FF00FFL) + ((x >>>  8) & 0X00FF00FF00FF00FFL);
        x = (x & 0X0000FFFF0000FFFFL) + ((x >>> 16) & 0X0000FFFF0000FFFFL);
        x = (x & 0X00000000FFFFFFFFL) + ((x >>> 32) & 0X00000000FFFFFFFFL);
        return (int) x;
    }
}
