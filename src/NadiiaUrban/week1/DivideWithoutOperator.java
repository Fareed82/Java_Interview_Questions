package NadiiaUrban.week1;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        divideNumbers(24,5);
    }

    public static void divideNumbers(int num1, int num2){
        int count = 0;
if(num2==0){
    throw new ArithmeticException("Divisor  can not be zero");
}
else {

        while(num1>num2){
    num1-=num2;
    count++;
}}
        System.out.println(count+"."+num1%num2);
    }

}
//Write the method that can divide two numbers without using divide operator