package quiz;

public class QuizMain {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        Question question1 = new Question("In the pre-Columbian period, which animal was a symbol of strength and power? Question with 1 correct answer.");
        question1.addAnswer(new Answer("Jaguar", true));
        question1.addAnswer(new Answer("Elephant", false));
        question1.addAnswer(new Answer("Lion", false));
        question1.addAnswer(new Answer("Bear", false));
        quiz.addQuestion(question1);

        Question question2 = new Question("What is the name of the largest technology company in south korea? Question with 1 correct answer.");
        question2.addAnswer(new Answer("LG Group", false));
        question2.addAnswer(new Answer("Huawei", false));
        question2.addAnswer(new Answer("Kakao", false));
        question2.addAnswer(new Answer("Samsung", true));
        quiz.addQuestion(question2);

        Question question3 = new Question("How many times a day does a person inhale on average? Question with 1 correct answer.");
        question3.addAnswer(new Answer("32 000 times", false));
        question3.addAnswer(new Answer("40 000 times", false));
        question3.addAnswer(new Answer("20 000 times", true));
        question3.addAnswer(new Answer("35 000 times", false));
        quiz.addQuestion(question3);

        Question question4 = new Question("What is Barbie's full name? Question with 1 correct answer.");
        question4.addAnswer(new Answer("Barbara Destiny Hamilton", false));
        question4.addAnswer(new Answer("Barbara Milicent Roberts", true));
        question4.addAnswer(new Answer("Barbara Claudia Appleton", false));
        question4.addAnswer(new Answer("Barbara Abigail Rutherford", false));
        quiz.addQuestion(question4);

        Question question5 = new Question("What is the longest river in the world? Question with 1 correct answer.");
        question5.addAnswer(new Answer("Amazon", false));
        question5.addAnswer(new Answer("Nile", true));
        question5.addAnswer(new Answer("Yangtze", false));
        question5.addAnswer(new Answer("Mississippi", false));
        quiz.addQuestion(question5);

        Question question6 = new Question("Which cities are located in Finland? Question with multiple correct answers.");
        question6.addAnswer(new Answer("Helsinki", true));
        question6.addAnswer(new Answer("Uppsala", false));
        question6.addAnswer(new Answer("Turku", true));
        question6.addAnswer(new Answer("Helsingborg", false));
        quiz.addQuestion(question6);

        Question question7 = new Question("Which of these famous people were blind? Question with multiple correct answer.");
        question7.addAnswer(new Answer("Ludwig van Beethoven", false));
        question7.addAnswer(new Answer("Bach", true));
        question7.addAnswer(new Answer("Ray Charles", true));
        question7.addAnswer(new Answer("Homer", true));
        quiz.addQuestion(question7);

        quiz.start();
    }
}