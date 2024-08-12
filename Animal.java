public class Animal {
    static int countAnimal = 0;

    Animal() {
        countAnimal++;
    }


    void run(int range) {
        System.out.println("Животное проьежало " + range + " метров");
    }

    void swim(int range) {
        System.out.println("Животное проплыло метров " + range + " м");
    }

    public static int getCountAnimal() {
        return countAnimal;
    }

}