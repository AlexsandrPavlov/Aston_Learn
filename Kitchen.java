import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private FoodBowl foodBowl;
    private List<Cat> cats;

    public Kitchen(int initialFoodAmount) {
        this.foodBowl = new FoodBowl(initialFoodAmount);
        this.cats = new ArrayList<>();
    }

    public void addCat(Cat cat) {
        this.cats.add(cat);
    }

    public void feedCats() {
        for (Cat cat : this.cats) {
            cat.eat(this.foodBowl);
        }
    }

    public void printSatiationStatus() {
        for (Cat cat : this.cats) {
            System.out.println(cat.name + ": " + cat.isSatiated());
        }
    }
}
