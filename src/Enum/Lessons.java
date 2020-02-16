package Enum;

public enum Lessons {
    help("help", "?", "Команда 'help' или '?' отображает список команд, а так же их назначение!"),
    exit("exit","ex", "Команда 'exit' или 'ex' закрывает консоль!");

    String Full_name,name,info;
    Lessons (String Full_name, String name, String info){
        this.Full_name=Full_name;
        this.name=name;
        this.info=info;
    }

    public String getName() {
        return name;
    }

    public String getFull_name() {
        return Full_name;
    }

    public String getInfo() {
        return info;
    }
}
