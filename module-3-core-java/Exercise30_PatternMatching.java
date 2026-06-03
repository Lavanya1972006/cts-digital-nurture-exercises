ppublic class Exercise30_PatternMatching {

    public static void checkType(Object obj) {
        switch (obj) {
            case Integer i ->
                System.out.println("Integer value: " + i);

            case String s ->
                System.out.println("String value: " + s);

            case Double d ->
                System.out.println("Double value: " + d);

            case Long l ->
                System.out.println("Long value: " + l);

            case Float f ->
                System.out.println("Float value: " + f);

            case null ->
                System.out.println("Object is null");

            default ->
                System.out.println("Unknown type: " + obj.getClass().getSimpleName());
        }
    }

    public static void main(String[] args) {
        checkType(100);
        checkType("Hello Java");
        checkType(99.99);
        checkType(123456789L);
        checkType(12.5f);
        checkType(null);
        checkType(true);
    }
}