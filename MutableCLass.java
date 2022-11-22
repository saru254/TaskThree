/*
 * write a program that implements the concept of mutable class.
 */
public class MutableCLass {
    private String s;  
    MutableCLass(String s) {  
    this.s = s;  
    }  
    public String getName() {  
    return s;  
    }  
    public void setName(String coursename) {  
    this.s = coursename;  
    }  
    public static void main(String[] args) {  
        MutableCLass obj = new MutableCLass("Java");  
        System.out.println(obj.getName());  
    // Here, we can update the name using the setName method.  
        obj.setName("Karen loves java");  
        System.out.println(obj.getName());  
        }  
}
