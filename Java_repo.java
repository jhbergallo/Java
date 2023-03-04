import java.util.*;
public class BibliotecaJH{

  public static void main(String args[]){
                
    Scanner in=new Scanner(System.in);
    System.out.println("\f");
    System.out.println("\n Type in the radius size= ");
    
    double radius2=in.nextDouble();
    
    System.out.print("\n The circle area is: "+ circleArea(radius2));
    
    double circumference=2*Math.PI*radius2;
    
    System.out.print("\n The circle's circumference is: "+ circumference);

 }

 public static int menu(){
    //pre-made menu to be used 

    Scanner in = new Scanner(System.in);

    System.out.println("Main Menu");
    System.out.println("(0) Leave.");
    System.out.println("(1) ");
    System.out.println("(2)");
    System.out.println("(3)");
    System.out.println("(4)");
    System.out.println("(5)");
    System.out.println("(6)");

    int opI = in.nextInt();
    return opI;
 }

    //matrix 
  

    public void printMatrixInt(int [][]m){
      for (int i = 0; i < m.length(); i++){
        System.out.print("\n this is the line" + (i + 1) + " --> "); 
        for (int j = 0; j < m[0].length; j++){
          System.out.print("[" + m[i][j] + "]" + " ");
        }
        System.out.print();
      }
    }

    public void printMatrixDouble( double [][]m){
      for (int i = 0; i < m.length(); i++){
        System.out.print("\n this is the line" + (i + 1) + " --> "); 
        for (int j = 0; j < m[0].length; j++){
          System.out.print(" " + m[i][j] + " ");
        }
        System.out.print();
      }
    }

