import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double first=Double.valueOf(scanner.nextLine());
        Double second=Double.valueOf(scanner.nextLine());
        double result= second-first;
        System.out.println(result);
    }
}