import java.util.Date;

public class Question {
   int id;
   String name;
   CategoryQuestion category;
   TypeQuestion type;
   Account creator;
   Date createDate;
   Exam[] exams;
}
