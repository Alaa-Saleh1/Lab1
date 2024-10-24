import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Ex1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
          two numbers , takes two numbers as input */

//        System.out.println("Please enter first number : ");
//        int number1 = input.nextInt();
//
//        System.out.println("Please enter second number : ");
//        int number2 = input.nextInt();
//
//        System.out.println(number1+" + "+number2+ " = " +(number1+number2) );
//        System.out.println(number1+" - "+number2+ " = " +(number1-number2) );
//        System.out.println(number1+" * "+number2+ " = " +(number1*number2) );
//        System.out.println(number1+" / "+number2+ " = " +(number1/number2) );
//        System.out.println(number1+" % "+number2+ " = " +(number1%number2) );



        /*Ex2. Write a Java program that takes a number as input and prints its multiplication table up to 10. */

//        System.out.println("Please enter a number to calculate the multiplication table :  ");
//        int number =input.nextInt();
//
//        System.out.println("Multiplication table "+number);
//        for (int i=1 ; i<=10 ; i++){
//            System.out.println(number+" x "+i+" = "+(number*i));
//        }


        /*Ex3. Write a Java program to print the area and perimeter of a circle.*/

//        System.out.println("Please enter the Radius of circle: ");
//        double radius = input.nextDouble();
//        double pi = 3.142857142857143;
//        double perimeter = 2 * pi *radius;
//        double area = pi *(radius * radius);
//
//        System.out.println("Perimeter is = "+perimeter);
//        System.out.println("Area is = "+area);


        /*Ex4.  Java program to find out the average of a set of integers */

//        System.out.print("Please enter the count of numbers to find out the average : ");
//        int count = input.nextInt();
//        int sumNumber =0 ;
//
//        for (int i =1; i<=count;i++){
//            System.out.println("Enter an integer: ");
//            int number = input.nextInt();
//            sumNumber+=number;
//        }
//        System.out.println("The average is: "+sumNumber/count);

        /*Ex5. Write a Java program that accepts three integers as input, adds the first two integers
          together, and then determines whether the sum is equal to the third integer. */
//
//        System.out.println("Please Input the first number : ");
//        int number1 = input.nextInt();
//        System.out.println("Please Input the second number : ");
//        int number2 = input.nextInt();
//        System.out.println("Please Input the third number : ");
//        int number3 = input.nextInt();
//
//        if (number1+number2==number3){
//            System.out.println("The result is: true");
//        } else System.out.println("The result is: false");


        /*Ex6. Write a Java program to reverse a word.*/

//        System.out.println("Please write a word to reverse :");
//        String word=input.nextLine();
//        String revWord="";
//        for (int i = word.length()-1;i>=0;i--){
//            revWord+=word.charAt(i);
//        }
//        System.out.println("Reverse word: "+revWord);

        /*Ex7 -  Java program to check whether the given number is even or odd*/

//        System.out.println("Please enter number to check its even or odd: ");
//        int number = input.nextInt();
//
//        if(number%2==0){
//            System.out.println("The number is Even .");
//        } else System.out.println("The number is Odd");

        /*Ex8 - Java program to convert the temperature in Centigrade to Fahrenheit */

//        System.out.println("Please enter temperature in Centigrade: ");
//        int centigrade=input.nextInt();
//        double fahrenheit = centigrade * 1.8 + 32 ;
//        System.out.println("Temperature in Fahrenheit is: "+fahrenheit);

        /*Ex9.Write a Java program that takes a string and a number from the user,then prints the
character in the given index. */

//        System.out.println("Please input a String : ");
//        String aString = input.nextLine();
//        System.out.println("Please input a number ");
//        int numIndex= input.nextInt();
//
//        System.out.println("The character in the index number "+numIndex+" is "+aString.charAt(numIndex));



        /*Ex10. Write a Java program to print the area and perimeter of a rectangle.*/

//        System.out.println("Please enter Width of Rectangle: ");
//        double wigth = input.nextDouble();
//        System.out.println("Please enter Height of Rectangle: ");
//        double height = input.nextDouble();
//        double area = wigth * height;
//        double perimeter = 2 * (wigth+height);
//        System.out.println("Area is "+wigth+" * "+height+" = "+area);
//        System.out.println("Perimeter is "+wigth+" * "+height+" = "+perimeter);

        /*Ex11. Write a Java program to compare two numbers. */

