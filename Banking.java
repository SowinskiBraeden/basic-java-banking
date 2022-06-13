import java.util.Scanner;

class Banking {
  public static void main(String[] args) {
    System.out.println("Banking System");

    int opt;
    Scanner input = new Scanner(System.in);
    
    while (true) {
      System.out.println("\nSelect an option:");
      System.out.println("1. Login\n2. Register\n3. Exit");
      System.out.print("> ");

      opt = Integer.parseInt(input.nextLine());

      System.out.println();

      switch (opt) {
        case 1:
          System.out.println("Login...");
          break;
        case 2:
          System.out.println("Register...");
          break;
        case 3:
          input.close();
          System.out.println("Exiting...");
          System.exit(0);
        default:
          System.out.println("Invalid option");
          break;
        }
    }
  }
}