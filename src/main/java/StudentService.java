import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        // IMPORTANT HERE: a random id for each new DB-entry is created automatically as follows:
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
            // using with .withId in line allows to even leave the instantiated object's id-argument blank
        return repo.save(studentToSave);

    }

    public Student findStudent(String studentId) {
        Optional<Student> optionalStudent = repo.findStudentById(studentId);

        if (optionalStudent.isPresent()) {
            return optionalStudent.get();
        } else {
            throw new NullPointerException ();
        }

    }

    public List<Student> getAllStudents(){
        return repo.getAllStudents();
    }

}
