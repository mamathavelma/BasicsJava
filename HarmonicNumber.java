import java.util.Scanner;
public class HarmonicNumber {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
        float harmonic = 0;
        int n = sc.nextInt();

        for(float i = 1;i <= n;i++)
            harmonic = harmonic + (1 / i);

        System.out.println(harmonic);
    }
}
