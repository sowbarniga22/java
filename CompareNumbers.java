import java.util.Scanner;
public class CompareNumbers {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the first number:");
int num1 = sc.nextInt();
System.out.println("enter the second number:");
int num2 = sc.nextInt();
if(num1 > num2) {
System.out.println("the first number is larger:" +num1);
} else if (num1 < num2){
System.out.println("the second number is larger:" +num2);
} else {
System.out.println("both numbers are equal:");
}
}
}


