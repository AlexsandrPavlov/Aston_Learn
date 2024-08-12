public class Main {
    public static void main(String[] args) {

        Cat barsik = new Cat("Барсик");
        Dog tuzik = new Dog("Тузик");
        Cat bashmak = new Cat("Башмак");
        Dog sobaken = new Dog("Собакен");
        barsik.run(150);
        bashmak.swim(27);
        tuzik.run(500);
        sobaken.swim(15);
        System.out.println("Всего животных " +Animal.getCountAnimal());
        System.out.println("Всего котов "+Cat.getCountCat());
        System.out.println("Всего псов "+Dog.getCountDod());


        Kitchen kitchen = new Kitchen(10);
        Cat cat1 = new Cat("Васька");
        Cat cat2 = new Cat("Барсик");
        Cat cat3 = new Cat("Муся");

        kitchen.addCat(cat1);
        kitchen.addCat(cat2);
        kitchen.addCat(cat3);

        kitchen.feedCats();
        kitchen.printSatiationStatus();


        GeometricShape circle = new Circle(5);
        circle.setFillColor("red");
        circle.setBorderColor("black");
        circle.printInfo();

        GeometricShape rectangle = new Rectangle(10, 5);
        rectangle.setFillColor("green");
        rectangle.setBorderColor("blue");
        rectangle.printInfo();
        GeometricShape triangle = new Triangle(8, 6);
        triangle.setFillColor("yellow");
        triangle.setBorderColor("purple");
        triangle.printInfo();

    }
}