package HW_7_03_2023;

public class Soda {
    private String addition;

    public Soda(String addition) {
        this.addition = addition;
    }

    public String GetMyDrinkString() {
        return addition != null && !addition.isEmpty() ? "Газировка и " + addition : "Обычная газировка";
    }
}
