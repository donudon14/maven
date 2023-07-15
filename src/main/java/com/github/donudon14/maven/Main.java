package com.github.donudon14.maven;

import java.util.Scanner;
import static com.github.donudon14.maven.PopCount.popCount;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var i = scanner.nextInt();
        System.out.printf("popCount(%d): %d%n", i, popCount(i));
    }
}
