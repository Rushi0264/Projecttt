package Java_8.CustomAnnoatationEx;

@Author(name = "Rushikesh Chepte")
@Version(number = 1)
public class Employee {
    @FieldInfo(type = "int")
    private int id;

    @FieldInfo(type = "String")
    private String name;

    @MethodInfo(description = "Display Employee Details")
    @Role("ADMIN")
    public void display(){
        System.out.println("Employee detail displayed");
    }
}
