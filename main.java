public class main {

    public main() {
    }

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee ("Александр Павлов","Программист","pavlov@mail.ru",898675464,100000.0, 20);
        Employee.printEmployeeInfo();
        persArray[1] = new Employee ("Имя Фамалия","Программист","name@mail.ru",898675464,100000.0, 20);
        Employee.printEmployeeInfo();
        persArray[2] = new Employee ("Любое имя","Программист","name@mail.ru",898675464,100000.0, 20);
        Employee.printEmployeeInfo();
        persArray[3] = new Employee ("Любое имя","Программист","name@mail.ru",898675464,100000.0, 20);
        Employee.printEmployeeInfo();
        persArray[4] = new Employee ("Любое имя","Программист","name@mail.ru",898675464,100000.0, 20);
        Employee.printEmployeeInfo();
        Park park = new Park();
        park.addAttraction("Качели", 9, 16, 1000);
        park.addAttraction("Машинки", 9, 16, 1000);
        System.out.println(park.attractions.get(0).getName());
    }
}
// Подскажи с выводом, как заставить выводить весь массив сразу, а не по строке?