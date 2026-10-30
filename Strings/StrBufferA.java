// String is immutable, StringBuffer and StringBuilder are mutable

public class StrBufferA {
    public static void main(String[] args) {

        String s = new String("Hello");
        StringBuffer sbuf = new StringBuffer("World");

        // String is immutable (original string does not change)
        System.out.println("original String:" + s);

        // concat() creates a new String object
        System.out.println("concat:" + s.concat(" java"));

        // Original String remains unchanged
        System.out.println("after concat:" + s);

        // StringBuffer is mutable (original object changes)
        System.out.println("original sb:" + sbuf);

        // Method 1: append() - adds text at the end
        System.out.println("append:" + sbuf.append(" of Java"));
        System.out.println("after append:" + sbuf);

        // Method 2: insert() - inserts text at the specified index
        System.out.println("insert #:" + sbuf.insert(2, "###"));
        System.out.println(sbuf);

        // Method 3: replace() - replaces characters from start to end-1
        System.out.println("replace:" + sbuf.replace(2, 5, "***"));

        // Method 4: delete() - deletes characters from start to end-1
        System.out.println("delete:" + sbuf.delete(2, 5));

        // Method 5: reverse() - reverses the string
        System.out.println(sbuf.reverse());

        // StringBuilder is also mutable
        StringBuilder build = new StringBuilder("hello builder");

        // append() adds text at the end
        System.out.println(build.append("How r u?"));
        System.out.println(build);

    }
}