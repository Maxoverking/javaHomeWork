package HW_7_03_2023;

public class Triangle {

    public Triangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Стороны не могут быть отрицательные");
            return;
        } else if (!checkSides(a, b, c)) {
            System.out.println("Стороны не образуют треугольник");
            return;
        } else {
            System.out.println("Tреугольник получился");
            return;
        }
    }

    public static boolean checkSides(int a, int b, int c) {
        return (a + b > c) && (b + c > a) && (a + c > b);
    }

}
