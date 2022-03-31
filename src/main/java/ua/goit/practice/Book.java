package ua.goit.practice;

public class Book {

    private String name;
    private String authorEmail;
    private String publicationYear;

    public Book(String name, String authorEmail, String publicationYear) {
        this.name = name;
        this.authorEmail = authorEmail;
        this.publicationYear = publicationYear;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }
}
