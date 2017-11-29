package Lab2Problem1;


/**
 * Write a description of class Probability here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Probability implements ProbabilityCalc
{
    private double favorable;
    private double sampleSpace;
    private double prob;
    
    public Probability(double fv, double ss)
    {
        // initialise instance variables
        this.favorable = fv;
        this.sampleSpace = ss;
    }
    
    public double calculateProbability(){
        return this.prob = this.favorable / this.sampleSpace;
    }
    
    public double probabilityOR(Probability p2, double overlap){
        return this.prob + p2.prob - overlap;
    }
    
    public double probabilityAND(Probability p2){
        return this.prob * p2.prob;
    }
    
    public String toString(){
        return "The probability is " + calculateProbability();
    }

}
