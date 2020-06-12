import java.lang.Math;

public class PythagoreanTheorem {
  public double calculateHypotenuse(int a,int b){

    double sideA = a * a;
    double sideB = b * b;
    double hypotenuse = Math.sqrt (sideA + sideB);
    return hypotenuse;


  }


}