    public void printMatrixStr(String [][]m){
      for (int i = 0; i < m.length(); i++){
        System.out.print("\n this is the line" + (i + 1) + " --> "); 
        for (int j = 0; j < m[0].length; j++){
          System.out.print(m[i][j] + " ");
        }
        System.out.print();
    }

    public int[] diagonalInt(int[][] matrix){
      //prints the main diagonal of a square matrix and returns an array with its terms

      int[] diag = new int[matrix.length];
      System.out.print("\n|");
      for (int i = 0; i < matrix.length; i++){
        diag[i] = matrix[i][i];
        System.out.print("|" + matrix[i][i] + "|");
      }
      System.out.print("|");
      return diag;
    }

    public double[] diagonalDouble(double[][] matrix){
      //prints the main diagonal of a square matrix of doubles and returns an array with these terms

      double[] diag = new double[matrix.length];
      System.out.print("\n|");
      for (int i = 0; i < matrix.length; i++){
        diag[i] = matrix[i][i];
        System.out.print("|" + matrix[i][i] + "|");
      }
      System.out.print("|");
      return diag;
    }

    public int[] secondaryInt(int[][] matrix){
      //prints the secondary diagonal of a square matrix of integers and returns an array with these terms

      int [] diag = new int[matrix.length];
      System.out.print("\n|");
      for (int i = 0; i < matrix.length; i++){
        diag[i] = matrix[i][matrix[i].length-i-1];
        System.out.print("|" + matrix[i][matrix[i].length-i-1] + "|")
      }
      return diag;
    }

    public double[] secondaryDouble(double[][] matrix){
      //prints the secondary diagonal of a square matrix of doubles and returns an array with these terms
      double [] diag = new double[matrix.length];
      System.out.print("\n|");
      for (int i = 0; i < matrix.length; i++){
        diag[i] = matrix[i][matrix[i].length-i-1];
        System.out.print("|" + matrix[i][matrix[i].length-i-1] + "|")
      }
      return diag;
    }

    public boolean diagonalMatrixInt(int[][] matrix){
      //checks if a matrix is diagonal(int)

      for (int i = 0; i < matrix.length; i++){
        for (int j = o; j < matrix[i].length; j++){
          i (i!=j){
            if (matrix[i][j]!=0){
              return false;
            }
          }
        }
      }
      return true;
    }

    public boolean diagonalMatrixDouble(double[][] matrix){
      //checks if a matrix is diagonal(double)

      for (int i = 0; i < matrix.length; i++){
        for (int j = o; j < matrix[i].length; j++){
          if (i!=j){
            if (matrix[i][j]!=0){
              return false;
            }
          }
        }
      }
      return true;
    }

    public boolean unitMatrixInt(int[][] matrix){
      //checks if the matrix is a unit matrix(int)

      for (int i = 0; i < matrix.length; i++){
        for (int j = o; j < matrix[i].length; j++){
          if (i==j){
            if (matrix[i][j]!=1){
              return false;
            }
          } else if (matrix[i][j]!=0){
              return false;
          }
        }
      }
      return true;
    }

    public int [][] matrixSumInt(int[][] matrix1, int[][] matrix2){
      //sums the elements of two integer matrices of the same size

      for (int i = 0; i < matrix1.length; i++){
        matrix1[i] = arraySumInt(matrix1[i], matrix2[i]);
      }
      return matrix1;
    }

    public int [][] matrixSumDouble(double[][] matrix1, double[][] matrix2){
      //sums the elements of two double matrices of the same size

      for (int i = 0; i < matrix1.length; i++){
        matrix1[i] = arraySumDouble(matrix1[i], matrix2[i]);
      }
      return matrix1;
    }

    public int[][] matrixProductInt(int[][] matrix1, int[][] matrix2){
      //multiplies the elements of two integer matrices of the same size

      for (int i = 0; i < matrix1.length; i++){
        matrix1[i] = arrayProductInt(matrix1[i], matrix2[i]);
      }
      return matrix1;
    }

    public int[][] matrixProductDouble(int[][] matrix1, int[][] matrix2){
      //multiplies the elements of two integer matrices of the same size

      for (int i = 0; i < matrix1.length; i++){
        matrix1[i] = arrayProductDouble(matrix1[i], matrix2[i]);
      }
      return matrix1;
    }



    //array



    public int[] arraySum(int[] array1, int[] array2){
      
      int[] arrayS = new int[array1.length];
      for (int i = 0; i < array1.length; i++){
          arrayS[i] = array1[i] + array2[i];
      }
      return arrayS;
    }

    public int[] arraySumInt(int[] array1, int[] array2){
      //sums the elements of two integer arrays

      if (array1.length < array2.length){
        int[] aux = array1;
        array1 = array2;
        array2 = aux;
      }
      for (int i = 0; i < array1.length; i++){
          array1[i] = array1[i] + array2[i];
      }
      return array1;
    }

    public int[] arraySumDouble(double[] array1, double[] array2){
      //sums the elements of two double arrays

      if (array1.length < array2.length){
        double[] aux = array1;
        array1 = array2;
        array2 = aux;
      }
      for (int i = 0; i < array1.length; i++){
          array1[i] = array1[i] + array2[i];
      }
      return array1;
    }

    public int[] arrayProductInt(int[] array1, int[] array2){
      //multiplies the elements of integer two arrays and generates it in another array

      if (array1.length < array2.length){
        int[] aux = array1;
        array1 = array2;
        array2 = aux;
      }
      for (int i = 0; i < array1.length; i++){
        array1[i] = array1[i] * array2[[i]];
      }
      return array1;
    }

    public int[] arrayProductDouble(double[] array1, double[] array2){
      //multiplies the elements of double two arrays and generates it in another array

      if (array1.length < array2.length){
        double[] aux = array1;
        array1 = array2;
        array2 = aux;
      }
      for (int i = 0; i < array1.length; i++){
        array1[i] = array1[i] * array2[[i]];
      }
      return array1;
    }

    public int scalarProduct(int[] array1, int[] array2){
      //receives two arrays and returns the scalar product or dot product of those arrays

      int sum = 0;
      
      for (int i = 0; i < array1.length; i++){
        sum = sum + array1[i] * array2[i];
      }
      return sum;
    }

    public int[] smallerInArray(int [] array){
      //receives an array and returns its smallest number 

      int small = array[0];
      
      for (int i = 1; i < array.length; i++){
        if (array[i] < small){
          small = array[i];
        }
      }
      return small;
    }

    public int frequency(int[] array){
      //receives an array and returns the frequency of the smallest number stored in it

      int small = smallerInArray(array);
      int sum = 0;

      for (int i = 1; i < array.length; i++){
        if (array[i] == small){
          sum++;
        }
      }
      return sum;
    }

    public double[] arrayUnionDouble(double[] array1, double[] array2){
      //makes the union between two arrays, assuming that the elements aren't repeated inside their own array

      int count = 0;
      double[] temp = new double[array2.length];
      int tempIndex = 0;

      int size1 = array1.length;
      int size2 = array2.length;

      boolean single = true;
      for (int i = 0; i < size2; i++){
        for (int j = 0; j < size1; j++){
          if (array2[i] == array1[j]){
            count++;
            single = false;
          }
        }
        if (single){
          temp[tempIndex] = array2[i];

          tempIndex++;
        }
        single = true;
      }

      double[] array3 = new double[size1 + size2 - count];

      for (int i = 0; i < size1; i++){
        array3[i] = array1[i];
      }
      for (int i = 0; i < (size2 - count); i++){
        array3[size1 + i] = temp[i];
      }
      return array3;
    }

    public int[] arrayIntersection(int[] array1, int[] array2){
      //makes the intersection between two integer arrays, assuming that no elements are repeated inside their own array

      int[] temp = new int[array1.length];

      int tempIndex = 0;

      for (int i = 0; i < array1.length; i++){
        for (int j = 0; j < array2.length; j++){
          temp[tempIndex] = array1[i];
          tempIndex++;
          break;
        }
      }

      int[] array3 = new int[tempIndex];

      for (int i = 0; i < tempIndex; i++){
        array3[i] = temp[i];
      }
      return array3;
    }

    public double[] arrayIntersectionDouble(int[] array1, int[] array2){
      //makes the intersection between two double arrays, assuming that no elements are repeated inside their own array

      double[] temp = new double[array1.length];

      int tempIndex = 0;

      for (int i = 0; i < array1.length; i++){
        for (int j = 0; j < array2.length; j++){
          temp[tempIndex] = array1[i];
          tempIndex++;
          break;
        }
      }

      double[] array3 = new double[tempIndex];

      for (int i = 0; i < tempIndex; i++){
        array3[i] = temp[i];
      }
      return array3;
    }


    //numbers and formulas 




   public double biggestTwo(double a, double b){
     //returns the biggest of two numbers
       return (a + b + Math.abs(a - b))/2;
   }

   public double biggestThree(double a, double b, double c){
     //returns the biggest of three numbers
        double aEb = (a + b + Math.abs(a - b))/2;
        if (aEb > c) {
            return aEb;
        } else {
            return c;
        }
   }

   public double biggest3(double a, double b, double c){
     //another way of returning the biggest of 3 numbers
        if (a > b) {
            if (a > c){
                return a;
            } else {
                return c;
            }
        } else {
            if (b>c){
                return b;
            } else {
                return c;
            }
        }
   }

   public void bhaskara (String args[]){
     //calculates the bhaskara formule
        Scanner read = new Scanner(System.in);
        System.out.println("\fType a");
        double a = read.nextDouble();
        System.out.println("Type b");
        double b = rad.nextDouble();
        System.out.println("Type c:");
        double c = read.nextDouble();
        if (a == 0){
            System.out.println("Not a second degree function");
        } else{
           double delta = (b*b) - (4*a*c);
           if (delta < 0){
               System.out.println("Doesn't have a root");
            } else {
                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("x1= " + Math.round(x1) + " x2= " + Math.round(x2));
            }
        }
    }

   public int reverseNumber(int number){
     //reverses the order of a number
       int cent = number/100;
       int rest = number%100;
       int ten = rest/10;
       int unit = rest%10;
       int result = (unit * 100) + (ten * 10) + (cent * 1);
       return result;
    }

    public int dividers(int num){
      //returns the number of dividers of a number
        int i = 0;
        for (int predecessor = 1; predecessor <= num; predecessor++){
            if (numero%antecessor == 0)
                i++;
        }
        return i;
   }

   public void dividers1(int num){
     //returns the dividers of a number and their sum
       System.out.print("\f");
       int i = 0;
       int predecessor = 1;

       while (predecessor <= num){
           if (num%predecessor == 0){
               i++;
               System.out.print(predecessor + " ");
           }
           antecessor++;
       }
       System.out.println("\n" + i);
   }

    public void dividersSum(int num){
      //receives a number and returns its dividers and the amount of dividers
       System.out.print("\f");
       int i = 0;
       int antecessor = 1;
       int sum = 0;
       while (predecessor <= num){
           if (num%predecessor == 0){
               i++;
               sum = predecessor + sum;
           }
           predecessor++;
       }
       System.out.println(sum);
       System.out.println("\n" + i);
   }

   public int dividersAmount(int num){ 
      //receives an integer number and returns its amount of dividers using a for loop
                
      int count = 0;                 
      for (int predecessor = 1; predecessor <= num; predecessor++){
        if (num%predecessor == 0)
            count++; 
        } 
        return count;
  }

    public int sumFor(int num){
      //receives a number and return the sum of its dividers using for loop
       int i = 0;
       int sum = 0;
       for (int predecessor = 1; predecessor <= num; predecessor++){
           if (num%predecessor == 0){
               i++;
               sum = antecessor + sum;
           }
       }
       return sum;
   }

    public boolean evenOdd(int num){
      //boolean method to see if a number is even or odd
        if(num%2==0){
          return true;
        } else {
          return false;
        }
    }

     public void evenOdd2(int num){
       //same method as above but using void instead

        if(num%2==0){
           System.out.print("The number is even");
        } else{
           System.out.print("The number is odd");
        }
    }

    public boolean divider(int num1, int num2){
       //returns true or false if num2 is divisible by num1
        if(num2%num1==0){
            return true;
        } else {
            return false;
        }
    }

    public boolean multiple(int num1, int num2){
      //returns true or false if num2 is a multiple of num2
        if(num1%num2==0){
            return true;
        } else
            return false;
          }
    }

