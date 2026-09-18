package tracker.services;

import tracker.models.Target;
import tracker.models.Vulnerability;

import java.util.Map;

public class ReportGenerator {
    
    public static void printReport(ReconManager manager) {
        Map<String, Target> targets = manager.getAllTargets();
        
        System.out.println("\n========================================");
        System.out.println("          RECONNAISSANCE REPORT         ");
        System.out.println("========================================");
        
        if (targets.isEmpty()) {
            System.out.println("No targets tracked currently.");
            System.out.println("========================================\n");
            return;
        }

        for (Target target : targets.values()) {
            System.out.println(target.toString());
            
            if (target.getVulnerabilities().isEmpty()) {
                System.out.println("  -> No vulnerabilities logged yet.");
            } else {
                for (Vulnerability v : target.getVulnerabilities()) {
                    System.out.println("  -> " + v.toString());
                }
            }
            System.out.println("----------------------------------------");
        }
        System.out.println("Total Targets: " + targets.size());
        System.out.println("========================================\n");
    }
}
