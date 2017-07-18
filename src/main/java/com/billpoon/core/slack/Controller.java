package com.billpoon.core.slack;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for different Event types in Slack RTM API.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
    EventType[] events() default EventType.MESSAGE;
    
    String pattern() default "";
    
    String next() default "";
}
