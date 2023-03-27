package by.itacademy.git.mergeexperience.topics;

public enum Module1Topics {
    JAKARTA(1, "Jakarta", "Обзор java enterprise технологий","2ч50мин"),
    MAVEN(2, "Apache Maven", "Изучение сборщика проектов Maven","2ч50мин"),
    TOMCAT(3, "Apache Tomcat", "Изучение основ HTTP, TCP/IP и web сервера Tomcat","2ч50мин"),
    SERVLET(4, "HttpServlet", "Освоение технологии java сервлетов","2ч50мин"),
    GIT(5, "GIT", "Работа с системой контроля версий GIT","2ч50мин");

    private int order;
    private String topic;
    private String desc;
    private String hours;
    Module1Topics(int order, String topic, String desc, String hours) {
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
