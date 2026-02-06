package Java_8.CustomAnnoatationEx;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Class<Employee> cls = Employee.class;

        Author author = cls.getAnnotation(Author.class);
        Version version = cls.getAnnotation(Version.class);

        System.out.println("Author Name : "+author.name());
        System.out.println("Version NO  : "+version.number());

        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(FieldInfo.class)) {
                FieldInfo fi = field.getAnnotation(FieldInfo.class);
                System.out.println("Field Name  : " + field.getName());
                System.out.println("Field Type  : " + fi.type());
            }
        }

        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MethodInfo.class)) {

                MethodInfo mi = method.getAnnotation(MethodInfo.class);
                Role role = method.getAnnotation(Role.class);

                System.out.println("Method Name : " + method.getName());
                System.out.println("Description : " + mi.description());
                System.out.println("Role        : " + role.value());
            }
        }
    }
}
