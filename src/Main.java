import java.util.Scanner;

public class Main {

    // Palindrom sayı olup olmadığını kontrol eden method
    static String isPalindrom(int number) {
        int temp, lastDigit, reverseNumber = 0;
        // kullanıcıdan alınan sayıyı kaybetmemek için işlem sırasında kullanılacak geçiçi ssayıya kullanıcdan alınan sayı atanır
        temp = number;

        // temp sayısı sıfır olana kadar devam edecek döngü kurulur
        while (temp != 0) {

            lastDigit = temp % 10; // son basamağı alınır
            reverseNumber = (reverseNumber * 10) + lastDigit; // son basamağı yeni sayının ilk basamağı yapılır
            temp /= 10; // önceki basamağa geçilir
        }

        // sayı ve sayının tersinin eşit olup olmaması kontrol edilir
        if (reverseNumber == number) {
            return number + ": Bir palindrom sayıdır.";
        } else {
            return number + ": Bir palindrom sayıd değildir.";
        }

    }

    public static void main(String[] args) {
        int number;

        // kullanıcıdan kontrol etmek istediği sayı alınır.
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        System.out.println(isPalindrom(number));

    }
}