import java.util.*;

// ---------------- Enum for Difficulty ----------------
enum Difficulty {
    EASY, MEDIUM, HARD
}

// ---------------- Generic Question Class ----------------
class Question<T> {
    private String text;
    private Difficulty difficulty;
    private List<T> options;
    private T correctAnswer;

    public Question(String text, Difficulty difficulty, List<T> options, T correctAnswer) {
        this.text = text;
        this.difficulty = difficulty;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public List<T> getOptions() {
        return options;
    }

    public T getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean checkAnswer(T submittedAnswer) {
        return correctAnswer.equals(submittedAnswer);
    }
}

// ---------------- Subject Class ----------------
class Subject<T> {
    private String name;
    private List<Question<T>> questions;

    public Subject(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addQuestion(Question<T> q) {
        questions.add(q);
    }

    public List<Question<T>> getQuestions() {
        return questions;
    }
}

// ---------------- Student Class ----------------
class Student {
    private String name;
    private String rollNumber;
    private Map<String, List<Object>> submittedAnswers; // subject → answers

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.submittedAnswers = new HashMap<>();
    }

    public void submitAnswer(String subject, Object answer) {
        submittedAnswers.putIfAbsent(subject, new ArrayList<>());
        submittedAnswers.get(subject).add(answer);
    }

    public Map<String, List<Object>> getSubmittedAnswers() {
        return submittedAnswers;
    }

    public String getName() {
        return name;
    }

    public String getRollNumber() {
        return rollNumber;
    }
}

// ---------------- Exam System Class ----------------
class ExamSystem {
    private List<Subject<?>> subjects;

    public ExamSystem() {
        subjects = new ArrayList<>();
    }

    public void addSubject(Subject<?> subject) {
        subjects.add(subject);
    }

    public List<Subject<?>> getSubjects() {
        return subjects;
    }

    // Student takes exam
    public <T> void takeExam(Student student, Subject<T> subject, Scanner sc) {
        System.out.println("\nStarting exam for subject: " + subject.getName());

        for (Question<T> q : subject.getQuestions()) {
            System.out.println("\nQ: " + q.getText() + " (" + q.getDifficulty() + ")");
            int i = 1;
            for (T option : q.getOptions()) {
                System.out.println(i + ". " + option);
                i++;
            }
            System.out.print("Enter your answer (1-" + q.getOptions().size() + "): ");
            int choice = sc.nextInt();
            T selected = q.getOptions().get(choice - 1);
            student.submitAnswer(subject.getName(), selected);
        }
    }

    // Calculate score
    public <T> int calculateScore(Student student, Subject<T> subject) {
        List<Question<T>> questions = subject.getQuestions();
        List<Object> answers = student.getSubmittedAnswers().get(subject.getName());
        int score = 0;

        if (answers == null) return 0;

        for (int i = 0; i < questions.size(); i++) {
            Question<T> q = questions.get(i);
            @SuppressWarnings("unchecked")
            T submitted = (T) answers.get(i);
            if (q.checkAnswer(submitted)) {
                score++;
            }
        }
        return score;
    }
}

// ---------------- Main ----------------
public class OnlineExamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create subjects
        Subject<String> java = new Subject<>("Java");
        java.addQuestion(new Question<>(
                "Which keyword is used to inherit a class in Java?",
                Difficulty.EASY,
                Arrays.asList("super", "this", "extends", "implements"),
                "extends"
        ));
        java.addQuestion(new Question<>(
                "Which collection allows unique elements only?",
                Difficulty.MEDIUM,
                Arrays.asList("List", "Map", "Set", "Queue"),
                "Set"
        ));

        Subject<String> dbms = new Subject<>("DBMS");
        dbms.addQuestion(new Question<>(
                "Which normal form eliminates transitive dependency?",
                Difficulty.HARD,
                Arrays.asList("1NF", "2NF", "3NF", "BCNF"),
                "3NF"
        ));

        // Exam system setup
        ExamSystem system = new ExamSystem();
        system.addSubject(java);
        system.addSubject(dbms);

        // Student
        Student s1 = new Student("Alice", "101");

        // Exam for Java
        system.takeExam(s1, java, sc);
        int javaScore = system.calculateScore(s1, java);
        System.out.println("\n" + s1.getName() + " scored " + javaScore + " in Java.");

        // Exam for DBMS
        system.takeExam(s1, dbms, sc);
        int dbmsScore = system.calculateScore(s1, dbms);
        System.out.println(s1.getName() + " scored " + dbmsScore + " in DBMS.");

        sc.close();
    }
}
