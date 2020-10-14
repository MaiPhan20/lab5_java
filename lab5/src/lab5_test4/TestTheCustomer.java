package lab5_test4;

import lab5_test.Author;

public class TestTheCustomer {
    public static void main(String[] args) {
        TheCustomer codeLean = new TheCustomer(111, "Phan", 'L');
        codeLean.setId(111);
        System.out.println(codeLean);
        System.out.println("Id is: "+codeLean.getId());
        System.out.println("Name is: "+codeLean.getName());
        System.out.println("Gender is: "+codeLean.getGender());

    }
}
