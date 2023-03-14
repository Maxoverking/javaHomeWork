package HWFood;

public class Food {

    private String meal;

    private Double calories;

    public Food(String meal, Double calories) {
        this.meal = meal;
        this.calories = calories;
    }

    public String getMeal() {
        return meal;
    }

    public Double getCalories() {
        return calories;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public void eatMeal() {
        System.out.println(" Cьем " + getMeal() + " в нем всего " + getCalories() + " калории");
    }
}
