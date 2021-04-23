package w5;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet
{
    public static void main(String[] args)
    {
        Set<String> s = new TreeSet<>();
        s.add("Nguyen");
        s.add("Van");
        s.add("An");

        System.out.println(s); // tự động sắp xếp

        // muốn sort thì phải implements Comparable bên class Student
//        Set<Student> s1 = new TreeSet<>();
        // Tự tạo 1 Comparator riêng thì:
//        Set<Student> s1 = new TreeSet<>(new ByNameComparator());
        //Muốn gọn hơn nữa thì
        Set<Student> s1 = new TreeSet<>(new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2)
            {
                return o1.getName().compareTo(o2.getName());
            }
        });

        s1.add(new Student("001", "An"));
        s1.add(new Student("003", "Tam"));
        s1.add(new Student("003", "Binh"));

        System.out.println(s1);
    }
}
