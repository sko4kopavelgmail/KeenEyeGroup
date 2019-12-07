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
            Scanner num = new Scanner(System.in);
            String input = num.nextLine();
            manager.command_ativation(input);
        }
    }
}