package Enum;

public enum Lessons {
    EXIT("exit", "ex", "Выход из приложения"),
    HELP("help", "hp", "Название и описание всех функций");
    private String fullname, shortname, explanation; // поля
    Lessons(String fullname, String shortname, String explanation){ //Конструктор для инициализации полей
        this.fullname = fullname;
        this.shortname = shortname;
        this.explanation = explanation;
    }
    public String getFullName(){ // Функция для получения значения переменной fullname (полное имя)
        return fullname;
    }
    public String getShortName(){ // Функция для получения значения переменной shortname (сокращенное имя)
        return shortname;
    }
    public String getExplanation(){ // Функция для получения значения переменной explanation (объяснение)
        return explanation;
    }
}