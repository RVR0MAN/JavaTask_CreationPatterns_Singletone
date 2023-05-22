package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log(LogMessage.RESPONSE_FILTER_LIST);
        List<Integer> result = new ArrayList<>();
        int valueCounter = 0;
        int posValueCounter = 0;

        for (int i = 0; i < source.size(); i++) {
            valueCounter++;
            if (source.get(i) <= treshold) {
                logger = Logger.getInstance();
                logger.log(LogMessage.RESPONSE_FILTER_ANSWER_NEGATIVE);
                System.out.println(source.get(i));
            } else {
                logger = Logger.getInstance();
                logger.log(LogMessage.RESPONSE_FILTER_ANSWER_POSITIVE);
                System.out.println(source.get(i));
                result.add(source.get(i));
                posValueCounter++;
            }
        }
        logger.log(LogMessage.RESPONSE_FILTER_VALUES_POSITIVE);
        System.out.println(posValueCounter + " из " + valueCounter);
        return result;
    }
}
