package Main;

import java.util.Scanner;
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
        Team_development team = new Team_development();  // Объект класса, реализующего функции команд
        Exit exit = Exit.exit;
        Help help = Help.help;
        if ((input.equals(exit.getExit())) || (input.equals(exit.getEx())))
        {
            System.out.print(exit.getExplanation());
            team.exit();
        }
        else if ((input.equals(help.getHelp())) || (input.equals(help.getHp())))
        {
            System.out.print(help.getExplanation());
            team.help();
        }
        else
        {
            System.out.print("Error! '" + input + "' command not found!");
        }
    }
}
