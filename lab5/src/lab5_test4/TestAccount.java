package lab5_test4;

public class TestAccount {
    public static void main(String[] args) {
        TheCustomer a = new TheCustomer(1,"Phan",'L');
        System.out.println(a);
        Account b = new Account(4,a,12.3);
        System.out.println(b);
        b.setBalance(12.5,23);
        b.setCustomer(a);
        b.setId(12);
        System.out.println(""+b.withDraw(12));
    }
}
