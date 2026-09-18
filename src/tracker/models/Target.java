// 1. Target.java (Model)
package tracker.models;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Target implements Serializable {
    private String domain;
    private String scope;
    private List<Vulnerability> vulnerabilities;

    public Target(String domain, String scope) {
        this.domain = domain;
        this.scope = scope;
        this.vulnerabilities = new ArrayList<>();
    }

    public String getDomain() { return domain; }
    public void addVulnerability(Vulnerability v) { vulnerabilities.add(v); }
    public List<Vulnerability> getVulnerabilities() { return vulnerabilities; }
    
    @Override
    public String toString() { return "Target: " + domain + " | Scope: " + scope; }
}
