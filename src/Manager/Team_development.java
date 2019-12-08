package Manager;
/**
 * @autor Nikolay Shvedov
 * Класс, реализующий функции команд
 */

// TODO: 08.12.2019 сделай интерфейс для комманд, в котором будет один метод - run(). Создай классы для каждой команды, имплементи интерфейс в них, и реализуй команды
public class Team_development
{
    public void help()
    {
        System.out.println("exit, ex\t - \t Выход из приложения.");
    }
    public void exit()
    {
        System.exit(0);
    }
}