    public void ascendingOrder(int num1, int num2, int num3){
      //receives three numbers and returns them in ascending order
        if(num1 < num2 && num1 < num3 && num2 < num3) {System.out.print(num1 + "," + num2 + " e " + num3);}
            else if(num1 < num2 && num1 < num3 && num3 < num2){ System.out.print(num1 + "," + num3 + " e " + num2);}
            else if(num2 < num1 && num2 < num3 && num1 < num3){ System.out.print(num2 + "," + num1 + " e " + num3);}
            else if(num2 < num1 && num2 < num3 && num3 < num2){ System.out.print(num2 + "," + num3 + " e " + num1);}
            else if(num3 < num1 && num3 < num2 && num2 < num3){ System.out.print(num3 + "," + num2 + " e " + num3);}
            else if(num3 < num1 && num3 < num2 && num3 < num2){ System.out.print(num3 + "," + num3 + " e " + num2);}
            else { System.out.print("\fThere are equal numbers");}
    }

    public void descendingOrder(int num1, int num2, int num3){
      //receives three numbers and returns them in descending order
        if(num1 > num2 && num1 > num3 && num2 > num3){ System.out.print(num1 + "," + num2 + " e " + num3);}
        else if(num1 > num2 && num1 > num3 && num3 > num2){ System.out.print(num1 + "," + num3 + " e " + num2);}
        else if(num2 > num1 && num2 > num3 && num1 > num3){ System.out.print(num2 + "," + num1 + " e " + num3);}
        else if(num2 > num1 && num2 > num3 && num3 > num2){ System.out.print(num2 + "," + num3 + " e " + num1);}
        else if(num3 > num1 && num3 > num2 && num2 > num3){ System.out.print(num3 + "," + num2 + " e " + num3);}
        else if(num3 > num1 && num3 > num2 && num3 > num2){ System.out.print(num3 + "," + num1 + " e " + num2);}
        else { System.out.print("\fThere are equal numbers");}
    }

