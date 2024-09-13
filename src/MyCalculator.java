import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("Приветствую в моем скромном калькуляторе! :)\nВведите пожалуйста два числа: ");
        Scanner input=new Scanner(System.in);
        char operator;
        if (input.hasNextInt()){
            int fstnum=input.nextInt();
            int scdnum=input.nextInt();
        }else{
            System.out.println("Я умею работать только с числами :( ");
        }
        System.out.println("Выберите простую операцию (+,-,*,/) и подтвердите её или нажмите Q для выхода из программы");
        operator = input.next().charAt(0);
        double result;
        switch (operator){
            case '+':
                result = fstnum + scdnum;
                break;
            case '-':
                result = fstnum - scdnum;
                break;
            case '*':
                result = fstnum * scdnum;
                break;
            case '/':
                if (scdnum == 0){
                    System.out.println("На ноль нельзя делить!");
                    return;
                }else{
                    result = fstnum * scdnum;
                    break;
                }
            case 'q':
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Я пока не знаю других операций с цислами :(");
        }
        System.out.println("Рузльтат операции: "+ result);

    }
}
