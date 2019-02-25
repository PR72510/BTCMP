import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Sol5 {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Kushagra", 22,78));
        list.add(new Student("Jatin", 25,80));
        list.add(new Student("Rishabh", 27,59));
        list.add(new Student("Rahul", 20,68));
        list.add(new Student("Gaurav", 24,68));
        list.add(new Student("Vaibhav", 23,78));

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int v1 = (int) (o2.Score - o1.Score);
                if(v1==0){
                   return o1.name.compareTo(o2.name);
                }
                return (int)(o2.Score - o1.Score);
            }
        });

        Iterator<Student> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }

    }
}

class Student{
    String name;
    double age, Score;

    public Student(String name, double age, double score) {
        this.name = name;
        this.age = age;
        Score = score;
    }

    public String toString(){
        return this.age +" " + this.name + " " + this.Score ;
    }
}
