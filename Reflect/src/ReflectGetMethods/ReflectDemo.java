package ReflectGetMethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
    Class<?> reflect_student = Class.forName("ReflectGetMethods.Student");
    System.out.println(reflect_student);
//
//    Constructor<?>[] cons = reflect_student.getConstructors();
//
//    Constructor<?>[] con = reflect_student.getDeclaredConstructors();
//
//    for (Constructor c : cons) {
//      System.out.println(c);
//    }

    Constructor<?> con = reflect_student.getConstructor(String.class, int.class, String.class);
    Object o = con.newInstance("coder", 22, "London");
    System.out.println(o);

    Constructor<?> cons = reflect_student.getDeclaredConstructor(String.class, int.class);
    cons.setAccessible(true);
    Object why = cons.newInstance("why", 22);
    System.out.println(why);

//    Field[] df = reflect_student.getDeclaredFields();
//    for (Field d : df) {
//      System.out.println(d);
//    }

    Field name = reflect_student.getField("name");
    name.set(why, "jeams");
    System.out.println(name);
  }
}
