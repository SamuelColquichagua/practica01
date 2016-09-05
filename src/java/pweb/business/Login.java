package pweb.business;

import java.io.Serializable;

public class Login implements Serializable {

    private String E_mail;
    private String Password;
    

    public Login() {
        E_mail = "";
        Password = "";
        
    }

    public Login(String E_mail, String Password) {
        this.E_mail = E_mail;
        this.Password = Password;
        
    }

    public String getE_mail() {
        return E_mail;
    }

    public void setE_mail(String E_mail) {
        this.E_mail = E_mail;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

   
}