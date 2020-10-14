package lab5_test3;

import lab5_test2.MyCircle;
import lab5_test2.MyPoint;
import lab5_test2.MyTriangle;

public class TestInvoice {
    public static void main(String[] args) {
        TheCustomer codeLean = new TheCustomer(12,"Phan",20);
        TheCustomer codeLean1 = new TheCustomer(12,"Phan",20);
        Invoice Iv = new Invoice(1,codeLean,5);
        System.out.println(Iv.getAmountAfterDiscount(35,20));

    }

    }

