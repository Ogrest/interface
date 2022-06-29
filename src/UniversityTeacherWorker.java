public class UniversityTeacherWorker implements ITeacherWorker{
    private String courseName;

    public UniversityTeacherWorker(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void prepareLesson() {
        workOnDoctorskaya();
        System.out.println(courseName);
    }

    @Override
    public void teach(Student Student) {
        speakAboutPutin();

        // вызывает у студента learn(courseName)
    }

    public void workOnDoctorskaya(){
        System.out.println("Ебаш докторскую");
    }

    public void speakAboutPutin(){
        System.out.println("Разговоры о деде");
    }
}


