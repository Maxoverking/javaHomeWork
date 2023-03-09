package HW_7_03_2023;

public class Main {
    public static void main(String[] args) {
        Soda addFlavor = new Soda("малина");
        System.out.println(addFlavor.GetMyDrinkString());

        // Soda addEmptyFlavor = new Soda("");
        // System.out.println(addEmptyFlavor.GetMyDrinkString());

        Triangle triagle = new Triangle(3, 6, 6);
        // Triangle triagle = new Triangle(3, 2, 6);
        // Triangle triagle = new Triangle(3, -3, 6);
        System.out.println(triagle);

    }

}
