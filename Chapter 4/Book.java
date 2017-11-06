
public class Book
{
    private Author bookAuthor;
    private String title;

    public Book(Author athr, String ttl)
    {
        this.bookAuthor = athr;
        this.title = ttl;
    }
    public String toString(){
        return "This book's title is " + this.title + " and it is written by " + this.bookAuthor;
    }
    
    
    
    
    
}
