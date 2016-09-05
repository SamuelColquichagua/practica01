package pweb.business;

import java.io.Serializable;

public class Matricula implements Serializable {

    
   
    private String firstName;
    private String lastName;
    

    public Matricula() {
        
        firstName = "";
        lastName = "";
        
    }

    public Matricula(String firstName, String lastName) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        
    }
    
      

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
}
