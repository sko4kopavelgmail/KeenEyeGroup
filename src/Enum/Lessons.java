package Enum;

public enum Lessons {
    dateUtil("dateUtil", "date", "Команда 'dateUtil' или 'date' запускает приложение для работы с датой!"),
    help("help", "?", "Команда 'help' или '?' отображает список команд, а так же их назначение!"),
    exit("exit", "ex", "Команда 'exit' или 'ex' закрывает консоль!");


    String full_name, name, info;

    Lessons(String full_name, String name, String info) {
        this.full_name = full_name;
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getInfo() {
        return info;
    }
}
