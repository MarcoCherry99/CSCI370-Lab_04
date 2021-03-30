import java.util.ArrayList;

public class StudentDao {

    private ArrayList<Student> studentList;

    public void studentListMaker(){
        studentList.add(new Student("Tate-Moffo", "Alex", "GameDev"));
        studentList.add(new Student("Pinedo", "Xavier", "Arts"));
        studentList.add(new Student("Haines", "Emily", "Arts"));
        studentList.add(new Student("Abraham", "Reth", "Engineering"));
        studentList.add(new Student("Ancrum", "Will", "Nutrition"));
    }

    private ArrayList<Student> getAllStudents(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return studentList;
    }
}
