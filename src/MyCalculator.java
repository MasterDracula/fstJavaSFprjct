import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        System.out.println("Приветствую в моем скромном калькуляторе! :)\nВведите пожалуйста два числа: ");
        Scanner input=new Scanner(System.in);
        char operator;
        double fstnum = 0;
        double scdnum = 0;
        if (input.hasNextInt()){
            fstnum = input.nextInt();
            scdnum = input.nextInt();
        }else{
            System.out.println("Я умею работать только с числами :( ");
        }
        System.out.println("+ для сложения");
        System.out.println("- для вычитания");
        System.out.println("* для умножения");
        System.out.println("/ для деления");
        System.out.println("Q для выхода");
        System.out.println("Выберите из перичисленного: ");
        operator = input.next().charAt(0);
        double result = 0;
        switch (operator){
            case '+':
                result = fstnum + scdnum;
                System.out.println("Результат операции: "+ result);
                break;
            case '-':
                result = fstnum - scdnum;
                System.out.println("Результат операции: "+ result);
                break;
            case '*':
                result = fstnum * scdnum;
                System.out.println("Результат операции: "+ result);
                break;
            case '/':
                if (scdnum == 0){
                    System.out.println("На ноль нельзя делить!");
                }else{
                    result = fstnum / scdnum;
                    System.out.println("Результат операции: "+ result);
                }
                break;
            case 'q':
                System.out.println("До свидания!");
                break;
            default:
                System.out.println("Я пока не знаю других операций с цислами :(");
        }
        System.out.println("Программа завершена");
    }
}
