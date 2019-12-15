package Enum;

import Utils.StringUtills;

public enum Lessons {
    EXIT("exit", "ex", "Выход из приложения"),
    HELP("help", "hp", "Название и описание всех функций");
    private String fullName, shortName, explanation; // поля

    Lessons(String fullName, String shortName, String explanation) { //Конструктор для инициализации полей
        this.fullName = fullName;
        this.shortName = shortName;
        this.explanation = explanation;
    }

    public String getFullName() { // Функция для получения значения переменной fullName (полное имя)
        return fullName;
    }

    public String getShortName() { // Функция для получения значения переменной shortName (сокращенное имя)
        return shortName;
    }

    public String getExplanation() { // Функция для получения значения переменной explanation (объяснение)
        return explanation;
    }

    @Override
    public String toString() {
        return getFullName() + StringUtills.SEMICOLON + StringUtills.SPACE
                + getShortName() + StringUtills.SEMICOLON + StringUtills.SPACE
                + getExplanation();
    }

    public static Lessons getValueByName(String name) {
        for (Lessons lesson: Lessons.values()) {
            if (lesson.getShortName().equals(name) || lesson.getFullName().equals(name)) {
                return lesson;
            }
        }
        return null;
    }

}