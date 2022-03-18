
package herencia2;


public class Employee {
    
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    
    
    
   public void printData(){
       System.out.println("nombre: "+this.name);
       System.out.println("edad del empleado: "+this.age);
       System.out.println("salario mensual del empleado: "+this.salary);
    
    
    }
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
