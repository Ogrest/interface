public class IrbisTeacherWorker implements ITeacherWorker {

    private String courseName = "Java";


    @Override
    public void teach(Student Student) {
        Student.learn(courseName);
        // вызывает у студента learn(courseName)
    }

    @Override
    public void prepareLesson() {
        readHabr();
        // вызывает readHabr()
    }

    public void readHabr() {
        System.out.println("*Читает Хабр*");
    }

    public void doIrbisTasks() {
        readHabr();
        // вызывает readHabr()
    }
}
