
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("""
                Добро пожаловать в простой калькулятор!
                Здесь Вы можете производить арифметические '+,-,*,/' операции над
                Арабскими '1,2,3,4,...9,10' или Римскими 'I,II,III,IV,...IX,X' числами
                
                !Допускается одновременное использование ИЛИ Арабских ИЛИ Римских цифр!
                
                !При вводе выражения с Римскими цифрами ответ не может быть меньше или равен 0!
                
                При вводе пишите выражение в одну строку с пробелами, например: '1 + 9' или 'I + IX'
                Пожалуйста, не нарушайте шаблон ввода: '{число}{пробел}{знак}{пробел}{число}' и не используйте числа меньше или равные 0 или больше 10
                Для завершения работы введите 'q' и нажмите 'enter' в поле для ввода
        """);

        Scanner scan = new Scanner(System.in);
        System.out.println("Поле для ввода: ");
        String quiet1 = "q", quiet2 = "й", income = scan.nextLine();

       while (!income.equalsIgnoreCase(quiet1) && !income.equalsIgnoreCase(quiet2)) {
           System.out.println(calc(income));
           System.out.println("Поле для ввода: ");
           income = scan.nextLine();
       }
       System.out.println("Хорошего дня!");
    }
    public static String calc(String income) throws Exception {

        IfInputCorrect input = new IfInputCorrect();
        if (input.check(income)){
            Calculator calculate = new Calculator();
            int result = calculate.calculate(income);
            Translate translator = new Translate();
            if (translator.isRome(income)){
                if (result <= 0) throw new Exception("Римские цифры не могут быть отрицательными или равными '0'!\n");
                else {
                    String resultRome = translator.translateToRome(result);
                    return "Ответ: " + resultRome;
                }
            }else return "Ответ: " + result;
        }else throw new Exception ("Шаблон ввода нарушен!!!\n");
    }
}