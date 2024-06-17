import java.util.*;
public class Apseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of d: ");
        int d = sc.nextInt();
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int ap=a;
        for(int i=0;i<n;i++)
        {
            System.out.print(ap + ",");
            ap=ap+d;
            
        }
    }   
    }
