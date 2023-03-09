package HW_7_03_2023;

public class Main {
    public static void main(String[] args) {
        Soda addFlavor = new Soda("малина");
        System.out.println(addFlavor.GetMyDrinkString());
        Soda addEmptyFlavor = new Soda("");
        System.out.println(addEmptyFlavor.GetMyDrinkString());
    }

}
