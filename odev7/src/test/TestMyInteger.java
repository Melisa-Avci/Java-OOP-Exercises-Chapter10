package test;
import odev7.MyInteger;


public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(7);
        MyInteger n2 = new MyInteger(14);
        MyInteger n3 = new MyInteger(7);

        System.out.println("--- Nesne Metotları Testi ---");
        System.out.println("n1 değeri: " + n1.getValue());
        System.out.println("n1 çift mi? " + n1.isEven());
        System.out.println("n1 tek mi? " + n1.isOdd());
        System.out.println("n1 asal mı? " + n1.isPrime());

        System.out.println("\n--- Statik int Metotları Testi ---");
        System.out.println("15 çift mi? " + MyInteger.isEven(15));
        System.out.println("15 tek mi? " + MyInteger.isOdd(15));
        System.out.println("17 asal mı? " + MyInteger.isPrime(17));

        System.out.println("\n--- Statik MyInteger Metotları Testi ---");
        System.out.println("n2 (14) çift mi? " + MyInteger.isEven(n2));
        System.out.println("n1 (7) asal mı? " + MyInteger.isPrime(n1));

        System.out.println("\n--- Equals (Eşitlik) Testi ---");
        System.out.println("n1, 7'ye eşit mi? " + n1.equals(7));
        System.out.println("n1, n3'e eşit mi? " + n1.equals(n3));
        System.out.println("n1, n2'ye eşit mi? " + n1.equals(n2));

        System.out.println("\n--- ParseInt Metotları Testi ---");
        char[] charArray = {'1', '9', '9', '5'};
        System.out.println("char dizisinden çevrilen int: " + MyInteger.parseInt(charArray));
        System.out.println("String'den çevrilen int: " + MyInteger.parseInt("2026"));
    }
}