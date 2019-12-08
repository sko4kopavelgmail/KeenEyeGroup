package Enum;

public enum Lessons
{
    // TODO: 08.12.2019 Обычно объекты в enum пишутся UPPER_CASE
    exit("exit", "ex", "Выход из приложения"),
    help("help", "hp", "Название и описание всех функций");
    private String fullname, reduction, explanation; // поля
    Lessons(String fullname, String reduction, String explanation) //Конструктор для инициализации полей
    {
        this.fullname = fullname;
        this.reduction = reduction;
        this.explanation = explanation;
    }

    // TODO: 08.12.2019 camelCase
    public String getFullname() // Функция для получения значения переменной fullname (полное имя)
    {
        return fullname;
    }

    // TODO: 08.12.2019 что-то типа shortName будев в тему
    public String getReduction() // Функция для получения значения переменной reduction (сокращение)
    {
        return reduction;
    }
    public String getExplanation() // Функция для получения значения переменной explanation (объяснение)
    {
        return explanation;
    }
}