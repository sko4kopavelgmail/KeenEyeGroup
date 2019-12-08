package Main;

import java.util.Scanner;
import Manager.Manager;
/**
 * @autor Nikolay Shvedov
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите команду:");
        Manager manager = new Manager();
        while(true)
        {
            // TODO: 08.12.2019 Обязательно создавать объект каждый раз когда вводится команда?
            Scanner num = new Scanner(System.in);
            String input = num.nextLine();
            manager.command_ativation(input);
        }
    }
}