package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int score = 0;

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void start() {
        for (Question question : questions) {
            System.out.println(question.getQuestionText());
            for (char i = 'A'; i < 'A' + question.getAnswers().size(); i++) {
                System.out.println(i + ": " + question.getAnswers().get(i - 'A').getAnswerText());
            }
            String response;
            do {
                response = scanner.nextLine().toUpperCase();
                if (!question.isValidResponse(response)) {
                    System.out.println("Invalid response. Please enter all correct answers between A and " + (char) ('A' + question.getAnswers().size() - 1) + ".");
                }
            } while (!question.isValidResponse(response));

            if (question.isCorrectResponse(response)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong answer. The correct answers are:");
                for (char i = 'A'; i < 'A' + question.getAnswers().size(); i++) {
                    if (question.getAnswers().get(i - 'A').isCorrect()) {
                        System.out.println(i + ": " + question.getAnswers().get(i - 'A').getAnswerText());
                    }
                }
            }
        }
        System.out.println("You got " + score + " out of " + questions.size() + " questions correct.");
    }
}