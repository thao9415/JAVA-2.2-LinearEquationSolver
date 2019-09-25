import java.util.Scanner;

public class LinearEquationSolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Solver");
        System.out.println("Given a equation as 'ax+b=c'. Please enter constants");
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.print("a : ");
        a = sc.nextDouble();
        System.out.print("b : ");
        b=sc.nextDouble();
        System.out.print("c : ");
        c=sc.nextDouble();
        if (a!=0) {
            double result = -b / a;
            System.out.printf("The result is: %f!", result);
        } else {
            if (b==0) {
                System.out.println("The result is all x");
            } else {
                System.out.println("No result");
            }
        }



    }
}
