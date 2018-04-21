/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstorepro;

/**
 *
 * @author ACER
 */
public class dramaBook extends BookStorePRO implements TypeBook {

    @Override
    public void type() {
        this.printDrama();

    }

    public static void printDrama() {

        System.out.println("-------------------------------------");
        System.out.println("          Romantic Drama             ");
        System.out.println("-------------------------------------");
        System.out.println(" 1. The Fault in Our Stars ");
        System.out.println(" 2. Pride and Prejudice ");
        System.out.println(" 3. Twilight ");
        System.out.println(" 4. Wuthering Heights ");
        System.out.println(" 5. If I Stay ");
        System.out.println("------------------------------------");
        System.out.print("Please select No. Romantic Drama? : ");

    }

    public int priceDrama() {

        if (selectNo == 1) {
            System.out.println("Title\t: The Fault in Our Stars ");
            System.out.println("Autor\t: John Green");
            System.out.println("Price\t: 299 ");

            price = price + 299;
        } else if (selectNo == 2) {
            System.out.println("Title\t: Pride and Prejudice ");
            System.out.println("Autor\t: Jane Austen ");
            System.out.println("Price\t: 199 ");

            price = price + 199;
        } else if (selectNo == 3) {
            System.out.println("Title\t: Twilight ");
            System.out.println("Autor\t: Stephenie Meyer");
            System.out.println("Price\t: 329 ");

            price = price + 329;
        } else if (selectNo == 4) {
            System.out.println("Title\t: Wuthering Heights");
            System.out.println("Autor\t: Emily Bronte");
            System.out.println("Price\t: 399");

            price = price + 399;
        } else if (selectNo == 5) {
            System.out.println("Title\t: If I Stay");
            System.out.println("Autor\t: Gayle Forman");
            System.out.println("Price\t: 599");

            price = price + 599;
        } else {
            System.out.println("");
            System.out.println("***************************************");
            System.out.println("     Please select try again  No.      ");
            System.out.println("***************************************");
        }
        return price;
    }
}
