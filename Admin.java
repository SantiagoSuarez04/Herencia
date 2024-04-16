public class Admin extends Persona {
    private String admin_id="";
    private String department="";

    public Admin(String user_name, String last_name, String document, String gender, String admin_id, String department) {
        super(user_name, last_name, document, gender);
        this.admin_id=admin_id;
        this.department=department;
    }
    
}
