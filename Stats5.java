public class Stats5 
{
    public static void main(String args[]){
        double no1 = Math.random();
        double no2 = Math.random();
        double no3 = Math.random();
        double no4 = Math.random();
        double no5 = Math.random();

        System.out.println("number1 = " + no1);
        System.out.println("number2 = " + no2);
        System.out.println("number3 = " + no3);
        System.out.println("number4 = " + no4);
        System.out.println("number5 = " + no5);

        double average = (no1 + no2 + no3 + no4 + no5) / 5;
        System.out.println("Average is " + average);

        double min = Math.min(no1,Math.min(no2,Math.min(no3,Math.min(no4,no5))));
        double max = Math.max(no1,Math.max(no2,Math.max(no3,Math.max(no4,no5))));

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
  }
}