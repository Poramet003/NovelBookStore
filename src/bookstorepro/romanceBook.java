/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstorepro;

import static bookstorepro.BookStorePRO.selectNo;

/**
 *
 * @author ACER
 */
public class romanceBook extends BookStorePRO implements TypeBook {

    private static String[][] detail
            = {{"1", "Title\t: Devil in Winter \nAutor\t: Lisa Kleypas \nPrice\t: 299 "},};

    @Override
    public void type() {
        this.printRomance();

    }

    public static void printRomance() {

        System.out.println("-------------------------------------");
        System.out.println("               Romance             ");
        System.out.println("-------------------------------------");
        System.out.println(" 1.  Devil in Winter ");
        System.out.println(" 2. Fifty Shades of Grey ");
        System.out.println(" 3.  The Duke and I ");
        System.out.println(" 4.  A Walk to Remember ");
        System.out.println(" 5.  Bared to You ");
        System.out.println("------------------------------------");
        System.out.print("Please select No. Romance? : ");

    }

    public int priceRomance() {

        if (selectNo == 1) {
            System.out.println(detail[0][1]);

            price = price + 299;
        } else if (selectNo == 2) {
            System.out.println("Title\t: Fifty Shades of Grey  ");
            System.out.println("Autor\t: E.L. James ");
            System.out.println("Price\t: 299 ");

            price = price + 299;
        } else if (selectNo == 3) {
            System.out.println("Title\t: The Duke and I ");
            System.out.println("Autor\t: Julia Quinn");
            System.out.println("Price\t: 359 ");

            price = price + 359;
        } else if (selectNo == 4) {
            System.out.println("Title\t: A Walk to Remember ");
            System.out.println("Autor\t: Nicholas Sparks");
            System.out.println("Price\t: 329");

            price = price + 329;
        } else if (selectNo == 5) {
            System.out.println("Title\t: Bared to You");
            System.out.println("Autor\t: Sylvia Day");
            System.out.println("Price\t: 189");

            price = price + 189;
        } else {
            System.out.println("");
            System.out.println("***************************************");
            System.out.println("     Please select try again  No.      ");
            System.out.println("***************************************");

        }
         return price;
    }
}