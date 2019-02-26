import java.util.Scanner;

public class Sol1 {
    static boolean b1 = true;
    public static void main(String[] args) {
        Issuer I1 = new Issuer();
        Student s1 = new Student(101, "Jatin", "Ansal Town" );
        System.out.println("Enter 1. to issue a book");
        System.out.println("Enter 2. to return a book");
        System.out.println("Enter 3. to view student details");
        System.out.println("Enter 4. to Exit");



        while(b1){
            System.out.println("Enter your Choice ");
            Scanner s = new Scanner(System.in);
            int var = s.nextInt();
        switch(var) {
            case 1:
                I1.issueBook(s1);
                break;
            case 2:
                I1.returnBook(s1);
                break;
            case 3:
                I1.studentDetails(s1);
                break;
            case 4:
                System.out.println("Thank you");
                b1=false;
                break;
            default:
                System.out.println("Please Select Valid option");
            }
        }


    }
}

class Student{
    int ID;
    String name, Address;

    public Student(int ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        Address = address;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }
}

class Issuer implements Library{
    String bookName;
    int bookID, count;
    Scanner s = new Scanner(System.in);

    @Override
    public void issueBook(Student student) {
        System.out.println("Enter the name of book-");
        bookName = s.nextLine();
        System.out.println("Enter ID of the book");
        bookID = s.nextInt();
        count++;
        System.out.println(count+ " books issued by " + student.getName());
    }

    @Override
    public void returnBook(Student student) {
        System.out.println("Book with ID: " +bookID+ " returned by " + student.getName());
        count--;
        System.out.println(count+ " books issued");
    }

    @Override
    public void studentDetails(Student student) {
        System.out.println("Student Name " + student.getName());
        System.out.println("Student ID " + student.getID());
        System.out.println("Student`s  Address" + student.getAddress());
    }
}

interface Library{
        void issueBook(Student student);
        void returnBook(Student student);
        void studentDetails(Student student);
}
