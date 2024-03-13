import java.util.ArrayList;
import java.util.Scanner;

public class test {
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 1;
        while (x == 1) {
            System.out.println("1. nhap");
            System.out.println("2. tinh");
            x = sc.nextInt();
            if (x == 2) {
                System.out.println("so so 0 tan cung la : " + count(arr));
                break;
            }
            System.out.println("nhap so x : ");
            int a = sc.nextInt();
            arr.add(a);
        }
    }

    static void nhap(int x) {
        arr.add(x);
    }

    static int count(ArrayList<Integer> array) {
        int count = 0;
        int tich = 1;
        for (int i = 0; i < array.size(); i++) {
            tich = tich * array.get(i);
        }
        System.out.println(tich);
        while (tich % 10 == 0) {
            count++;
            tich /= 10;
        }
        System.out.println(count);
        return count;
    }
}
