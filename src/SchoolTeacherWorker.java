public class SchoolTeacherWorker implements ITeacherWorker {
    private String lessonName;

    public SchoolTeacherWorker(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public void teach(Student student) {
        // вызывает speakWithOtherTeachers
        speakWithOtherTeachers();
        // вызывает у студента learn(lessonName)
        student.learn(lessonName);
    }

    @Override
    public void prepareLesson() {
        // повторяет lessonName
        System.out.println(lessonName);
    }

    public void speakWithOtherTeachers(){
        System.out.println("Отсутствует пол урока");
    }

}