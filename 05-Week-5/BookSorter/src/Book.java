public class Book implements Comparable<Book> {
    private String name;
    private int pageNumbers;
    private String authorsName;
    private String publicationDate;

    public Book(String name, int pageNumbers, String authorsName, String publicationDate) {
        this.name = name;
        this.pageNumbers = pageNumbers;
        this.authorsName = authorsName;
        this.publicationDate = publicationDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return
                "Name: " + name + ", " +
                "Page Numbers: " + pageNumbers + ", " +
                "Author's Name: " + authorsName + ", " +
                "Publication Date: " + publicationDate;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }
}