package com.fab.summary;

import com.fab.summary.format.FormatterChain;
import com.fab.summary.format.TxtFormatter;
import com.fab.summary.format.TxtFormatterBuilder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author fab
 * @date 2021/12/20
 */
public class ParserProxy implements InvocationHandler {

    private FormatterChain chain;

    private Object object;

    public ParserProxy(Object object) {
        this.object = object;
        this.chain = new FormatterChain();

        chain.addFormatter(new TxtFormatter(TxtFormatterBuilder.newBuilder()));
    }

    public Object getProxy() {
        Object object = Proxy.newProxyInstance(this.object.getClass().getClassLoader(), this.object.getClass().getInterfaces(), this);
        return object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        chain.execute(this.object, method, args);

        return null;
    }


}
