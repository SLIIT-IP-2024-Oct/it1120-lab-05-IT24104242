import java.util.Scanner;

public class IT24104242Lab5Q2 {
   public static void main(String[]args) {
    //Declare the variables
     int numMembers;
    // Create a Scanner object to read input
    Scanner scanner = new Scanner(System.in);
   // Prompt user for input
   System.out.print("Enter the number of new numbers introduces: ");
   numMembers = scanner.nextInt();
   
  // Determine the prize based on the number of ne members
switch (numMembers) {
   
    case 0:
       System.out.println();
       System.out.println("No Prize");
        break;
    case 1:
       System.out.println();
       System.out.println(" Prize is a : Pen");
       break;
    case 2:
       System.out.println();
       System.out.println(" Prize is a : Umbrella");
       break;
    case 3:
       System.out.println();
       System.out.println("Prize is a : Bag");
       break;
 case 4:
       System.out.println();
       System.out.println("Prize is a : Travelling Chair");
       break;
default:
System.out.println("Prize is a : Headphone");


}
}
}






