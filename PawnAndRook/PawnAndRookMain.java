package PawnAndRook;

import PawnAndRook.Pawn.Color;

public class PawnAndRookMain {
    public static void main(String[] args) {

        Pawn pawn = new Pawn(Color.WHITE, 2, 4);
        pawn.setCoordinates(4, 6);
        System.out.println(pawn);

    }

}
