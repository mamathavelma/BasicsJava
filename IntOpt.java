import java.util.Scanner;
class IntOpt{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
 int i1 = sc.nextInt();
 int i2 = sc.nextInt();
 int i3 = sc.nextInt();
 int sum1,sum2,sum3;
sum1=i1+i2*i3;
sum2=i1*i2+i3;
sum3=i1%i2+i3;
System.out.println("result of" + i1 + "+" + i2 + "*" + i3 + "=" + sum1 ) ;
System.out.println("result of" + i1 + "*" + i2 + "+" + i3 + "=" + sum2 ) ;
System.out.println("result of" + i1 + "%" + i2 + "+" + i3 + "=" + sum3 ) ;
}
}

