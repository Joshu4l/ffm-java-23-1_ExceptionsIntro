public class Main {

    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        Student my1stStudent = Student.builder()
                .name("Florian")
                .subject("Geschichte")
                .build();
        studentService.addNewStudent(my1stStudent);


        Student my2ndStudent = Student.builder()
                .name("Josh")
                .subject("English")
                .build();
        studentService.addNewStudent(my2ndStudent);


        Student my3rdStudent = Student.builder()

                .name("Dustin")
                .subject("Rasch")
                .build();
        studentService.addNewStudent(my3rdStudent);


        Student my4thStudent = Student.builder()
                .name("Jörg")
                .subject("Wolff")
                .build();
        studentService.addNewStudent(my4thStudent);


        //TODO:
        System.out.println( studentService.findStudent( my4thStudent.id()) );


        //Student sampleStudent = studentService.addNewStudent(my4thStudent);
        /*
            IMPORTANT TO UNDERSTAND HERE:
            the actual SAVING-INVOKATION DOES RETURN the created object itself!
            From there we can use the returned object to grab its id!

         */
        //System.out.println(studentService.findStudent(sampleStudent.id()));

    }

}
