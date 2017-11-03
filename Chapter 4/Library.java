
public class Library
{
    private Book[] inventory;
    private String librarian;
    private String libName;

    public Library(int number, String libNm, String lbn)
    {
        this.librarian = lbn;
        this.libName = libNm;
        this.inventory = new Book[number];
    }

    
}
