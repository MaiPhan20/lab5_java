package lab5_test4;

public class TheCustomer {
    private int Id;
    private final String name;
    private final char gender;
    public TheCustomer(int Id,String name,char gender){
        this.Id=Id;
        this.name=name;
        this.gender=gender;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name +"("+ Id+ ")";
    }
}
