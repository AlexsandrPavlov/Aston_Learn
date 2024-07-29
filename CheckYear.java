public class CheckYear extends main{

    public static boolean CheckYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
