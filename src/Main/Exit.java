package Main;
/**
 * @autor Nikolay Shvedov
 */
public enum Exit
{
    exit("exit", "ex", "Выход из приложения");
    private String exit_temp, ex_temp, explanation; // поля
    Exit(String exit_temp, String ex_temp, String explanation) //Конструктор для инициализации полей
    {
        this.exit_temp = exit_temp;
        this.ex_temp = ex_temp;
        this.explanation = explanation;
    }
    public String getExit() // Функция для получения значения переменной exit_temp
    {
        return exit_temp;
    }
    public String getEx() // Функция для получения значения переменной ex_temp
    {
        return ex_temp;
    }
    public String getExplanation() // Функция для получения значения переменной explanation
    {
        return explanation;
    }
}