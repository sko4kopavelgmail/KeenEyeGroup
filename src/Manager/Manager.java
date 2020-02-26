package Manager;

import Enum.Lessons;
import Utils.DateUtils;

public class Manager {

    public static void execute(String command) {
        try {
            Lessons cname = Lessons.valueOf(command);

            switch (cname) {
                case help:
                    help();
                    break;
                case exit:
                    exit();
                    break;
                case dateUtil:
                    dateUtil();
                    break;
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Unknown command. Use 'help' or '?' to view the available commands.");
        }
    }

    private static void help() {
        for (Lessons lessons : Lessons.values())
            System.out.println(lessons.getInfo());
    }

    private static void exit() {
        System.exit(0);
    }

    private static void dateUtil() {
        DateUtils.dateUtils();
    }

}
