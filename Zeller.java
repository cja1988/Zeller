import java.util.Scanner;

public class Zeller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter year: ");
        int year = input.nextInt();

        System.out.println("Enter month: ");
        int month = input.nextInt();

        System.out.println("Enter the day of the month(1-31): ");
        int dayOfMonth = input.nextInt();


          if (month == 1){
            month = 13;
            year = year -1;
        }
        if (month == 2) {
            month = 14;
            year = year -1;
        }
        int yearOfCentury = year % 100;
        int century = year / 100;

       

        System.out.println(month);
        int dayOfWeek = ((dayOfMonth + (26*(month + 1)/10) + yearOfCentury + (yearOfCentury/4) + (century / 4) + (5 * century)) % 7);



        switch(dayOfWeek) {
            case 0: System.out.println("The day of the week is Saturday"); break;
            case 1: System.out.println("The day of the week is Sunday"); break;
            case 2: System.out.println("The day of the week is Monday"); break;
            case 3: System.out.println("The day of the week is Tuesday"); break;
            case 4: System.out.println("The day of the week is Wednesday"); break;
            case 5: System.out.println("The day of the week is Thursday"); break;
            case 6: System.out.println("The day of the week is Friday"); break;

        }
        System.out.println(185.5 % 7);
        System.out.println(dayOfWeek);


    }
}
