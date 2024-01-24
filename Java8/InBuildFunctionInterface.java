package Java8;

import java.util.function.Function;
import java.util.*;
public class InBuildFunctionInterface {
    public static void main(String[] args) {
//        Function<String , Integer> function = str -> str.length();
//        System.out.println(function.apply("Nafish"));
        Function<List<Teacher> , List<Teacher>> teacherWithNafPrefix = li -> {
            Function<String, String> s = str -> str.substring(0, 3);
            List<Teacher> teacherList = new ArrayList<>();
            for (Teacher t : li) {
                if (s.apply(t.getName()).equalsIgnoreCase("Naf")) {
                    teacherList.add(t);
                }
            }
            return teacherList;
        };
        Teacher t1 =new Teacher(1,"Nafish");
        Teacher t2 =new Teacher(2,"Nafeesh");
        Teacher t3 =new Teacher(1,"Vipul");
        Teacher t4 =new Teacher(1,"Some");
        List<Teacher> filterredTeacher = Arrays.asList(t1,t2,t3,t4);
        List<Teacher> result = teacherWithNafPrefix.apply(filterredTeacher);
        System.out.println(result);

    }
}

class Teacher{
    int id;
    String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
