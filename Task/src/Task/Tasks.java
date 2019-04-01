package Task;



public class Tasks {

    public static void main(String[] args) {


        System.out.println("My age to: " + getMyAge()+ " years.");
        System.out.println("My name: "+ getMyName());
        printMathEquationResults(5, 7);
        System.out.println(isEven(8));
        System.out.println(couldDivideBy3and5(15));
        System.out.println(math(4));
        System.out.println(sqrt(4));
        System.out.println(canConstructTriangle(3, 4, 5));
    }
    private static int getMyAge() {
        return 32;
    }
    private static String getMyName() {
        return "Daniel";
    }

    private static void printMathEquationResults(double arg1, double arg2){

        System.out.println(arg1 + arg1);
        System.out.println(arg1 - arg1);
        System.out.println(arg1 * arg1);
    }

    private static boolean isEven(double number){
        return number % 2 == 0;
    }

    private static boolean couldDivideBy3and5(double number) {
        return number % 3 == 0 && number % 5 == 00;
    }

    private static double math(double number) {
        return Math.pow(number,3);
    }
    private static double sqrt(double number) {

        return Math.sqrt(number);
    }
    private static boolean canConstructTriangle(double number, double number1, double number2) {

        double longest = number;
        double side1 = number1;
        double side2 = number2;
        if (number1 > number && number1 > number2) {
            longest = number2;
            side1 = number;
            side2 = number1;
        } else if (number2 > number && number2 > number) {
            longest = number2;
            side1 = number;
            side2 = number1;
        }
        return side1 * side1 + side2 * side2 == longest * longest;
    }
}
