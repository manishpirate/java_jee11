package demo.annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BusinessPolicies.class)
public @interface BusinessPolicy {
    String name() default "default Policy";
    String[] countries();
    String value();

}
