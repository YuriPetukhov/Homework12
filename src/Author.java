public class Author {
    private String firstname;
    private String lastName;

    public Author(String lastName, String firstname){
        this.firstname = firstname;
        this.lastName = lastName;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }
}
