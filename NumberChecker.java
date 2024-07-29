public class NumberChecker extends main{

    public static boolean checkNumber(int number) {
        if (number > 0) {
            System.out.println("Положительное число");
        } else if (number == 0) {
            System.out.println("Нуль считается положительным числом");
        } else {
            System.out.println("Отрицательное число");
        }
        return false;   // я понятия не имею как вернуть без этого вывод
    }
}