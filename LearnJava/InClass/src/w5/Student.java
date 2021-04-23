package w5;

public class Student implements Comparable<Student>
{
    private String id;
    private String name;

    public Student(String id, String name)
    {
        super();
        this.id = id;
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public int compareTo(Student o)
    {
//        int re = this.id.compareTo(o.id);
//        if (re != 0)
//            return re;
//        else
            return this.name.compareTo(o.name); // class TreeMapTest
    }

    @Override
    public String toString()
    {
        return this.id + " " + this.name;
    }
}
