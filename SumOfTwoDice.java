import java.util.Random;
public class SumOfTwoDice{
public static void main(String args[]){
int sum;
int dice1;
int dice2;
dice1=(int)(Math.random()*6)+1;
System.out.println("the first die comes:" +dice1);
dice2=(int)(Math.random()*6)+1;
System.out.println("the second die comes:" +dice2);
sum=dice1+dice2;
System.out.println("the sume of value from two dice is:" +sum);
}
}
