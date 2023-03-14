package HWFood;

public class Food {

    private String meal;

    private int calories;

    public Food(String meal, int calories) {
        this.meal = meal;
        this.calories = calories;
    }

    public String getMeal() {
        return meal;
    }

    public int getCalories() {
        return calories;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void eatMeal() {
        System.out.println(" Cьем " + getMeal() + " в нем всего " + getCalories() + " калории");
    }
}
