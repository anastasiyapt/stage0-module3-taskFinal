package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int revertedNumber = 0;
        int remainder = 0;

        while (number > 0){
            remainder = number % 10;
            revertedNumber = revertedNumber * 10 + remainder;
            number = number / 10;
        }
        System.out.println(revertedNumber);
    }
}
