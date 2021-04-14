package Class_9.chapter_1;

public class Practise_2
{
  double square(double s){
      double area = Math.pow(s,2);
      return area;
  }
    void rectArea(double l , double b){
      double area ;
      if(l != b){
          area = l * b ;
          System.out.println("A rectangle with width " + b + " and lenght " + l + " has an area of " + area);
      }
      else{
          area = square(l);
          System.out.println("This is a sqaure not a reactanle so with the side of " + l + " area of square is " + area);
      }
  }
}
