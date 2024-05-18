// package Collection;
import java.util.*;
class Student implements Comparable<Student> {
    int r;
    String name;

    @Override
    public String toString() {
        return "name:"+this.name+": r:"+this.r;
    }

    @Override
    public int hashCode() {
        return Objects.hash(r);
    }

    @Override
    public int compareTo(Student that) {
        return this.r-that.r;
    }

    public Student(int r, String name) {
        this.r = r;
        this.name = name;
    }

}
public class Main {
    public static void main(String[] args) {
       /*  List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        int size = list.size();

        //1st way to iterate
        for(int i=0;i<size;i++) {
            System.out.println("for loop"+list.get(i));
        }

        //2nd way to iterate
        for(Integer i:list) {
            System.out.println("for each loop"+i);
        }

        //3rd way to iterate
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println("iterator:"+iterator.next());
        }

        // to remove the first occurence of specific element
        // list.remove(Integer.valueOf(1));
        // System.out.println("final list:"+list);
        for(int i=0,j=9;i<5&&j>=5;i++,j--) {
            System.out.println("i:"+i+" j:"+j);
        }*/

       /*
       Set<Student> s = new HashSet<>();
        Student student = new Student(1,"Shourja");
        Student student1 = new Student(1,"Shourja");
        System.out.println(student.hashCode()+":"+student1.hashCode());
        s.remove(student1);
        System.out.println(s);
        */ 

        List<Student> l = new ArrayList<>();

        l.add(new Student(2, "Shourja1"));
        l.add(new Student(1, "Shourja2"));
        l.add(new Student(4, "Shourja3"));
        l.add(new Student(3, "Shourja4"));    

        System.out.println(l);

        Collections.sort(l);
        System.out.println(l);

        List<Student> l1 = new ArrayList<>();

        l1.add(new Student(2, "Shourja1"));
        l1.add(new Student(1, "Shourja2"));
        l1.add(new Student(4, "Shourja3"));
        l1.add(new Student(3, "Shourja4"));    

        System.out.println(l1);

        Collections.sort(l1, new Comparator<Student>() {
            @Override
            public int compare(Student o1,Student o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(l1);
    }
}
