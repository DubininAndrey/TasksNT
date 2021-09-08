import java.util.Scanner;

public class Task1 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = i + 1;
    }

    StringBuilder path = new StringBuilder();
    int i = 0;
    int num = 0;
    path.append(1);
    while (true) {
      for (int j = 1; j <= m; j++) {
        num = array[i];
        i++;
        if (i > array.length - 1) {
          i = 0;
        }
      }
      if (num == 1) {
        break;
      } else {
        path.append(num);
        if (i == 0) {
          i = array.length - 1;
        } else {
          i--;
        }
      }
    }
    System.out.println(path);
    scanner.close();
  }
}
