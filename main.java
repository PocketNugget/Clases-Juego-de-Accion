import java.awt.*;
import javax.swing.*;



public class main {

    public static void main(String[] args) {
        //Codigo para mostrar los tipos de personajes

        Character king,queen,knight,troll;
        king = new King();
        queen = new Queen();
        knight = new Knight();
        troll = new Troll();

        //Llamar para los println

        king.displaychar();
        queen.displaychar();
        knight.displaychar();
        troll.displaychar();




    }



}
