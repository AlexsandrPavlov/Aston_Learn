public class Dog extends Animal{
    String name;
    static int countDod = 0;

    Dog(String name){
        super();
        countDod++;
        this.name = name;
    }

    @Override
    void run(int range) {
        if (range > 500) {
            System.out.println(name+ " не может бегать большее 500м");
        } else {
            System.out.println(name+ " пробежал " + range + " метров");
        }

    }

    @Override
    void swim(int range) {
        if (range > 10) {
            System.out.println("Собака не может плыть  " +range+ " метров");
        } else {
            System.out.println(name + " проплыл " + range + " метров");
        }
    }

    static int getCountDod (){
        return countDod;
    }
}