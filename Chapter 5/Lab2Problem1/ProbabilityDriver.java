package Lab2Problem1;


public class ProbabilityDriver
{
    public static void main(String[] args){
        Probability p1 = new Probability(6,10);
        Probability p2 = new Probability(3,7);
        
        
        
        System.out.println(p1);
        System.out.println(p2);
        
        System.out.println(p1.probabilityOR(p2, .1));
        System.out.println(p2.probabilityAND(p1));
    }
}
