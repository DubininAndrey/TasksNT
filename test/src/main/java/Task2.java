import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task2 {

  public static void main(String[] args) {
    File file1 = new File("src/main/resources/file1");
    File file2 = new File("src/main/resources/file2");
    Scanner scanner = null;
    try {
      scanner = new Scanner(file1);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    float xM = scanner.nextFloat();
    float yM = scanner.nextFloat();
    float r = scanner.nextFloat();
    Scanner scanner2 = null;
    try {
      scanner2 = new Scanner(file2);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    while (scanner2.hasNextLine()) {
      float xC = scanner2.nextFloat();
      float yC = scanner2.nextFloat();
      float v = (float) (Math.sqrt(xC - xM) + (float) Math.sqrt(yC - yM));
      if ((float) Math.sqrt(r) == v) {
        System.out.print("0 - точка лежит на окружности" + "\r\n");
      } else if ((float) Math.sqrt(r) > v) {
        System.out.print("1 - точка внутри" + "\r\n");
      } else {
        System.out.print("2 - точка снаружи" + "\r\n");
      }
    }
  }
}
