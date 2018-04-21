package bookstorepro;

import java.util.*;

public class CusDiscout extends BookStorePRO implements Customer {

    private static String[][] cusList
            = {{"001", "Boonchock"},
            {"002", "Precha"},
            {"003", "Pranee"},
            {"004", "Tawit"},
            {"005", "Wipada"}};

    
    @Override
    public int member() {
        
        if ((custID.equals(cusList[0][1]))) {
           custDis = total-(100*0.1);
           total = (int) (total-custDis);
           
        } else {
            custDis = total;
            
        } 
        return 0;

    }
}
