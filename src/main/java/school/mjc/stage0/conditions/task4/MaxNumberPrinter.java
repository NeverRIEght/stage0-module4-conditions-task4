package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result;

        if(first >= second && first >= third) {
            result = first;
        } else if(second >= third) {
            result = second;
        } else {
            result = third;
        }

        System.out.println(result);
    }
}