   public void sign(int day, int month){
     //receives a day and a month and returns the zodiac sign of that date
        if(day >= 21 && month == 3 || day <=20 && month == 4){       System.out.print("Aries");}
        else if(day >= 21 && month == 4  || day <=20 && month == 5){ System.out.print("Taurus");}
        else if(day >= 21 && month == 5  || day <=20 && month == 6){ System.out.print("Gemini");}
        else if(day >= 21 && month == 6  || day <=21 && month == 7){ System.out.print("Cancer");}
        else if(day >= 22 && month == 7  || day <=22 && month == 8){ System.out.print("Leo");}
        else if(day >= 23 && month == 8  || day <=21 && month == 9){ System.out.print("Virgo");}
        else if(day >= 22 && month == 9  || day <=22 && month == 10){System.out.print("Libra");}
        else if(day >= 23 && month == 10 || day <=21 && month == 11){System.out.print("Scorpion");}
        else if(day >= 22 && month == 11 || day <=21 && month == 12){System.out.print("Sagittarius");}
        else if(day >= 22 && month == 12 || day <=20 && month == 1){ System.out.print("Capricorn");}
        else if(day >= 22 && month == 1  || day <=19 && month == 2){ System.out.print("Aquarius");}
        else if(day >= 20 && month == 2  || day <=20 && month == 3){ System.out.print("Pisces");}

        else{ System.out.print("\fThe date is invalid.");}
   }

   //Strings and words

