public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.learn("Знание");
System.out.println("Сделали студента");

        SchoolTeacherWorker schoolTeacherWorker = new SchoolTeacherWorker("Математика");
        schoolTeacherWorker.teach(student);
        schoolTeacherWorker.prepareLesson();
        System.out.println("Сделали SchoolTeacherWorker");

        UniversityTeacherWorker universityTeacherWorker = new UniversityTeacherWorker("Курс прикладного мукамольства");
        universityTeacherWorker.prepareLesson();
        universityTeacherWorker.teach(student);

        System.out.println("Сделали UniversityTeacherWorker");

        IrbisTeacherWorker irbisTeacherWorker = new IrbisTeacherWorker();
        irbisTeacherWorker.teach(student);
        irbisTeacherWorker.prepareLesson();
        System.out.println("Сделали irbisTeacherWorker");




    }

}