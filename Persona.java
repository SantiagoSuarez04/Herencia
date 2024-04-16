public class Persona {
    protected String user_name="";
    protected String last_name="";
    protected String document="";
    protected String gender= "";
    


public Persona(String user_name, String last_name, String document, String gender){
    this.user_name = user_name;
    this.last_name=last_name;
    this.document=document;
    this.gender=gender;
}
    public String getUsername(){
        return this.user_name;
    }
    public String getLastname(){
        return this.last_name;
    }
    public String getDocument(){
        return this.document;
    }
    public String getGender(){
        return this.gender;
    }

    public void setUsername(String user_name){
        this.user_name=user_name;
    }
    public void setLastname(String last_name){
        this.last_name=last_name;
    }
    public void setDocument(String document){
        this.document=document;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String toString() {
        return "Persona{" +
                "user_name='" + user_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", document='" + document + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
    
}

