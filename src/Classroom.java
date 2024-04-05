import java.util.ArrayList;
import java.util.List;

public class Classroom {
    private int IDClass;
    private String nameClass;

    //Hàm khởi tạo không tham số
    public Classroom() {

    }

    // Hàm khởi tạo có tham số
    public Classroom(int IDClass, String nameClass) {
        this.IDClass = IDClass;
        this.nameClass = nameClass;
    }

    // Getter and Setter
    public int getIDClass() {
        return IDClass;
    }

    public void setIDClass(int IDClass) {
        this.IDClass = IDClass;
    }

    public String getNameClass() {
        return nameClass;
    }

    public boolean setNameClass(String newName) {
        this.nameClass = nameClass;
        return false;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "IDClass=" + IDClass +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }
}


