import java.io.Serializable;
import java.util.List;

public class Classroom implements Serializable {

  private String classNumber;
  private Teacher teacher;
  private List<Student> students;

  public Classroom(String classNumber, Teacher teacher, List<Student> students) {
    this.classNumber = classNumber;
    this.teacher = teacher;
    this.students = students;
  }

  public String getClassNumber() {
    return classNumber;
  }

  public void setClassNumber(String classNumber) {
    this.classNumber = classNumber;
  }

  public Teacher getTeacher() {
    return teacher;
  }

  public void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  @Override
  public String toString() {
    return "Class room:\n" +
        "Class Number: " + this.classNumber + "\n" +
        "Teacher: " + this.teacher + "\n" +
        "Students: " + this.students;
  }

}
