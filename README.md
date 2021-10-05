# OOP_LABA2_TASK_1-2
ЛАБОРАТОРНАЯ РАБОТА №2
10 баллов

Тема: Inversion of Control и Dependency Injection с помощью аннотаций и кода.

Цель: научиться применять аннотации для Inversion of Control и Dependency Injection. Создать класс, позволящий реализовать Inversion of Control и Dependency Injection с помощью кода.

Задания

Используя результат первой лабораторной работы:

1) Добавить диагностические сообщения в конструкторы и сеттеры классов Employee, Car и Pet. Реализовать в них методы init() и destroy() с диагностическими сообщениями.
Пример:
public void init() {
System.out.println("Class Person: init method");
}
2) Реализовать IoC и DI из первой лабораторной с помощью аннотаций. Обязательно наличие аннотаций: @Component, @Autowired, @Qualifier, @Value, @Scope, @PostConstruct и @PreDestroy.
