package HW_7_03_2023;

public class Soda {
    private String addition;

    public Soda(String addition) {
        this.addition = addition;
    }

    public String GetMyDrinkString() {
        boolean con = addition != null && !addition.isEmpty();
        return con ? "Газировка и " + addition : "Обычная газировка";
    }

}
