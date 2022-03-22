package SamplePrograms.src.ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StatisticsExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Max: " + intSummaryStatistics.getMax());
        System.out.println("Min: " + intSummaryStatistics.getMin());
        System.out.println("Sum: " + intSummaryStatistics.getSum());
        System.out.println("count: " + intSummaryStatistics.getCount());
        System.out.println("Average: " + intSummaryStatistics.getAverage());

        List<Integer> collect = Arrays.stream(new int[]{2, 3, 4, 5, 18, 16, 6, 8, 6, 2, 220})
                .boxed()
                .filter(n -> (n % 2) == 0)
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
