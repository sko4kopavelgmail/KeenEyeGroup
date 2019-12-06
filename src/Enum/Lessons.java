package Enum;
/**
 * @autor Nikolay Shvedov
 */
public enum Lessons
{
    exit("exit", "ex", "Выход из приложения"),
    help("help", "hp", "Название и описание всех функций");
    private String fullname, reduction, explanation; // поля
    Lessons(String fullname, String reduction, String explanation) //Конструктор для инициализации полей
    {
        this.fullname = fullname;
        this.reduction = reduction;
        this.explanation = explanation;
    }
    public String getFullname() // Функция для получения значения переменной fullname (полное имя)
    {
        return fullname;
    }
    public String getReduction() // Функция для получения значения переменной reduction (сокращение)
    {
        return reduction;
    }
    public String getExplanation() // Функция для получения значения переменной explanation (объяснение)
    {
        return explanation;
    }
}