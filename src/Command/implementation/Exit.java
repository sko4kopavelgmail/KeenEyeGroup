package Command.implementation;

import Command.Command;
import Enum.Lessons;

public class Exit  implements Command{

    @Override
    public void run() {
        System.exit(0);
    }

    @Override
    public void getInformation() {
        System.out.println(Lessons.EXIT.toString());
    }
}