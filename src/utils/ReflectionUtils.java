package utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionUtils {

    public static void inspectObject(Object obj) {
        Class<?> clazz = obj.getClass();

        // Class name
        System.out.println("Class name: " + clazz.getName());

        // Fields
        System.out.println("Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("- " + field.getName() + " : " + field.getType().getSimpleName());
        }

        // Methods
        System.out.println("Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("- " + method.getName());
        }
    }
}
