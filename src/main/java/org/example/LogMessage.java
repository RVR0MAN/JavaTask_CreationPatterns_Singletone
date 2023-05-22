package org.example;

public enum LogMessage {
    GREETING("Запуск программы\n"),
    REQUEST_LIST_PARAMETERS("Запрос от пользователя входных данных для создания списка\n"),
    RESPONSE_LIST("Создание списка\n"),
    REQUEST_FILTER_VALUE("Запрос от пользователя входных данных для фильтрации\n"),
    RESPONSE_FILTER_LIST("Применение фильтра к списку\n"),
    RESPONSE_FILTER_ANSWER_POSITIVE("Элемент прошел: "),
    RESPONSE_FILTER_ANSWER_NEGATIVE("Элемент не прошел: "),
    RESPONSE_FILTER_VALUES_POSITIVE("Элементов прошло: "),
    RESPONSE_FILTER_LIST_OUTPUT("Вывод результата\n"),
    COMPLETION("Завершение программы");


    private final String message;

    LogMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return message;
    }

}
