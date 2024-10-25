import java.util.Scanner;

class ATM {

    float Balance;
    int PIN = 5674;

    public void checkpin() {
        System.out.print("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
        }
    }
}



