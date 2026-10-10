import java.util.*;  
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year = ");
        int year = sc.nextInt();
        if (year % 4 == 0 ){
            System.out.println("The given year is a leap year.");
        }else{
            System.out.println("The given year is not a leap year.");
        }sc.close();
    }
}


