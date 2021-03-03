package com.company.Trees.revsionTree;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public @interface isNull {
   int value() default 2;
}

class Hello{
    @isNull(value=10)
    public void sayHello(){System.out.println("hello annotation");}
}