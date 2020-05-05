
public class Departmnet {
    String Dname;
    Employee[] employees;

public Departmnet() {
	
}

public Departmnet(String Dname, Employee[] Ename ) {
	this.Dname = Dname;
	this.employees = Ename;

}

public String getDname() {
	return Dname;
}

public void setDname(String dname) {
	Dname = dname;
}

public Employee[] getEmployees() {
	return employees;
}

public void setEmployees(Employee[] employees) {
	this.employees = employees;
}

}