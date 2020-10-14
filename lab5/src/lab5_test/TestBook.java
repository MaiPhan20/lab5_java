package lab5_test;

public class TestBook {
    public static void main(String[] args) {
        Author codeLean = new Author("Code Lean","codeleanvn@gmail.com",'m');
        System.out.println("HelloBook");
        Book helloBook = new Book("Java",codeLean,123,333);
        System.out.println(helloBook);
        helloBook.setPrice(7.55);
        helloBook.setPrice(33);
        System.out.println(helloBook);
        System.out.println("Name is: "+helloBook.getName());
        System.out.println("Price is: "+helloBook.getPrice());
        System.out.println("Qty is: "+helloBook.getQty());
        System.out.println("Author is: "+helloBook.getAuthor());
        System.out.println("Author's name is: "+helloBook.getName());
        System.out.println("Author's Email is: "+helloBook.getEmail());
        System.out.println("Author's Gender is: "+helloBook.getGender());
    Book anotherBook = new Book("More Java",
            new Author("Han","Han@gmail.com",'m'),29.95,8);
        System.out.println(anotherBook);

    }
}
