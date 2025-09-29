import java.util.Scanner;
public class HealthKiosk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Ashesi Health Kiosk ");

        System.out.print("Enter service code (P/L/T/C):  ");
        char code  = input.next().charAt(0);

        code =  Character.toUpperCase(code);

        switch (code) {
            case 'P':
                System.out.print("Go to : Pharmacy Desk");
                break;
            case 'L':
                System.out.print("Go to : Lab Desk");
                break;
            case 'C':
                System.out.print("Go to : Counselling Desk");
                break;
            case 'T':
                System.out.print("Go to : Triage Desk");

                System.out.println("Select health metric: ");
                System.out.println("1. BMI calculation");
                System.out.println("2. Dosage round up ");
                System.out.println("3. Simple trig helper");
                System.out.println("Enter choice (1/2/3) : ");
                int choice = input.nextInt();
                if (choice == 1) {
                    System.out.print("Please enter your weight (kg): ");
                    double weight = input.nextDouble();
                    System.out.print("Please enter your height (m): ");
                    double height = input.nextDouble();
                    double bmi = weight / (height * height);
                    bmi = Math.round(bmi * 100) / 10.0;

                    String category;
                    if (bmi < 18.5) {
                        category = "Underweight";
                    } else if (bmi < 25.0) {
                        category = "Normal";
                    }else if (bmi < 30) {
                        category = "Overweight";
                    }else {
                        category = "Obese";
                    }

                    System.out.println("BMI is " + bmi + " Category " + category);

                }else if (choice == 2) {
                    System.out.print("Enter required dosage (mg): ");
                    double dosage = input.nextDouble();

                    int tablets = (int) Math.ceil(dosage / 250.0);
                    System.out.println("Tablets required: " + tablets);

                }else if (choice == 3) {
                    System.out.print(" Please enter the angle (degrees): ");
                    double angleD = input.nextDouble();
                    double angleR =  Math.toRadians(angleD);

                    double sinang = Math.round(Math.sin(angleR)*1000)/1000 ;
                    double cosang = Math.round(Math.cos(angleR)*1000)/1000 ;

                    System.out.println("Angle is " + angleD + "and the sin of the angle is " + sinang + "and the cos of the angle is " + cosang);


                }else {
                    System.out.println("Invalid metric choice");
                }

                break;
            default:
                System.out.println("Invalid service code ");
        }
        char letter = (char)('A'+ (int)(Math.random()*26));
        String digits = "";
        for (int i = 0; i < 4; i++) {
            int num = 3 + (int)(Math.random()*7);
            digits += num;
        }
        String studID = letter + digits;
        System.out.println("\nGenerated Student ID: " + studID);

        System.out.print("Enter your first name: ");
        String name = input.nextLine();

























    }
}
