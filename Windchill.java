import java.util.Scanner;
public class Windchill{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
double temp=sc.nextDouble();
double velo=sc.nextDouble();
double Windchill;
if(temp<=50&&(velo<120||3>velo)){
double w=((35.74-0.6215)+((0.4275*temp-35.75)*Math.pow(velo,0.16)));
  System.out.println("answer is"+w);
}
else
System.out.println("temperature is greater than 50");
}
}


