import java.util.*;
public class GCDMethod {
    static int gcd(int m,int n){
        while(m!=n){
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(gcd(n1,n2));
    }
}
