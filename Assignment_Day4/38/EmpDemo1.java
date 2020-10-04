class Employee {
    private static int empNo;
    private int salary;
    private static int totalSalary;
  
    Employee(int salary) {
      empNo++;
      this.salary = salary;
      totalSalary = totalSalary + salary;
    }
  
    void display(){
      System.out.println("Total Employees : "+empNo+" Total salaries : "+totalSalary);
    }
  }
  
  class EmpDemo1{
      public static void main(String[] args) {
          Employee e1 = new Employee(3500);
          Employee e2 = new Employee(3500);
          Employee e3 = new Employee(3500);
          Employee e4 = new Employee(3500);
          e3.display();
          e4.display();
      }
  }