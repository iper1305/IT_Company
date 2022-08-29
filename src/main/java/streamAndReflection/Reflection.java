package streamAndReflection;

import it_1.logs.Log;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) {
        Person person = new Person();
        printData(person);
        printName(person);
    }

    public static void printData(Object person){
        try {
            Method method = person.getClass().getDeclaredMethod("getPersonInformation");
            method.setAccessible(true);
            method.invoke(person);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void printName(Object person){
        String firstName = null;
        try {
            Field field = person.getClass().getDeclaredField("firstName");
            field.setAccessible(true);
            firstName = (String) field.get(person);
        } catch (NoSuchFieldException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
        Log.info(firstName);
    }
}
