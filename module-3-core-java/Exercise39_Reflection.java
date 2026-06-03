import java.lang.reflect.*;

class Demo {

    public void message() {
        System.out.println("Reflection Invoked");
    }
}

public class Exercise39_Reflection {

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("Demo");

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method[] methods =
                cls.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(
                    "Method: " + m.getName());
        }

        Method method =
                cls.getMethod("message");

        method.invoke(obj);
    }
}