import java.util.Scanner;

/*
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar
5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.

Senaryolar
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16
 */
public class Practice {
    static void subtract(int num, int temp){
        System.out.print(temp+" ");
        if(temp <= 0)
            add(num, temp+5);
        else
            subtract(num,temp-5);
    }
    static void add(int num, int temp){
        System.out.print(temp+" ");
        if(num == temp)
            return ;
        else{
            add(num, temp+5);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Please enter a number: ");
        num = input.nextInt();

        subtract(num, num);
    }
}
