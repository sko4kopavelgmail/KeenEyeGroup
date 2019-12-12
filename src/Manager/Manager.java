package Manager;

import Enum.Lessons;

public class Manager {
    public Lessons less;
    Direction dir = new Direction();

    public void check(String command) { //функция поиска совпадения c полями Enum
        for (Lessons less : Lessons.values()) {
            if ((command.equals(less.getFullName())) || (command.equals(less.getShortName()))) {
                this.less = less;
            }
        }
    }

    public void activation(String command) { //функция выполнения команд
        try {
            switch (less) {
                case EXIT:
                    dir.getTeam(new Exit());
                    break;
                case HELP:
                    dir.getTeam(new Help());
                    break;
            }
        } catch (Exception e) {
            System.out.println("Error! '" + command + "' command not found!");
        }
    }
}