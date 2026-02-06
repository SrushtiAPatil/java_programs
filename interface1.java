interface ExamRule {
    void startExam();
    void submitExam();
}

class OnlineExam implements ExamRule {

    public void startExam() {
        System.out.println("Online exam started");
    }

    public void submitExam() {
        System.out.println("Exam submitted successfully");
    }
}

class OfflineExam implements ExamRule {

    public void startExam() {
        System.out.println("Offline exam started in exam hall");
    }

    public void submitExam() {
        System.out.println("Answer sheet collected");
    }
}

public class interface1 {

    public static void main(String[] args) {

        ExamRule exam;

        exam = new OnlineExam();
        exam.startExam();
        exam.submitExam();

        exam = new OfflineExam();
        exam.startExam();
        exam.submitExam();
    }
}
