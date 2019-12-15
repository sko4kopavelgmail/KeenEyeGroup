package Command.implementation;

import Command.Command;
import Enum.Lessons;
import Utils.StringUtills;

public class Help implements Command {

    private static final String COMMANDS = "Приложение поддерживает следующие команды:";

    @Override
    public void run() {
        getInformation();
    }

    @Override
    public void getInformation() {
        System.out.println(COMMANDS + StringUtills.NEW_LINE);
        for (Lessons lesson : Lessons.values()) {
            System.out.println(lesson.toString() + StringUtills.NEW_LINE);
        }
    }
}