
public class Name
{
    private String firstName, middleName, lastName;
    
    public Name(String first, String middle, String last)
    {
        this.firstName = first;
        this.middleName = middle;
        this.lastName = last;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getMiddleName(){
        return this.middleName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String firstMiddleLast(){
        return this.firstName + " " + this.middleName + " " + this.lastName;
    }
    
    public String lastMiddleFirst(){
        return this.lastName + ", " + this.middleName + " " + this.firstName;
    }
    
    public boolean equals(Name otherName){
        if(this.firstName.equalsIgnoreCase(otherName.firstName)){
            return true;
        }
        else {
            return false;
        }
    }
    
    public String initials(){
        String initial1, initial2, initial3;
        
        initial1 = this.firstName.substring(0,1);
        initial2 = this.middleName.substring(0,1);
        initial3 = this.lastName.substring(0,1);
        
        initial1.toUpperCase();
        initial2.toUpperCase();
        initial3.toUpperCase();
        
        return initial1 + "." + initial2 + "." + initial3;
    }
    
    public int length(){
        return this.firstName.length() + this.middleName.length() + this.lastName.length();
    }
}
