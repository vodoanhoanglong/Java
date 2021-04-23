package w5;

import java.util.*;

public class Test
{
    public static boolean search(int arr[], int i) throws IndexOutOfBoundsException
    {
        if(i<0 || i == arr.length) throw new ArrayIndexOutOfBoundsException("SAI VỊ TRÍ");
        else return true;
    }

    public static void main(String[] args)
    {
//        Object[] arr = new String[3];
//        arr[0] = "123";
//        arr[1] = 123;  // lỗi ngoại lệ bởi vì arr trỏ tới vùng nhớ là String
        try
        {
            int a = Integer.parseInt("mot"); // check line này xong thấy lỗi nhảy xuống catch liền
            int[] arr = {1,2,3};
            System.out.println(a);
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException ex) // nếu 1 catch đc thực hiện thì sẽ dừng và k thực hiện catch kế tiếp
        {
            System.err.println("Sai vị trí");
        }catch (Exception ex)    // Exception là cha của tất cả các ngoại lệ nên cần đc đặt ở dưới cùng
        {
            System.err.println("Sai đinh dạng");
        }finally
        {
            System.out.println("Finally"); // luôn luôn chạy
        }
        System.out.println("end.");

        Collection<Integer> col = new ArrayList<Integer>();
        System.out.println(col.size());
        System.out.println(col.contains(12));
        Iterator<Integer> iter = col.iterator();
        if(iter.hasNext()) // check xem phần tử kế tiếp của iter có rỗng k, nếu k rỗng thì return true
        {
            int i = iter.next();
        }

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        //for i
        for(int i=0; i<arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i)+" ");
        }
        System.out.println();
        //for each
        for (Integer i : arrayList)
        {
            System.out.println(i + " ");
        }
        System.out.println();
        //iterator
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next()+ " ");
        }
        System.out.println();
        //ListIterator
        ListIterator<Integer> listIterator = arrayList.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next()+ " ");
        }
        System.out.println();
        ArrayList<Student> students = new ArrayList<>();
//        students.add(1); // lỗi biên dịch
        System.out.println();
        LinkedList<Integer> sts = new LinkedList<Integer>();
        sts.addFirst(100);
        sts.add(10);
        sts.get(0);
        System.out.println(sts);

        System.out.println();
        Vector<Integer> vector = new Vector<>();
    }
}
