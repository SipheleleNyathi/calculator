package za.ac.cput.calculator;

/**
 * @author SIPHELELE NYATHI
 * 16/03/2021
 * 218334028
 */

public class Division {

//returns results of division
    public  static int intDivision(int numerator, int denominator){
        if(denominator < 1)  return 0;
        return numerator / denominator;
    }
}
