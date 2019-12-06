package Main;

import java.util.Scanner;
import Enum.Lessons;
import Manager.Manager;
/**
 * @autor Nikolay Shvedov
 */
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите команду:");
        Scanner num = new Scanner(System.in);
        String input = num.nextLine();
        Manager command = new Manager();  // Объект класса, реализующего функции команд
        Lessons less = null; // Объект enum
        if ((input.equals(Lessons.exit.getFullname())) || (input.equals(Lessons.exit.getReduction())))
        {
            System.out.print(Lessons.exit.getExplanation());
            command.exit();
        }
        else if ((input.equals(Lessons.help.getFullname())) || (input.equals(Lessons.help.getReduction())))
        {
            System.out.print(Lessons.help.getExplanation());
            command.help();
        }
        else
        {
            System.out.print("Error! '" + input + "' command not found!");
        }
    }
}