package Manager;

/*
* Класс, необходимый для вызова функции run из определённого класса, принадлежащего интерфейсу Teams
 */
public class Direction {
    public void getTeam(Teams team) {
        team.run();
    }
}