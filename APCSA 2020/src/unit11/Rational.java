package unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
  //add two instance variables
  int numerator = 1;
  int denominator = 1;
  int gcf = 1;
  int newNum;
  int newDenom;

  //write two constructors
  public Rational(){
    
  }
  
  public Rational(int numr, int denm){
    setRational(numr,denm);
  }

  //write a setRational method
	public void setRational(int numr, int denm){
	  setNumerator(numr);
	  setDenominator(denm);
	}

  //write  a set method for numerator and denominator
  public void setNumerator(int numr){
    numerator = numr;
  }
  
  public void setDenominator(int denm){
    denominator = denm;
  }
	
  public void add(Rational  other)
  {
    //num1/den1 + num2/den2 
    //new numerator = (num1 * den2 + num2 * den1)
    //new denominator = (den1 * den2)
		numerator = numerator * other.getDenom() + other.getNum() * denominator;
		denominator = denominator * other.getDenom();
    reduce();
  }

  // reduce fraction to its simplest form by calling gcd
  private void reduce()
  {
    gcd(numerator, denominator);
    numerator /= gcf;
    denominator /= gcf;
  }

  // find the gcd of two numbers
  private void gcd(int numOne, int numTwo)
  {
    for (int i = 1; i<=numOne && i<=numTwo; i++){
      if (numOne % i == 0 && numTwo % i == 0)
      {
        gcf = i;
      }
    }
  }

  public Object clone ()
  {
    return "";
  }


  //ACCESSORS

  //write get methods for numerator and denominator
	public int getNum()
	{
	  return numerator;
	}
	
	public int getDenom()
	{
	  return denominator;
	}
	
  // return true if this object is the same as obj
  public boolean equals( Object other)
  {
    boolean temp = false;
  
    Rational rhs = (Rational)other;
    
    reduce();
    rhs.reduce();
    
    if (rhs.getNum() == numerator && rhs.getDenom() == denominator ){
      temp = true;
    }
   
    return temp;
  }


  public int compareTo(Rational other)
  {
    
    reduce();
    other.reduce();
    if (other.getNum() == numerator && other.getDenom() == denominator ){
      return 0;
    }
    else if (numerator*other.getDenom() >= other.getNum()*denominator){
      return 1;
    }
    else{
      return -1;
    }
  }

	
  //write  toString() method
	public String toString(){
	  return numerator + "/" + denominator;
	}
	
}