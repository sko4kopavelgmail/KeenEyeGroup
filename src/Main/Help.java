package Main;
/**
 * @autor Nikolay Shvedov
 */
public enum Help
{
    help("help", "hp", "Название и описание всех функций");
    private String help_temp, hp_temp, explanation; // поля
    Help(String help_temp, String hp_temp, String explanation) //Конструктор для инициализации полей
    {
        this.help_temp = help_temp;
        this.hp_temp = hp_temp;
        this.explanation = explanation;
    }
    public String getHelp() // Функция для получения значения переменной help_temp
    {
        return help_temp;
    }
    public String getHp() // Функция для получения значения переменной hp_temp
    {
        return hp_temp;
    }
    public String getExplanation() // Функция для получения значения переменной explanation
    {
        return explanation;
    }
}