// Wrapper class
public class WrapperDemoA {
    public static void main(String[] args) {

        // Wrapper class examples
        Integer i = 10;
        Integer j = Integer.valueOf("10"); // Convert String to Integer
        Double d = 67.856;
        Byte b = 45;
        Long l = 578L;
        Float f = 56.8f;
        Character ch = 'a';

        // Compare values of two Integer objects
        System.out.println("i equals j: " + i.equals(j));

        // Display wrapper class objects
        System.out.println("Integer: " + i);
        System.out.println("Double: " + d);
        System.out.println("Byte: " + b);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Character: " + ch);

        // Autoboxing: primitive to wrapper object
        int p_i = 100;
        Integer obj_i = p_i;

        System.out.println("primitive: " + p_i);
        System.out.println("Object: " + obj_i);

        // Unboxing: wrapper object to primitive
        Integer obj2 = 200;
        int i2 = obj2;

        System.out.println("Wrapper object: " + obj2);
        System.out.println("Primitive: " + i2);
    }
}
