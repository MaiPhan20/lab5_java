package lab5_test;

public class tetstAuthor {
    public static void main(String[] args) {
        Author codeLean = new Author("Ha","ha@gmail.com",'L');
        codeLean.setEmail("ha@gmail.com");
        System.out.println(codeLean);
        System.out.println("Name is: "+codeLean.getName());
        System.out.println("Gender is: "+codeLean.getGender());
        System.out.println("Email is: "+codeLean.getEmail());
    }
}
