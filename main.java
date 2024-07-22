// Пункты 13 и 14 пока не могу сообразить как сделать, еще посижу что нибудь родится
import java.util.Scanner;
import java.util.Arrays;
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nПункт 1");
        PrintThreeWordsImpl.printThreeWords();
        System.out.println("\nПункт 2");
        checkSumSign.checkSumSign();
        System.out.println("\nПункт 3");
        ptintColor.printColor();
        System.out.println("\nПункт 4");
        compareNumbers.compareNumbers();
        System.out.println("\nПункт 5");
        System.out.println("\nВведите число 1");
        int num1 = sc.nextInt();
        System.out.println("\nВведите число 2");
        int num2 = sc.nextInt();
        System.out.println(NumberRangeChecker.isSumInRange(num1, num2));
        System.out.println("\nПункт 6");
        System.out.println("\nВведите число для проверки в пунктах 6 и 7");
        int number = sc.nextInt();
        System.out.println(NumberChecker.checkNumber(number));
        System.out.println("\nПункт 7");
        System.out.println(NumberChecker1.isNegative(number));
        System.out.println("\nПункт 8");
        RepeatString.repeatString("Привет", 3);
        System.out.println("\nПункт 9");
        System.out.println("\nВведите год");
        int year = sc.nextInt();
        System.out.println(CheckYear.CheckYear(year));
        System.out.println("\nПункт 10");
        int[] binaryArray = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        FlipBinary.flipBinary(binaryArray);
        System.out.println(Arrays.toString(binaryArray));
        System.out.println("\nПункт 11");
        int[] numbers = new int[100];
        FillBinary.fillbinary(numbers);
        for (int num : numbers) {System.out.print(num + " ");}
        System.out.println("\nПункт 12");
        int[] numbersfor12 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Multiplay.multiply(numbersfor12);
        System.out.println(Arrays.toString(numbersfor12));
    }

}

