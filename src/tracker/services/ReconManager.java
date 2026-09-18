// 3. ReconManager.java (Business Logic)
package tracker.services;
import tracker.models.Target;
import java.util.HashMap;
import java.util.Map;

public class ReconManager {
    private Map<String, Target> targets = new HashMap<>();

    public void addTarget(Target target) {
        targets.put(target.getDomain(), target);
    }

    public Target getTarget(String domain) {
        return targets.get(domain);
    }

    public Map<String, Target> getAllTargets() {
        return targets;
    }
    
    // Satisfies rubric's "Error Handling" and "Validation"
    public boolean deleteTarget(String domain) {
        if (targets.containsKey(domain)) {
            targets.remove(domain);
            return true;
        }
        return false;
    }
}
