import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("Please enter whole numbers below:");
        System.out.print("A: ");
        int a = sc.nextInt();
        System.out.print("B: ");
        int b = sc.nextInt();
        System.out.print("C: ");
        int c = sc.nextInt();
        System.out.print("D: ");
        int d = sc.nextInt();

        int sumAB, sumAC, sumAD, sumBC, sumBD, sumCD;
        int mulAB, mulAC, mulAD, mulBC,mulBD, mulCD;

        sumAB = a + b;
        sumAC = a + c;
        sumAD = a + d;
        sumBC = b + c;
        sumBD = b + d;
        sumCD = c + d;

        mulAB = a * b;
        mulAC = a * c;
        mulAD = a * d;
        mulBC = b * c;
        mulBD = b * d;
        mulCD = c * d;

        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Additions:");
        System.out.println("A + B: " + sumAB);
        System.out.println("A + C: " + sumAC);
        System.out.println("A + D: " + sumAD);
        System.out.println("B + C: " + sumBC);
        System.out.println("B + D: " + sumBD);
        System.out.println("C + D: " + sumCD);
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("Multiplications:");
        System.out.println("A * B: " + mulAB);
        System.out.println("A * C: " + mulAC);
        System.out.println("A * D: " + mulAD);
        System.out.println("B * C: " + mulBC);
        System.out.println("B * D: " + mulBD);
        System.out.println("C * D: " + mulCD);

        sc.close();
    }
}