   public void vowels(String args[]){
     //returns the amount of vowels and consonants of a name
       Scanner in = new Scanner(System.in);
       System.out.println("\fType in the name");
       String name = in.nextLine();
       System.out.println("The typed name was " + name);
       name = name.replaceAll(" ", "").toLowerCase();
       int vowels = 0;
       int consonants = 0;
       int nameLength = name.length();
       for (int i = 0; i < nameLength; i++){
           char letter = name.charAt(i);
           switch(letter){
               case 'a': vowels++;break;
               case 'e': vowels++;break;
               case 'i': vowels++;break;
               case 'o': vowels++;break;
               case 'u': vowels++;break;
            }
        }
       consonants = nameLength - vowels;
       System.out.println("The typed name has " + vowels + " vowels and " + consonants + " consonants.");
   }
   public void smallerString(String str1, String str2){
      //receives two strings and prints the smallest of them

      int qnt1 = 0;
      int qnt2 = 0;

      for (int i = 0; i < str1.length(); i++){
        if (str1.charAt(i) == ' '){
          qnt1++;
        }
      }

      for (int i = 0; i < str2.length(); i++){
        if (str2.charAt(i) == ' '){
          qnt2++;
        }
      }

      if (qnt1 < qnt2){
        System.out.print(str1);
      } else {
        System.out.print(str2);
      }
   }


   //Geometric shapes

   public double squareArea (double side){
     //returns the area of a square
        return side*side;
    }

   public double rectangleArea (double side1, double side2){
     //receives both sides of the rectangle and multiplies them
        return side1*side2;
    }

   public double circleArea (double radius){
     //receives the radius of a circle and returns the area
        return Math.PI*radius*radius;

    }

   public double triangleArea (double base, double height){
     //receives the base and height of a triangle and returns its area
        return (base*height)/2.;
    }

    public boolean confirmTriangle(double side1, double side2, double side3){
      //receives the values of three sides and returns a boolean value if it is a triangle
        if(side1 <= 0 || side2 <= 0 || side3 <= 0){
        return false;
        } else{ 
          return true;
          }
    }

    public void triangleType(double side1, double side2, double side3){
        if (side1 >= 0 && side2 >= 0 && side3 >= 0){
            if(side1 == side2 && side1 == side3 && side2 == side3)
                System.out.print("\fThe triangle is equilateral.");
            else if (side1 != side2 && side1 != side3 && side2 != side3)
                System.out.print("\fThe triangle is scalene.");
            else if (side1 == side2 || side2 == side3 || side1 == side3)
                System.out.print("\fThe triangle is isosceles.");
        
        }else System.out.print("\fThis is not a triangle.");
                }

   public double parallelepipedVolume(double side1, double side2,double side3){
     //receives tne three sides of a parallelepiped and returns the volume
        return (side1*side2*side3);
    }

   public double pyramidVolume(double baseSide1,double baseSide2,double height){
     //receives the base sides and the height of a pyramid and returns the volume
        return (baseSide1*baseSide2*height)/3.;
    }

   public double cilinderVolume(double radius,double height){
     //receives the base radius and the height of a cilinder and returns its volume
        return (Math.PI*Math.pow(radius,2)*height);
    }

   public double sphereVolume(double radius){
     //receives the radius of a sphere and returns its volume
        return (4*Math.PI*Math.pow(radius,3)/3);
    }

   public double parallelepipedSurface(double side1, double side2,double side3){
     // returns the surface area of a parallelepiped
        return (2*side1*side2+2*side1*side3+2*side2*side3);
    }

   public double pyramidSurface(double baseSide1,double baseSide2,double height){
     //receives the base sides and the height of a pyramid and returns its surface area
        double heightSide1 = Math.sqrt( Math.pow(baseSide1/2.,2) + Math.pow(height,2));
        double heightSide2 = Math.sqrt( Math.pow(baseSide2/2.,2) + Math.pow(height,2));
        double areaTriangle1 = (heightSide1*heightSide1)/2.;
        double areaTriangle2 = (heightSide2*heightSide2)/2.;
        return (2*(areaTriangle1)+2*(areaTriangle2)+ baseSide1*baseSide2);
    }

   public double cilinderSurface(double radius,double height){
     //receives the base radius and the height of a cilinder and returns its surface area
        return (2*Math.PI*Math.pow(radius,2)+2*Math.PI*radius*height);
    }

   public double sphereSurface(double radius){
     //receives the radius of a sphere and returns its volume
        return (4*Math.PI*Math.pow(radius,2));
    }
}
