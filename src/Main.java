import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double recWidth = 0;
        double recHeight = 0;
        String trash = "";

        System.out.println("Enter width of the rectangle: ");
        if(in.hasNextDouble())
        {
            recWidth = in.nextDouble();
            System.out.println("Enter height of rectangle: ");
            if(in.hasNextDouble())
            {
                recHeight = in.nextDouble();
                double recArea = recHeight * recWidth;
                System.out.println("Area: " + recArea);
                double recPer = (2 * recHeight) + (2 * recWidth);
                System.out.println("Perimeter: " + recPer);
                double recDiagonal = Math.sqrt((recHeight * recHeight) + (recWidth * recWidth));
                System.out.println("Length of Diagonal: " + recDiagonal);
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a number. Try again.");
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a number. Try again.");
        }

    }
}
