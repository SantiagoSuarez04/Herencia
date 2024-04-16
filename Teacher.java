public class Teacher extends Persona{
private String teacher_id="";
// aditional atributes for admin
// admin id
// department

// aditional atributes for teacher
// teacher id 
// subject taught(a list of subjects)
// classrooms
// methods add_assigment
// add_office_hours
    public Teacher(String user_name, String last_name, String document, String gender, String teacher_id) {
        super(user_name, last_name, document, gender);
        this.teacher_id=teacher_id;
    }
    
}
