
package herencia2;


public class Herencia2 {

   
    public static void main(String[] args) {
        
        
        // imresion de datos de la superclase Employee
        Employee empleado= new Employee();
        empleado.setName("Juanito");
        empleado.setAge(45);
        empleado.setSalary(4500.00);
        empleado.printData();
        System.out.println("\n");
        
        // impresión de datos de la clase Programmer (heredada de Employee) con la invocacion del metodo de la superclase
        Programmer programador = new Programmer();
        programador.setName("luis fernando");
        programador.setAge(60);
        programador.setSalary(8000.00);
        programador.setLanguage("JavaScript");
        programador.printData();
        System.out.println("\n");
        
        
        // impresión de datos de la clase DataBasePro (heredada de Employee) con la invocacion del metodo de la superclase
        DataBasePro dataTool = new DataBasePro();
        dataTool.setName("Mario");
        dataTool.setAge(19);
        dataTool.setSalary(5000.00);
        dataTool.setDatabaseTool("Mysql");
        dataTool.printData();
       
    }
    
}
