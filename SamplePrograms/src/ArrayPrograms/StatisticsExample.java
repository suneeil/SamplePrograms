package ArrayPrograms;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StatisticsExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Max: " + intSummaryStatistics.getMax());
        System.out.println("Min: " + intSummaryStatistics.getMin());
        System.out.println("Sum: " + intSummaryStatistics.getSum());
        System.out.println("count: " + intSummaryStatistics.getCount());
        System.out.println("Average: " + intSummaryStatistics.getAverage());
    }
}
