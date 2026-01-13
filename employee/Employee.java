package employee;

public class Employee {
    private int EmpNo;
    private String EmpName;
    private String JoinDate;
    private char DesignationCode;
    private String Department;
    private int Basic;
    private int HRA;
    private int IT;
    private String Designation;
    private int DA;
    
    public void addEmpId(int EmpNo) {
        this.EmpNo = EmpNo;
    }
    public void addEmpName(String EmpName) {
        this.EmpName = EmpName;
    }
    public void addJoinDate(String JoinDate) {
        this.JoinDate = JoinDate;
    }
    public void addDesignationCode(char DesignationCode) {
        this.DesignationCode = DesignationCode;
    }
    public void addDepartment(String Department) {
        this.Department = Department;
    }
    public void addBasic(int Basic) {
        this.Basic = Basic;
    }
    public void addHRA(int HRA) {
        this.HRA = HRA;
    }
    public void addIT(int IT) {
        this.IT = IT;
    }

    public int getEmpNo() {
        return EmpNo;
    }
    public String getEmpName() {
        return EmpName;
    }
    public String getDepartment() {
        return Department;
    }
    public String getDesignation() {
        return Designation;
    }
    public int getSalary() {
        switch(this.DesignationCode){
            case 'e':
                this.Designation="Engineer";
                this.DA=20000;
                break;
            case 'c':
                this.Designation="Consultant";
                this.DA=32000;
                break;
            case 'k':
                this.Designation="Clerk";
                this.DA=12000;
                break;
            case 'r':
                this.Designation="Receptionist";
                this.DA=15000;
                break;
            case 'm':
                this.Designation="Manager";
                this.DA=40000;
                break;
        }
        return this.Basic + this.HRA + this.DA - this.IT;
    }
}
