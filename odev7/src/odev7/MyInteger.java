package odev7;

public class MyInteger {
    private final int value;

    // Belirtilen int değerle nesne oluşturan kurucu metot (Constructor)
    public MyInteger(int value) {
        this.value = value;
    }

    // Getter metot
    public int getValue() {
        return value;
    }

    // Nesnenin değeri çift mi?
    public boolean isEven() {
        return isEven(this.value);
    }

    // Nesnenin değeri tek mi?
    public boolean isOdd() {
        return isOdd(this.value);
    }

    // Nesnenin değeri asal mı?
    public boolean isPrime() {
        return isPrime(this.value);
    }

    // Statik: Belirtilen int değer çift mi?
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Statik: Belirtilen int değer tek mi?
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // Statik: Belirtilen int değer asal mı?
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Statik: Belirtilen MyInteger nesnesinin değeri çift mi?
    public static boolean isEven(MyInteger o) {
        return o.isEven();
    }

    // Statik: Belirtilen MyInteger nesnesinin değeri tek mi?
    public static boolean isOdd(MyInteger o) {
        return o.isOdd();
    }

    // Statik: Belirtilen MyInteger nesnesinin değeri asal mı?
    public static boolean isPrime(MyInteger o) {
        return o.isPrime();
    }

    // Nesnenin değeri verilen int ile eşit mi?
    public boolean equals(int n) {
        return this.value == n;
    }

    // Nesnenin değeri verilen MyInteger nesnesiyle eşit mi?
    public boolean equals(MyInteger o) {
        return o != null && this.value == o.value;
    }

    // Karakter dizisini (char[]) int değere çeviren statik metot
    public static int parseInt(char[] chars) {
        int result = 0;
        for (char c : chars) {
            result = result * 10 + (c - '0');
        }
        return result;
    }

    // String ifadeyi int değere çeviren statik metot
    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
}