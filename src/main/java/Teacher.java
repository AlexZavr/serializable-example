import java.io.Serializable;

public class Teacher extends Person  implements Serializable {

  private String numberClass;

  public Teacher(String name, String numberClass) {
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
