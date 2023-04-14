class Employee{
  private int eid;
  private String ename;
  private double hra;
  private double da;

  void setId(int eid){
    this.eid=eid;
  }
  void setName(String ename){
    this.ename=name;
  }
  int getId(){
    return eid;
  }
  String getName(){
    return name;
  }
  
}

class accountant extends Employee{
  private String edepartment;
  private double esalary;

  void setDepartment(String edepartment){
    this.edepartment=department;
  }
  void setSalary(double esalary){
    this.esalary=salary;
  }

  double calculateSalary(){}
  
}