//        System.out.println("Please Input the first number : ");
//        int number1 = input.nextInt();
//        System.out.println("Please Input the second number : ");
//        int number2 = input.nextInt();

//        if (number1==number2){
//            System.out.println(number1+" == "+number2);
//        }else System.out.println(number1+" != "+number2);
//
//        if (number1 > number2){
//            System.out.println(number1+" > "+number2);
//        } else System.out.println(number1+" < "+number2);
//
//        if (number1 >= number2){
//            System.out.println(number1+" >= "+number2);
//        }else
//            System.out.println(number1+" <= "+number2);


        /*Ex12 12. Write a Java program to convert seconds to hours, minutes and seconds. */

//        System.out.println("Please input seconds");
//        int inputSecond = input.nextInt();
//
//        int hours=0;
//        int minutes=0;
//        int second=inputSecond;
//        while (second>=3600){
//            hours++;
//            second-=3600;
//        }
//        while (second>=60){
//            minutes++;
//            second-=60;
//        }
//
//        System.out.printf("%02d:%02d:%02d",hours,minutes,second);


        /*Ex13. Write a Java program that accepts four integers from the user and prints equal if all
four are equal, and not equal otherwise. */

//        System.out.println("Please enter four integer"+"/nEnter first number:");
//        int number1 = input.nextInt();
//        System.out.println("Enter second number: ");
//        int number2 = input.nextInt();
//        System.out.println("Enter third number: ");
//        int number3 = input.nextInt();
//        System.out.println("Enter fourth number: ");
//        int number4 = input.nextInt();
//
//        if (number1==number2 && number2==number3 && number3==number4){
//            System.out.println("Number are equal.");
//        }else System.out.println("Number are not equal! ");

        /*Ex14. Write a Java program that reads an integer and check whether it is negative, zero, or
          positive.*/


//        System.out.println("Please enter a number: ");
//        int number = input.nextInt();
//
//        if(number>0){
//            System.out.println("Number is positive.");
//        } else if (number<0) {
//            System.out.println("Number is negative.");
//        }else System.out.println("Number is zero");




        /*Ex15.Write a program to enter the numbers till the user wants and at the end it
           should display the count of positive, negative and zeros entered  (End loop use -1 ,
           Don’t count -1).*/

//        int countPositive= 0;
//        int countNegative= 0;
//        int countZero= 0 ;
//       while (true){
//           System.out.println("Please enter a number: ");
//           int number = input.nextInt();
//
//        if (number == -1){
//            break;
//        }
//        if(number>0){
//            countPositive++ ;
//        } else if (number<0) {
//           countNegative++ ;
//        }else
//        countZero++;
//       }
//
//        System.out.println(+countPositive+" positive \n"+countNegative+" negative \n"+countZero+" zero");



        /*Ex16 - Write a program that prompts the user to input an integer and then outputs the
          number with the digits reversed. */

//        System.out.println("Please enter integer number: ");
//        int number = input.nextInt();
//        int revNumber = 0;
//        while (number != 0) {
//            int n = number % 10;
//            revNumber = revNumber * 10 + n;
//            number /= 10;
//        }
//       System.out.println("Reversed number: " + revNumber);

        /*Ex17 - Write a program to enter the numbers till the user wants and at the end the
          program should display the largest and smallest numbers entered. */

//        int large = Integer.MIN_VALUE;
//        int small = Integer.MAX_VALUE;
//        int number;
//
//        System.out.println("Please enter numbers or -1 to stop");
//
//        while (true) {
//            System.out.print("Enter number: ");
//            number = input.nextInt();
//
//            if (number == -1) {
//                break;
//            }
//            if (number > large) {
//                large = number;
//            }
//            if (number < small) {
//                small = number;
//            }
//        }
//            System.out.println("the large number: " + large);
//            System.out.println("the small number: " + small);



        /*Ex18 - Determine and print the number of times the character ‘a’ appears in the input
          entered by the user. */
//
//        System.out.println("Please Enter String: ");
//        String inputString = input.nextLine();
//        int count = 0;
//        for (int i = 0; i < inputString.length(); i++) {
//            if (inputString.charAt(i) == 'a')
//                count++;
//        }
//        System.out.println("Number of a's: " + count);




    }
}