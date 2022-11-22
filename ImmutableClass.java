/*
 * write a program that implements the concept of immutable class.
 */
public class ImmutableClass {
    private final String s;  
    ImmutableClass(final String s) {  
    this.s = s;  
    }  
    public final String getName() {  
    return s;  
    }  
    public static void main(String[] args) {  
    ImmutableClass obj = new ImmutableClass("Java is the best");  
    System.out.println(obj.getName());  
    }  
}
