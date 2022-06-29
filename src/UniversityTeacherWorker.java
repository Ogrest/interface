public class UniversityTeacherWorker implements ITeacherWorker{
    private String courseName;

    @Override
    public void prepareLesson() {
        workOnDoctorskaya();
    }

    @Override
    public void teach(Student Student) {
        speakAboutPutin();
        Student.learn(courseName);
        // вызывает у студента learn(courseName)
    }

    public void workOnDoctorskaya(){
        System.out.println("Ебаш докторскую");
    }

    public void speakAboutPutin(){
        System.out.println("Разговоры о деде");
    }
}


