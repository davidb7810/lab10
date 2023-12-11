import java.util.Random;
import java.util.Scanner;

public class LAB10 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
        scan.close();
    }

    public static void Q1() {
        while (true) {
            System.out.println("Pick a shape: square, rectangle, circle (or 'q' to quit)");
            String input = scan.nextLine();
            if (input.equals("q")) {
                return;
            }


            if (input.equals("square")) {
                double a;
                System.out.println("Enter the length of side a: ");
                a = Double.parseDouble(scan.nextLine());
                System.out.println("The circumference of the square is: " + a * 4);
                System.out.println("The area of the square is: " + a * a);

            } else if (input.equals("rectangle")) {
                double a, b;
                System.out.println("Enter the length of side a: ");
                a = Double.parseDouble(scan.nextLine());
                System.out.println("Enter the length of side b: ");
                b = Double.parseDouble(scan.nextLine());
                System.out.println("The circumference of the rectangle is: " + (2 * a + 2 * b));
                System.out.println("The area of the rectangle is: " + (a * b));
            } else if (input.equals("circle")) {
                double r;
                System.out.println("Enter the radius: ");
                r = Double.parseDouble(scan.nextLine());
                System.out.println("The circumference of the circle is: " + (Math.PI * r * 2));
                System.out.println("The area of the circle is: " + (Math.PI * r * r));
            }
        }
    }

    public static void Q2() {
        System.out.println("Q2: Enter the current day (1-31): ");
        int num = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the current month: (1-12)");
        int num2 = Integer.parseInt(scan.nextLine());

        if (num == 1)
            System.out.print("You selected 1st of ");
        else if (num == 2)
            System.out.print("You selected 2nd of ");
        else if (num == 3)
            System.out.print("You selected 3rd of ");
        else if (num == 4)
            System.out.print("You selected 4th of ");
        else if (num == 5)
            System.out.print("You selected 5th of ");
        else if (num == 6)
            System.out.print("You selected 6th of ");
        else if (num == 7)
            System.out.print("You selected 7th of ");
        else if (num == 8)
            System.out.print("You selected 8th of ");
        else if (num == 9)
            System.out.print("You selected 9th of ");
        else if (num == 10)
            System.out.print("You selected 10th of ");
        else if (num == 11)
            System.out.print("You selected 11th of ");
        else if (num == 12)
            System.out.print("You selected 12th of ");
        else if (num == 13)
            System.out.print("You selected 13th of ");
        else if (num == 14)
            System.out.print("You selected 14th of ");
        else if (num == 15)
            System.out.print("You selected 15th of ");
        else if (num == 16)
            System.out.print("You selected 16th of ");
        else if (num == 17)
            System.out.print("You selected 17th of ");
        else if (num == 18)
            System.out.print("You selected 18th of ");
        else if (num == 19)
            System.out.print("You selected 19th of ");
        else if (num == 20)
            System.out.print("You selected 20th of ");
        else if (num == 21)
            System.out.print("You selected 21st of ");
        else if (num == 22)
            System.out.print("You selected 22nd of ");
        else if (num == 23)
            System.out.print("You selected 23rd of ");
        else if (num == 24)
            System.out.print("You selected 24th of ");
        else if (num == 25)
            System.out.print("You selected 25th of ");
        else if (num == 26)
            System.out.print("You selected 26th of ");
        else if (num == 27)
            System.out.print("You selected 27th of ");
        else if (num == 28)
            System.out.print("You selected 28th of ");
        else if (num == 29)
            System.out.print("You selected 29th of ");
        else if (num == 30)
            System.out.print("You selected 30th of ");
        else if (num == 31)
            System.out.print("You selected 31st of ");
        else {
            System.out.println("Invalid day");
        }

        if(num2 == 1) {
            System.out.println("January");
        } else if (num2 == 2) {
            if(num>28)
            {
                System.out.println("Invalid day");
            }
            else
            {
                System.out.println("February");
            }
        } else if (num2 == 3) {
            System.out.println("March");
        } else if (num2 == 4) {
            if(num==31)
            {
                System.out.println("Invalid day");
            }
            else {
            System.out.println("April");
            }
        } else if (num2 == 5) {
            System.out.println("May");
        } else if (num2 == 6) {
            if(num==31)
            {
                System.out.println("Invalid day");
            }
            else {
            System.out.println("June");
            }
        } else if (num2 == 7) {
            System.out.println("July");
        } else if (num2 == 8) {
            if(num==31)
            {
                System.out.println("Invalid day");
            }
            else {
            System.out.println("August");
            }
        } else if (num2 == 9) {
            System.out.println("September");
        } else if (num2 == 10) {
            if(num==31)
            {
                System.out.println("Invalid day");
            }
            else {
                System.out.println("October");
            }
        } else if (num2 == 11) {
            System.out.println("November");
        } else if (num2 == 12) {
            if(num==31)
            {
                System.out.println("Invalid day");
            }
            else {
            System.out.println("December");
            }
        } else {
            System.out.println("Invalid month");
        }
    }

public static void Q3() {
    System.out.println("Q3: Enter how many numbers you want to check for primality: ");
    int n = Integer.parseInt(scan.nextLine());
    int counter = 0;
    for (int i = 0; i < n; i++) {
    if (i < 2)
    continue;
    boolean check = true;

    for (int j = 2; j * j <= i; j++) {
    if (i % j == 0) {
    check = false;
    break;
    } else {

    }
    }
        if (check == true) {
        counter++;
        } 
        else {}
    }

        System.out.println("There are: " + counter + " primes between 0 and " + n);
    }

    public static void Q4() {
        Random random = new Random();

        String userInput;
        System.out.println("Q4: Let's play a game. Type \"A\" to attack, \"B\" to buff your next attack. Kill the enemy to win!");
        System.out.println("Q4: You must roll higher than the enemy armor class (12) to hit. Roll 20 for a critical hit!");
        System.out.println("Q4: Your damage is 2-16 (2d8)");

        int enemyHP = 100;
        int turns = 0;

        boolean isBuffed = false;

        while (true) {
            boolean doAttack = false;
            boolean validInput = false;

            while (!validInput) {
                userInput = scan.nextLine();
                validInput = true;

                switch (userInput.toLowerCase()) {
                    case "a":
                        doAttack = true;
                        break;
                    case "b":
                        isBuffed = true;
                        System.out.println("Buffing! +5 to your next attack roll and damage");
                        break;
                    default:
                        System.out.println("Invalid input");
                        validInput = false;
                }
            }

            if (doAttack) {
                turns++;
                int attackRoll = random.nextInt(20) + 1;
                int damage = 0;

                System.out.print("You rolled: " + attackRoll);

                if (isBuffed) {
                    attackRoll += 5;
                    System.out.print(" + 5 (buff active)\n");
                } else {
                    System.out.println();
                }

                if (attackRoll >= 12) {
                    damage = random.nextInt(8) + 1;
                    damage += random.nextInt(8) + 1;

                    if (isBuffed) {
                        damage += 5;
                    }

                    if (attackRoll == 20 || (isBuffed && attackRoll == 20 + 5)) {
                        damage *= 2;
                        System.out.print("Critical hit! ");
                    }

                    System.out.print("You dealt " + damage + " damage");

                    if (isBuffed) {
                        System.out.print(" (buffed attack)");
                    }

                    enemyHP -= damage;
                    System.out.println("\nEnemy HP: " + Math.max(0, enemyHP));

                } else {
                    System.out.println("Miss");
                }

                isBuffed = false;

                if (enemyHP <= 0) {
                    System.out.println("Enemy died in " + turns + " turns");
                    return;
                }
            }
        }
    }
}
