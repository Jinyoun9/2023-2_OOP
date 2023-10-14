import java.util.Scanner;
public class Homework4 {
    int gcd(int m, int n){
        if (m == 0) return m;
        else if (m % n == 0) return n;
        else{
            m = m % n;
            return gcd(n, m);
        }
    }
    /*int gcd(int m, int n){
        while(true) {
            if (m == 0) return m;
            else if (m % n == 0) {
                return n;
            }
            else{
                m = m % n;
                int temp = m;
                m = n;
                n = temp;
            }
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Homework4 hw = new Homework4();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int res = hw.gcd(m, n);
        System.out.printf("%d\n", res);
    }
}