public class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFoodAmount) {
        this.foodAmount = initialFoodAmount;
    }

    public void addFood(int amount) {
        this.foodAmount += amount;
    }

    public boolean canEat() {
        return this.foodAmount > 0;
    }

    public int getFoodAmount() {
        return this.foodAmount;
    }
}