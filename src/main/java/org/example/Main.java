package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Filter filter;

        Logger logger = Logger.getInstance();

        logger.log(LogMessage.GREETING);
        logger.log(LogMessage.REQUEST_LIST_PARAMETERS);
        System.out.print("Введите размер списка: ");
        List<Integer> source = new ArrayList<>();
        int arrSize = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();

        logger.log(LogMessage.RESPONSE_LIST);
        for (int i = 0; i < arrSize; i++) {
            source.add(i, random.nextInt(maxValue));
        }
        System.out.println("Был создан список: " + source);


        logger.log(LogMessage.REQUEST_FILTER_VALUE);
        System.out.print("Введите порог для фильтра: ");
        filter = new Filter(scanner.nextInt());
        List<Integer> filterList = filter.filterOut(source);
        logger.log(LogMessage.RESPONSE_FILTER_LIST_OUTPUT);
        System.out.println("Отфильтрованный список: " + filterList);
        logger.log(LogMessage.COMPLETION);
    }

}