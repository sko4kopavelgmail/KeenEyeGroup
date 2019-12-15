package Manager;

import Command.implementation.Exit;
import Command.implementation.Help;
import Enum.Lessons;

import java.util.Objects;

public class Manager {

    private static final String LESSON_NOT_FOUND = "команда не найдена";

    private Exit exit;

    private Help help;

    public Manager() {
        exit = new Exit();
        help = new Help();
    }

    public void manage(String input) {
        Lessons lessons = Lessons.getValueByName(input);
        if (Objects.isNull(lessons)) {
            System.out.println(LESSON_NOT_FOUND);
            return;
        }

        switch (lessons) {
            case EXIT:
                exit.run();
                break;
            case HELP:
                help.run();
                break;

        }
    }
}