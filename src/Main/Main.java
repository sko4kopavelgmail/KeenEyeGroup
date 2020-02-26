package Main;

import Enum.Lessons;
import Manager.Manager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean f = true;
        boolean find_comands = false;
        try (Scanner in = new Scanner(System.in)) {


            while (f) {
                System.out.print("#$: ");
                String Input = in.next();

                for (Lessons lessons : Lessons.values()) {
                    if (Input.equals(lessons.getFull_name()) || Input.equals(lessons.getName())) {
                        Manager.execute(lessons.getFull_name());
                        find_comands = true;
                    }
                }
                if (!find_comands) {
                    Manager.execute(Input);
                }
                find_comands = false;
            }
        }
    }
}
