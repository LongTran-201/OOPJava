import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagementClass managementClass = new ManagementClass();
        Studentmanagement studentmanagement = new Studentmanagement();
        while (true) {
            System.out.println("------Mời chọn chức năng-------");
            System.out.println("------1: Thêm mới 1 lớp học-------");
            System.out.println("------2: Sửa thông tin lớp học theo Id-------");
            System.out.println("------3: Hiển thị danh sách học viên theo lớp học-------");
            System.out.println("------4: Thêm mới 1 học viên-------");
            System.out.println("------5: Sửa thông tin học viên theo ID-------");
            System.out.println("------6: Xoá học viên theo ID-------");
            System.out.println("------7: Tìm kiếm theo tên gần đúng-------");
            System.out.println("------8: Sắp xếp học viên theo điểm TB tăng dần-------");
            System.out.println("------9: Hiển thị học viên có điểm trung bình cao nhất, thấp nhất  -------");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Mời nhập IDClass:");
                    int IDClass = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Mời nhập name Class: ");
                    String nameClass = sc.nextLine();
                    Classroom classroom = new Classroom(IDClass, nameClass);
                    managementClass.addClassroom(classroom);
                    System.out.println(classroom.toString());
                    sc.nextLine();
                    System.out.println(managementClass);

                    break;
                }
                case "2": {
                    System.out.println("Mời nhập id  Lớp cần sửa: ");
                    int IDClass = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Mời nhập Tên lớp mới: ");
                    String nameClass = sc.nextLine();
                    Classroom classroom1 = new Classroom(IDClass,nameClass);
                    managementClass.updateClassroomById(IDClass,nameClass);
                    System.out.println(classroom1.toString());
                    sc.nextLine();
                    managementClass.DanhsachClass(classroom1);
                    break;
                }
                case "3":
                case "4":{
                    System.out.println("Mời nhập id sinh viên: ");
                    int ID = sc.nextInt();
                    System.out.println("Mời nhập Tên sinh viên : ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Mời nhập tuổi sinh viên: ");
                    int Age = sc.nextInt();
                    System.out.println("Mời nhập điểm Toán sinh viên: ");
                    double pointMath = sc.nextDouble();
                    System.out.println("Mời nhập điểm Hoá sinh viên: ");
                    double pointChemistry = sc.nextDouble();
                    System.out.println("Mời nhập điểm Lý sinh viên: ");
                    double pointPhysic = sc.nextDouble();
                    System.out.println("Mời nhập lớp");
                    Student student1 = new Student(ID,name, Age,pointMath, pointChemistry,pointPhysic,);
                }

                case "5":

                case "6":
                case "7":
                case "8":
                case "9":
                case "10": {
                    return;
                }
            }
        }
    }
}
