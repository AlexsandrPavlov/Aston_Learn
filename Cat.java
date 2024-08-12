public class Cat extends Animal{
    String name;
    public static int countCat = 0;
    private boolean isSatiated;

    Cat (String name){
        super();
        countCat++;
        this.name = name;
        this.isSatiated = false;
    }

    @Override
    void run(int range) {
        if (range > 200) {
            System.out.println(name + " не может бегать большще 200");
        } else {
            System.out.println(name + " пробежал " + range + " метров");
        }
    }

    @Override
    void swim(int range) {
        System.out.println(name + " не умеет плавать");
    }

    public void eat(FoodBowl bowl) {
        if (bowl.canEat()) {
            this.isSatiated = true;
            System.out.println(this.name + " поел из миски.");
        } else {
            System.out.println(this.name + " не смог поесть из миски.");
        }
    }

    public boolean isSatiated() {
        return this.isSatiated;
    }

     static int getCountCat(){
        return countCat;
    }

}