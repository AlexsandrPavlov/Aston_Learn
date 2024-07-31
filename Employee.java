public class Employee extends main{
    private static String Name;
    private static String position;
    private static String email;
    private static int phoneNumber;
    private static double salary;
    private static int age;

    public Employee(String Name, String position, String email, int phoneNumber, double salary, int age) {
        this.Name = Name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }


    public static void printEmployeeInfo() {
        System.out.println("Информация о сотруднике:");
        System.out.println("\tФИ: " + Name);
        System.out.println("\tДолжность: " + position);
        System.out.println("\tEmail: " + email);
        System.out.println("\tТелефон: " + phoneNumber);
        System.out.println("\tЗарплата: " + salary);
        System.out.println("\tВозраст: " + age);
    }

}