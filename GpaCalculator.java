import java.util.*;
public class GpaCalculator{
  public static void main(String[] args){
    //Variables and Scanner
    Scanner sc = new Scanner(System.in);
    double honorsAll = 0;
    int GPA = 0;
    double APAll = 0;
   
    
    
    System.out.println("Welcome to the GPA Calculator, This calculator will estimate the GPA of 6 classes." +
                       "\nFirst you will be asked how which classes are Honors then you will be asked which classes are AP." +
                       "\nYou will enter the grade letter for that class. (i.e. A,B,C,D,F)");
    System.out.println("Please enter which classes of yours are honors classes. \n(i.e. If your 1st and 4th classes are honors enter: 1,4. If there are no Honors classes enter 0.)");
    honorsAll = AskHonors(honorsAll);
    System.out.println("Please enter which classes of yours are AP classes. \n(i.e. If your 1st and 4th classes are AP enter: 1,4. If there are no AP classes enter 0.)");
    APAll = AskAP(APAll);
    System.out.println("Thank you, Now you may enter your letter grades for your classes with no spaces or commas.\n(i.e. ACAABD)");
    GPA = CalculateGpa(GPA);
    double finalGPA = (GPA + honorsAll) / 6;
    System.out.println("Your GPA estimate has been calculated! \nYOUR GPA IS: " + finalGPA);
      
    
  }
  public static double AskHonors(double honorsAll){
    Scanner sc = new Scanner(System.in);
    double honors1, honors2, honors3, honors4, honors5, honors6;
    honors1 = 0;
    honors2 = 0;
    honors3 = 0;
    honors4 = 0;
    honors5 = 0;
    honors6 = 0;
    String honorsClasses = sc.next();
    if(honorsClasses.indexOf("1")!=-1){
      honors1 = 0.5;
    }
      if(honorsClasses.indexOf("2")!=-1){
      honors2 = 0.5;
      }
      if(honorsClasses.indexOf("3")!=-1){
      honors3 = 0.5;
      }
      if(honorsClasses.indexOf("4")!=-1){
      honors4 = 0.5;
      }
      if(honorsClasses.indexOf("5")!=-1){
      honors5 = 0.5;
      }
      if(honorsClasses.indexOf("6")!=-1){
      honors6 = 0.5;
      }
      
      honorsAll = honors1 + honors2 + honors3 + honors4 + honors5 + honors6;
      return honorsAll;
    }
  public static double AskAP(double APAll){
    Scanner sc = new Scanner(System.in);
    double AP1, AP2, AP3, AP4, AP5, AP6;
    AP1 = 0;
    AP2 = 0;
    AP3 = 0;
    AP4 = 0;
    AP5 = 0;
    AP6 = 0;
    String APClasses = sc.next();
    if(APClasses.indexOf("1")!=-1){
      AP1 = 1.0;
    }
      if(APClasses.indexOf("2")!=-1){
      AP2 = 1.0;
      }
      if(APClasses.indexOf("3")!=-1){
      AP3 = 1.0;
      }
      if(APClasses.indexOf("4")!=-1){
      AP4 = 1.0;
      }
      if(APClasses.indexOf("5")!=-1){
      AP5 = 1.0;
      }
      if(APClasses.indexOf("6")!=-1){
      AP6 = 1.0;
      }
      
      APAll = AP1 + AP2 + AP3 + AP4 + AP5 + AP6;
      return APAll;
    }
  public static int CalculateGpa(int GPA){
    Scanner sc = new Scanner(System.in);
    String letterGrades = sc.next();
    int A = 4;
    int B = 3;
    int C = 2;
    int D = 1;
    int F = 0;
    
    int countA = letterGrades.length() - letterGrades.replace("A", "").length();
    int countB = letterGrades.length() - letterGrades.replace("B", "").length();
    int countC = letterGrades.length() - letterGrades.replace("C", "").length();
    int countD = letterGrades.length() - letterGrades.replace("D", "").length();
    int countF = letterGrades.length() - letterGrades.replace("F", "").length();
    
    GPA = (countA * A) + (countB * B) + (countC * C) + (countD * D) + (countF * F);
    return GPA;
    
      
  }
  
    
  }