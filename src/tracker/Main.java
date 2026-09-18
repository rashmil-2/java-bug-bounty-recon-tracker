package tracker;

import tracker.models.Target;
import tracker.models.Vulnerability;
import tracker.services.ReconManager;
import tracker.services.ReportGenerator;
import tracker.utils.DataStorage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReconManager manager = new ReconManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Load existing data from file
        DataStorage.load(manager);
        System.out.println("=== Bug Bounty Recon Tracker Started ===");

        while (running) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Add New Target");
            System.out.println("2. Log Vulnerability");
            System.out.println("3. View Recon Report");
            System.out.println("4. Delete Target");
            System.out.println("5. Exit & Save");
            System.out.print("Select an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter target domain (e.g., api.target.com): ");
                    String domain = scanner.nextLine();
                    System.out.print("Enter scope (e.g., *.target.com): ");
                    String scope = scanner.nextLine();
                    manager.addTarget(new Target(domain, scope));
                    System.out.println("[+] Target added successfully.");
                    break;

                case "2":
                    System.out.print("Enter target domain to log vulnerability for: ");
                    String targetDomain = scanner.nextLine();
                    Target target = manager.getTarget(targetDomain);
                    
                    if (target != null) {
                        System.out.print("Enter vulnerability type (e.g., IDOR, XSS): ");
                        String type = scanner.nextLine();
                        System.out.print("Enter severity (Low/Medium/High/Critical): ");
                        String severity = scanner.nextLine();
                        
                        target.addVulnerability(new Vulnerability(type, severity));
                        System.out.println("[+] Vulnerability logged successfully.");
                    } else {
                        System.out.println("[-] Target not found. Please add it first.");
                    }
                    break;

                case "3":
                    ReportGenerator.printReport(manager);
                    break;

                case "4":
                    System.out.print("Enter target domain to delete: ");
                    String delDomain = scanner.nextLine();
                    if (manager.deleteTarget(delDomain)) {
                        System.out.println("[+] Target deleted successfully.");
                    } else {
                        System.out.println("[-] Target not found.");
                    }
                    break;

                case "5":
                    // Save data to file before exiting
                    DataStorage.save(manager);
                    System.out.println("[!] Data saved. Exiting Tracker. Happy hunting!");
                    running = false;
                    break;

                default:
                    System.out.println("[-] Invalid option. Please enter a number between 1 and 5.");
            }
        }
        scanner.close();
    }
}
