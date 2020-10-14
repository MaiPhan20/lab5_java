package lab5_test3;

import lab5_test.Author;

public class TestCustomer {
    public static void main(String[] args) {
        TheCustomer codeLean = new TheCustomer(12,"Phan",20);
        codeLean.setDiscount(20);
        System.out.println(codeLean);
        System.out.println("Id is : "+codeLean.getId());
        System.out.println("Name is: "+codeLean.getName());
        System.out.println("Dicount is %d %: "+codeLean.getDiscount());
    }
}
