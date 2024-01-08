import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
//        Student s1 = new Student(1, "abc");
//        Student s2 = new Student(2, "abc2");
//        Student s3 = new Student(3, "ascsad");
//        Student s4 = new Student(4, "grhgfhfgc");
//        Student s5 = new Student(5, "assaffsaasfdf");
//
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        list.add(s5);

        ReadWriteFile.writeFile("data.txt", list);
//        list = ReadWriteFile.readFile("data.txt");
//        for (Student st: list){
//            System.out.println(st);
//        }





    }
}