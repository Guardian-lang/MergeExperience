package by.itacademy.git.mergeexperience.topics;

public enum Module2Topics {

    SQL(1, "Structured Query Language", "Изучение языка программирования для баз данных","2ч50мин"),
    COOKIE(2, "Cookie и сессии","Обмен информацией","2ч50мин"),
    JSP(3,"Java Server Pages","Создание динамических Web-страниц","2ч50мин"),
    AUTHENTICATION(4,"Аунтенификация","Основы EL, JSTL, Фильтры","2ч50мин");
    private int order;
    private String topic;
    private String desc;
    private String hours;
    Module2Topics(int order, String topic, String desc, String hours) {
        this.order = order;
        this.topic = topic;
        this.desc = desc;
        this.hours = hours;
    }

    public String getHours() {
        return hours;
    }

    public int getOrder() {
        return order;
    }

    public String getTopic() {
        return topic;
    }

    public String getDesc() {
        return desc;
    }
}
