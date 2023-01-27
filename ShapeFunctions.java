import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
class ShapeFunctions{
  public static void main(String[] args)throws IOException{
    Scanner input = new Scanner(System.in);
    String in = input.nextLine();
    Scanner file = new Scanner(new File(in));
    int count = Integer.parseInt(file.nextLine());
    String data;
    String[][] arr = new String[count][];  
    String trim; 
    for (int i = 0; i < count; i++){
      data = file.nextLine();
      for (int a = 0; a < 2; a++){
       arr[i]= data.split(",");
      }     
    }
    for(int i = 0; i < count; i++){
      if(arr[i][0].equals("triangle")){              
        double num1 = Double.parseDouble(arr[i][1]);
        double num2 = Double.parseDouble(arr[i][2]);
        double answer = areaTriangle(num1, num2);   
        System.out.println("triangle:" + String.format("%.2f", answer));
      }     
      else if(arr[i][0].equals("rectangle")){
        double num1 = Double.parseDouble(arr[i][1]);
        double num2 = Double.parseDouble(arr[i][2]);
        double answer = areaRectangle(num1, num2);
        System.out.println("rectangle:" + String.format("%.2f", answer));
      }
      else if(arr[i][0].equals("square")){
        double num1 = Double.parseDouble(arr[i][1]);
        double answer = areaSquare(num1);
        System.out.println("square:" + String.format("%.2f", answer));
      }
      else{
        double num1 = Double.parseDouble(arr[i][1]);
        double answer = areaCircle(num1);
        System.out.println("circle:" + String.format("%.2f", answer));
      }
    }
    
  }  
  public static double areaTriangle(double in1, double in2){                        
    double t = in1 * in2*0.5;
    return t;
  } 
  public static double areaRectangle(double in1, double in2){
    double r = in1 * in2;
    return r;
  }
  public static double areaSquare(double in1){
    double s = in1 * in1;
    return s;
  }
  public static double areaCircle(double in1){
    double areaC = Math.pow(in1, 2);
    areaC = areaC * Math.PI;
    return areaC;
  }
}