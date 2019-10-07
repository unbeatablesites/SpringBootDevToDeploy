package frank.in.ecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Information", schema = "ecomDashApp")
public class EmployeeInformation extends KeyEntity{

    private String _name;
    private String position;
    private String officialLocation;
    private String age;
    private String startDate;
    private String salary;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOfficialLocation() {
        return officialLocation;
    }

    public void setOfficialLocation(String officialLocation) {
        this.officialLocation = officialLocation;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
