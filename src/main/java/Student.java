import java.io.Serializable;

public class Student extends Person  implements Serializable {

  private String numberClass;

  public Student(String name, String numberClass) {
    super(name);
    this.numberClass = numberClass;
  }

  public String getNumberClass() {
    return numberClass;
  }

  public void setNumberClass(String numberClass) {
    this.numberClass = numberClass;
  }
}

