/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstorepro;

import static bookstorepro.DisPlay.printMenu;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class BookStorePRO {

    static String title;
    static String autor;
    static String type;
    static int price;
    static int selectType;
    static int selectNo = 0;
    static String add;
    static int cash;
    static int total;
    static int change;
    static double custDis;
    static String custID;    
    static String Username;
    static String Password;
    static String id[] = {"Farkyoops", "Kae"};
    static String pass[] = {"003", "020"};
    
    
    
    public static int calculate() {
//        CusDiscout cus = new CusDiscout();
        
        Scanner input3 = new Scanner(System.in);
        System.out.println("=====================================");
        System.out.println("Total : " + price);
//        cus.member(); 
//        System.out.println("CustomerID :");
//        custID = input3.next();
        System.out.print("Cash  : ");
        cash = input3.nextInt();
        change = (cash - price);
        System.out.println("change : " + change);
        System.out.println("=====================================");

        return change;

    }

    private static void login() {
        Password = "123";
        Username = "admin";

        System.out.println("============= L O G I N ==============");
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter Username : ");
        String username = input4.next();

        Scanner input5 = new Scanner(System.in);
        System.out.print("Enter Password : ");
        String password = input5.next();

        if (username.equals(Username) && password.equals(Password)) {
            System.out.println("************* Welcome ****************");

        } else if (username.equals(Username)) {
            System.out.println("Invalid Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username!");
        } else {
            System.out.println("Invalid Username & Password!");
        }

    }

    public static void main() {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        dramaBook d = new dramaBook();
        comedyBook c = new comedyBook();
        romanceBook r = new romanceBook();

        printMenu();
        selectType = input.nextInt();

        do {
            if (selectType == 1) {
                d.type();
                selectNo = input.nextInt();
                d.priceDrama();
            } else if (selectType == 2) {
                c.type();
                selectNo = input.nextInt();
                c.priceComedy();
            } else if (selectType == 3) {
                r.type();
                selectNo = input.nextInt();
                r.priceRomance();
            } else {

            }

        } while (selectNo != 1 && selectNo != 2 && selectNo != 3 && selectNo != 4 && selectNo != 5);

        System.out.println("-------------------------------------");
        System.out.println("Do you want to order more books(Y/N)?");

        add = input2.next();

    
        if (add.equalsIgnoreCase("Y")) {
            BookStorePRO.main();
        } else if (add.equalsIgnoreCase("N")) {
            BookStorePRO.calculate();
            if (change < 0) {
                System.out.println("********** Cash Incorrect ***********");
                BookStorePRO.calculate();
            }
        }
      
    }

    public static void main(String[] args) {

        do {
            BookStorePRO.login();
            BookStorePRO.main();
        } while (selectType != 1 && selectType != 2 && selectType != 3);
    }

}
