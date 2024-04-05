import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Studentmanagement {
    List<Student> students;
    Scanner sc = new Scanner(System.in);

    public Studentmanagement() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
        System.out.println(student);
    }

    public void EditStudent(int id, String newName, int newAge,
                            double newpoinMath,double newpointChemistry,double newpointPhysic ) {
        boolean Value = false;
        for (Student student: students){
            if(student.getID()== id) {
                Value = true;
                System.out.println("Nhập thông tin mới của sinh viên: ");
                System.out.println(student);
                student.setID(id);
                student.setName(newName);
                student.setAge(newAge);
                student.setPointMath(newpoinMath);
                student.setPointChemistry(newpointChemistry);
                student.setPointPhysic(newpointPhysic);
                System.out.println("Thông tin sinh viên đã được cập nhật");
                break;
            }

        }
        if(!Value){
            System.out.println("Không tìm thấy ID sinh viên");
        }
    }



}
