package Main;
import Enum.Lessons;
import Manager.Manager;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int eror = 0;
        boolean f =true;
        Scanner in = new Scanner(System.in);
        Lessons[] data = Lessons.values();

        while(f) {
            System.out.print("#$: ");
            String Input = in.next();

            for(int i = 0; i<data.length;i++) {
                if (Input.equals(data[i].getFull_name())||Input.equals(data[i].getName())){
                    Manager.execute(data[i].getFull_name());
                    eror++;

                }
            }
            if(eror==0)
                System.out.println("Unknown command. Use 'help' or '?' to view the available commands.");
            eror=0;
        }
    }

}
