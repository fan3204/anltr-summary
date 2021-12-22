package com.fab.summary.format;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * TODO
 *
 * @author fab
 * @date 2021/12/20
 */
public class FormatterChain {

    private List<Formatter> formatters;

    public void execute(Object object, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        for (Formatter formatter : formatters) {
            formatter.clear();
        }


        Object result = method.invoke(object, args);

        for (Formatter formatter : formatters) {
            formatter.format();
        }
    }

    public void addFormatter(Formatter formatter) {
        formatters.add(formatter);
    }

}
