
package herencia2;


public class DataBasePro extends Employee {
    private String databaseTool;

    public DataBasePro() {
    }

    public void setDatabaseTool(String databaseTool) {
        this.databaseTool = databaseTool;
    }

    
    
    
    
    
    
    @Override
    public void printData() {
        super.printData(); 
        System.out.println("herramienta de base de datos: "+this.databaseTool);
    }
    
    
    
}
