import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        String[] phones = new String[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("    CONTACT MANAGEMENT SYSTEM");
            System.out.println("====================================");

            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Edit Contact");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    if (count >= names.length) {
                        System.out.println("\nContact list is full.");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter Phone Number: ");
                    phones[count] = sc.nextLine();

                    count++;

                    System.out.println("\nContact Added Successfully.");
                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("\nNo Contacts Available.");

                    } else {

                        System.out.println("\n========== CONTACT LIST ==========");

                        for (int i = 0; i < count; i++) {

                            System.out.println((i + 1) + ". Name  : " + names[i]);
                            System.out.println("   Phone : " + phones[i]);
                            System.out.println("----------------------------------");

                        }

                    }

                    break;

                case 3:

                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(search)) {

                            System.out.println("\nContact Found");
                            System.out.println("------------------------");
                            System.out.println("Name  : " + names[i]);
                            System.out.println("Phone : " + phones[i]);

                            found = true;
                            break;
                        }

                    }

                    if (!found) {

                        System.out.println("\nContact Not Found.");

                    }

                    break;

                case 4:

                    System.out.print("Enter Name to Delete: ");
                    String delete = sc.nextLine();

                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(delete)) {

                            for (int j = i; j < count - 1; j++) {

                                names[j] = names[j + 1];
                                phones[j] = phones[j + 1];

                            }

                            names[count - 1] = null;
                            phones[count - 1] = null;

                            count--;

                            deleted = true;

                            System.out.println("\nContact Deleted Successfully.");

                            break;

                        }

                    }

                    if (!deleted) {

                        System.out.println("\nContact Not Found.");

                    }

                    break;

                case 5:

                    System.out.print("Enter Name to Edit: ");
                    String edit = sc.nextLine();

                    boolean updated = false;

                    for (int i = 0; i < count; i++) {

                        if (names[i].equalsIgnoreCase(edit)) {

                            System.out.print("Enter New Name: ");
                            names[i] = sc.nextLine();

                            System.out.print("Enter New Phone Number: ");
                            phones[i] = sc.nextLine();

                            updated = true;

                            System.out.println("\nContact Updated Successfully.");

                            break;

                        }

                    }

                    if (!updated) {

                        System.out.println("\nContact Not Found.");

                    }

                    break;

                case 6:

                    System.out.println("\nThank You for using Contact Management System!");

                    break;

                default:

                    System.out.println("\nInvalid Choice! Please try again.");

            }

        } while (choice != 6);

        sc.close();

    }

}