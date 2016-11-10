package net.pearlchain.prl.services;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class PrlSpringContext implements ApplicationContextAware {
    private static ApplicationContext context;

    @SuppressWarnings("static-access")
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        this.context = context;
    }

    public static ApplicationContext getApplicationContext() {
        return context;

    }
}
