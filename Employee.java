import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {
   @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private int id;

   @Column(name = "emp_name")
   private String empName;

   @Column(name = "emp_id")
   private String empId;

   @Column(name = "emp_role")
   private int empRole;  

   @Column(name = "emp_email")
   private String empEmail;

   @Column(name = "manager_name")
   private String managerName;

   @Column(name = "manager_email")
   private int managerEmail;  

   @Column(name = "emp_status")
   private String empStatus;

   @Column(name = "last_modification_date")
   private int lastModificationDate;  

   public Employee() {}

public int getId() {
   return id;
}

public void setId(int id) {
   this.id = id;
}

public String getEmpName() {
   return empName;
}

public void setEmpName(String empName) {
   this.empName = empName;
}

public String getEmpId() {
   return empId;
}

public void setEmpId(String empId) {
   this.empId = empId;
}

public int getEmpRole() {
   return empRole;
}

public void setEmpRole(int empRole) {
   this.empRole = empRole;
}

public String getEmpEmail() {
   return empEmail;
}

public void setEmpEmail(String empEmail) {
   this.empEmail = empEmail;
}

public String getManagerName() {
   return managerName;
}

public void setManagerName(String managerName) {
   this.managerName = managerName;
}

public int getManagerEmail() {
   return managerEmail;
}

public void setManagerEmail(int managerEmail) {
   this.managerEmail = managerEmail;
}

public String getEmpStatus() {
   return empStatus;
}

public void setEmpStatus(String empStatus) {
   this.empStatus = empStatus;
}

public int getLastModificationDate() {
   return lastModificationDate;
}

public void setLastModificationDate(int lastModificationDate) {
   this.lastModificationDate = lastModificationDate;
}
   
   
}