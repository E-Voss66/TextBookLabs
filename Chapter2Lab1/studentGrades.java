// ***************************************************************
//   grades.java
//
//   
// ***************************************************************
public class studentGrades
{
        // ------------------------
        // main prints the list
        // ------------------------
        public static void main (String[] args)
        {
            makeHeader();
            populateRows();
        }
        
        public static void makeHeader(){
            System.out.println ();
            System.out.println ("------------------------------------");
            System.out.println ("==\tStudent Points\t==");
            System.out.println ("------------------------------------");
            System.out.println ("Name\t\tLab\tBonus\tTotal");
            System.out.println ("-----\t\t---\t-----\t-----");
        }
        
        public static void populateRows(){
            populateOneRow("Erik",100,100);
            populateOneRow("Bob",5,6);
            populateOneRow("Jeh",60,6);
            populateOneRow("Noon",1,0);
            populateOneRow("Kim",99,1);
        }
        
        public static void populateOneRow(String name, int lab, int bonus){
            System.out.println(name + "\t\t" + lab + "\t" + bonus  + "\t" + (lab + bonus));
        }
}