package Lab3.Problem2;


// ***************************************************************

//   Shop.java

//

//   Uses the Item class to create items and add them to a shopping

//   cart stored in an ArrayList.

// ***************************************************************


import java.util.ArrayList;

import java.util.Scanner;


public class Shop

{

    public static void main (String[] args)

    {

        ArrayList<Item> cart = new ArrayList<Item>();


        Item item;

        String itemName;

        double itemPrice;

        int quantity;

        Scanner scan = new Scanner(System.in);


        String keepShopping = "y";


        while (keepShopping.equals("y")) 

            {

                System.out.print ("Enter the name of the item: ");

                itemName = scan.next();


                System.out.print ("Enter the unit price: ");

                itemPrice = scan.nextDouble();


                System.out.print ("Enter the quantity: ");

                quantity = scan.nextInt();


                // *** create a new item and add it to the cart

                Item thing = new Item(itemName, itemPrice, quantity);
                cart.add(thing);
                



                // *** print the contents of the cart object using println
                System.out.println("Your cart includes:");
                for(Item i : cart){
                    System.out.println(i);
                }


                System.out.print ("Continue shopping (y/n)? ");

                keepShopping = scan.next();

            }


        checkOut(cart);

    }
    


    public static void checkOut(ArrayList<Item> yourCart) {

        //You do NOT need a getter method (think about public instance variables)

        String removeItem = ""; 
        
        //Print the contents of the cart (you may use the toString() method

        Scanner scan = new Scanner(System.in);
        String itm;
        //Ask the user if they would like to remove an item.  If yes, remove that item.


        //Print final total of items and final price (total)
        System.out.println();
        System.out.println("Your cart includes:");
        for(Item i : yourCart){
            System.out.println(i);
        }
        
        System.out.println();
        
        System.out.println("Would you like to remove an item? (y/n)");
        removeItem = scan.next();
        
            if(removeItem.equals("y")){
                System.out.println("What index is the item you want to remove at");
                itm = scan.next();
                
                yourCart.remove(itm);
                
                
            }
                double total = 0;
                int i = 0;
                while(i < yourCart.size()){
                    total += yourCart.get(i).price * yourCart.get(i).quantity;
                    i++;
                }
                System.out.println("Your cart includes:");
                for(Item j : yourCart){
                    System.out.println(j);
                }
                System.out.println("Your total price is: " + total);
            
        
        

        


     }

}

