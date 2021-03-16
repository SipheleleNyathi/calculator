package za.ac.cput.calculator;

public class Division {

//returns results of division
    public  static int intDivision(int numerator, int denominator){
        if(denominator < 1)  return 0;
        return numerator / denominator;
    }
}
