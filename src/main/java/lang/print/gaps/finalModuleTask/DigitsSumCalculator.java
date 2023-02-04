package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        int remainder = 0;

        while (number > 0){
            remainder = number % 10;
            sum += remainder;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
