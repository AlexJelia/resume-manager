package alex.jelia.empmanager.webapp.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class OrganizationsSection extends Section {
    private static final long serialVersionUID = 1L;
    private List<Organization> organizations;

    public OrganizationsSection() {}

    public OrganizationsSection(Organization... organizations) {
        this(Arrays.asList(organizations));
    }

    public OrganizationsSection(List<Organization> organizations) {
        Objects.requireNonNull(organizations, "organizations must not be null");
        this.organizations = organizations;
    }

    public List<Organization> getOrganizations() {
        return organizations;
    }

    @Override
    public String toString() {
        return organizations.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrganizationsSection that = (OrganizationsSection) o;

        return organizations.equals(that.organizations);

    }

    @Override
    public int hashCode() {
        return organizations.hashCode();
    }
}
