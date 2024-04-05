import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementClass {
    private List<Classroom> classrooms;
    Scanner sc = new Scanner(System.in);

    public ManagementClass() {
        this.classrooms = new ArrayList<>();
    }
    public void DanhsachClass(Classroom classroom){
        this.classrooms= (List<Classroom>) classroom;
    }

    public void addClassroom(Classroom classroom) {
        this.classrooms.add(classroom);
    }

    public void updateClassroomById(int id, String newName) {
        boolean found = false;
        for (Classroom classroom : classrooms) {
            if (classroom.getIDClass() == id) {
                classroom.setNameClass(newName);
                System.out.println("Thông tin lớp học đã được cập nhật thành công.");
                found = true;
                System.out.println(classroom);
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy lớp học có id là " + id);
        }
    }

    // Hiển thị danh sách học viên theo lớp học


}
