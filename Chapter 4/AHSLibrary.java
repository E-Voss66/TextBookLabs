
public class AHSLibrary
{
    
    
    public static void main(String[] args){
        Library ahs = new Library(10, "Acalanes");
 
        Author jane = new Author("Jane Doe", 55);
        Book bob = new Book(jane, "Blob");
        ahs.addBook(bob);
        
        Author blerb = new Author("Joe West", 21);
        Book thumb = new Book(blerb, "The Art of Thumbs");
        ahs.addBook(thumb);
        
        System.out.println(ahs);
    }

    
    
}
