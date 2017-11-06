
public class Library
{
    private Book[] inventory;
    private String libName;
    private int index = 0;

    public Library(int size, String libNm)
    {
        this.libName = libNm;
        this.inventory = new Book[size];
    }
    public String toString(){
        String output = "The library has: \n";
        
        for(Book b : inventory){
            output += b + "\n";
        }
        
        return output;
    }
    
    public void addBook(Book otherBook){
        this.inventory[index] = otherBook;
        index++;
    }
    
    public void addBook(Book otherBook, int i){
        this.inventory[i] = otherBook;
    }

    
}
