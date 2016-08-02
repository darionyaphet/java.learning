package org.darion.yaphet.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    private static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }


        public int distance() {
            return Math.abs(x * x - y * y);
        }
    }

    public static void main(String[] args) {
        IntStream.iterate(1, i -> i * 2).limit(10).forEachOrdered(System.out::println);

        List<Integer> intList = Arrays.asList(0, 1, 2, 3, 4);

        DoubleStream stream = intList.parallelStream()
                .map(i -> new Point(i % 3, i % 5))
                .mapToDouble(p -> p.distance());
        OptionalDouble maxDistance = stream.max();
        System.out.println("Max Distance " + maxDistance.getAsDouble());

        System.out.println("=================================");
        Optional<Integer> max = Arrays.asList(0, 1, 2, 3, 4, 5).stream()
                .map(i -> i + 1).max(Integer::compareTo);
        System.out.println("Max : " + max.get());

        OptionalInt maxInt = IntStream.rangeClosed(1, 5)
                .map(i -> i + 1)
                .max();
        System.out.println("Max : " + maxInt.getAsInt());
        System.out.println("=================================");

        DoubleStream doubleStream = IntStream.rangeClosed(1, 5).asDoubleStream();

        System.out.println("=================================");

        Stream<Integer> integerStream = IntStream.rangeClosed(1, 10).boxed();

        System.out.println("=================================");

        System.out.println("=================================");

        System.out.println("=================================");

        System.out.println("=================================");

    }
}