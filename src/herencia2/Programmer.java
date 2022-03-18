
package herencia2;


public class Programmer extends Employee {
    private String language;

    public Programmer() {
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    


    @Override
    public void printData() {
        super.printData(); 
        System.out.println("lenguaje de programación a trabajar: "+this.language); 
    }
    
   
    
}
