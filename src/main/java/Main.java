import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) throws IOException {

    String numberClass = "7б";
    Teacher teacher = new Teacher("Thomas", numberClass);
    List<Student> students = new ArrayList<>();

    students.add(new Student("Anna", numberClass));
    students.add(new Student("John", numberClass));
    students.add(new Student("Kurt", numberClass));
    students.add(new Student("Bill", numberClass));
    students.add(new Student("Sara", numberClass));
    students.add(new Student("Anabel", numberClass));

    Classroom classroom = new Classroom(numberClass, teacher, students);

    XmlMapper xmlMapper = new XmlMapper();
    xmlMapper.writeValue(new File("temp.xml"), classroom);

    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.writeValue(new File("temp.json"), classroom);

    FileOutputStream fos = new FileOutputStream(new File("temp.dat"));
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(classroom);
    oos.flush();
    oos.close();

  }

}
