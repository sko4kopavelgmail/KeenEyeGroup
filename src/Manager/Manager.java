package Manager;

import Enum.Lessons;

public class Manager
{
    public void command_ativation(String command)
    {
        Team_development teams = new Team_development();  // Объект класса, реализующего функции команд
        Lessons less = null;
        if ((command.equals(Lessons.exit.getFullname())) || (command.equals(Lessons.exit.getReduction())))
        {
            System.out.println(Lessons.exit.getExplanation());
            teams.exit();
        }
        else if ((command.equals(Lessons.help.getFullname())) || (command.equals(Lessons.help.getReduction())))
        {
            System.out.println(Lessons.help.getExplanation());
            teams.help();
        }
        else
        {
            System.out.print("Error! '" + command + "' command not found!");
        }
    }
}