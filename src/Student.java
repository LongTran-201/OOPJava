public class Student {
    private  int ID;
    private String name;
    private int Age;
    private double pointMath;
    private  double pointChemistry;
    private  double pointPhysic;
    private  Classroom classroom;
    //Hàm khởi tạo không tham số;
    public Student (){

    }
    //Hàm khởi tạo có tham số;
    public Student (int ID, String name, int Age,double pointMath,double pointChemistry, double pointPhysic, Classroom classroom){
        this.ID = ID;
        this.name = name;
        this.Age = Age;
        this.pointMath = pointMath;
        this.pointChemistry = pointChemistry;
        this.pointPhysic = pointPhysic;
        this.classroom = classroom;
    }
    // Getter and Setter
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPointMath() {
        return pointMath;
    }

    public void setPointMath(double pointMath) {
        this.pointMath = pointMath;
    }

    public double getPointChemistry() {
        return pointChemistry;
    }

    public void setPointChemistry(double pointChemistry) {
        this.pointChemistry = pointChemistry;
    }

    public double getPointPhysic() {
        return pointPhysic;
    }

    public void setPointPhysic(double pointPhysic) {
        this.pointPhysic = pointPhysic;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                ", pointMath=" + pointMath +
                ", pointChemistry=" + pointChemistry +
                ", pointPhysic=" + pointPhysic +
                ", classroom=" + classroom +
                '}';
    }
    public double DiemTB(){
        return (pointPhysic+pointChemistry+pointMath)/3;
    }


}
