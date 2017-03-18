import java.util.Scanner;

public class PriceCode {
    private static Scanner sc = new Scanner(System.in);
    private static char discountCode;
    private static double originalItemPrice;
    private static double finalPrice;
    static String s1 = "aaa";
    static String s2 = "bbb";

    public static void main(String[] args) {
        getOriginalPrice();
        getDiscountCode();
        getFinalPrice();
        print();
    }

    private static void print() {
        System.out.println("The original price was $" + originalItemPrice + ". The final price is $" + finalPrice);
    }

    private static double getFinalPrice() {

        switch (discountCode) {

            case 'A':
                return finalPrice = originalItemPrice * .9;
            case 'B':
                return finalPrice = originalItemPrice * .8;
            case 'C':
                return finalPrice = originalItemPrice * .5;
            case 'D':
                return finalPrice = originalItemPrice * .25;
            default:
                return finalPrice = 0;
        }
    }

    private static double getOriginalPrice() {
        System.out.print("Enter the item price: ");
        return originalItemPrice = sc.nextDouble();
    }

    private static char getDiscountCode() {
        System.out.print("Enter the discount code: ");
        return discountCode = sc.next().toUpperCase().charAt(0);
    }
}
