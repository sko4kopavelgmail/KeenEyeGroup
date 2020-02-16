package Manager;

import Enum.Lessons;
public class Manager {

    public static void execute(String command) {
        try {
            Lessons cname = Lessons.valueOf(command);

            switch (cname) {
                case help:
                    help ();
                    break;
                case exit:
                    exit();
                    break;
            }
        } catch (IllegalArgumentException iae) {
            // Unknown command
        }
    }

    private static void help(){
        Lessons[] data = Lessons.values();
        for(int i = 0; i<data.length;i++)
            System.out.println(data[i].getInfo());
    }

    private static void exit(){
        System.exit(0);
    }

}
