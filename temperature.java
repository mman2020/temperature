import java.util.Scanner;

public class originscale1s {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String originscale1 = "";
        String originscale2 = "";
        double temperature = 0.0;
        String destination1 = "";
        String destination2 = "";

        System.out.print("Enter a origin scale: ");
        originscale1 = in.nextLine();

        System.out.print("Enter a destination scale: ");
        destination1 = in.nextLine();

        if (originscale1 == "fahrenheit"){
          System.out.print("Enter a temperature: ");
          temperature = in.nextLine();
          System.out.printf("%,d.", temperature);
        } else if (originscale1 == "celsius") {
            System.out.print("Enter a temperature: ");
            temperature = in.nextLine();
            System.out.printf("%,d.", temperature);
        } else if (originscale1 == "kelvin") {
            System.out.print("Enter a temperature: ");
            temperature = in.nextLine();
            System.out.printf("%,d.", temperature);
        }


        in.close();
    }
}
