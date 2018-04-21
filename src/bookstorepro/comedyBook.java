/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstorepro;

import static bookstorepro.BookStorePRO.price;

/**
 *
 * @author ACER
 */
public class comedyBook extends BookStorePRO implements TypeBook {

    @Override
    public void type() {
        this.printComedy();

    }

    public static void printComedy() {

        System.out.println("-------------------------------------");
        System.out.println("          Romantic Comedy            ");
        System.out.println("-------------------------------------");
        System.out.println(" 1. Can You Keep a Secret?  ");
        System.out.println(" 2. Wallbanger  ");
        System.out.println(" 3. A Sudden Crush  ");
        System.out.println(" 4. The Rosie Project ");
        System.out.println(" 5. The Boy Next Door ");
        System.out.println(" 5. The Rosie Project ");
        System.out.println("------------------------------------");
        System.out.print("Please select No. Romantic Comedy? : ");

    }

    public int priceComedy() {

        if (selectNo == 1) {
            System.out.println("Title\t: Can You Keep a Secret? ");
            System.out.println("Autor\t: Sophie Kinsella");
            System.out.println("Price\t: 199 ");

            price = price + 199;
        } else if (selectNo == 2) {
            System.out.println("Title\t: Wallbanger  ");
            System.out.println("Autor\t: Alice Clayton ");
            System.out.println("Price\t: 229 ");

            price = price + 229;
        } else if (selectNo == 3) {
            System.out.println("Title\t: A Sudden Crush ");
            System.out.println("Autor\t: Camilla Isley");
            System.out.println("Price\t: 289 ");

            price = price + 289;
        } else if (selectNo == 4) {
            System.out.println("Title\t: The Rosie Project ");
            System.out.println("Autor\t: Graeme Simsion");
            System.out.println("Price\t: 189");

            price = price + 189;
        } else if (selectNo == 5) {
            System.out.println("Title\t: The Boy Next Door");
            System.out.println("Autor\t: Meg Cabot");
            System.out.println("Price\t: 439");

            price = price + 439;
        } else {
            System.out.println("");
            System.out.println("***************************************");
            System.out.println("     Please select try again  No.      ");
            System.out.println("***************************************");
        }

        return price;
    }

    public boolean equals(Object obj) {
        return false;

    }
}
