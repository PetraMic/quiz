package quiz;

import lombok.Getter;

@Getter
public class Answer {
    private String answerText;
    private boolean isCorrect;

    public Answer(String answerText, boolean isCorrect) {
        this.answerText = answerText;
        this.isCorrect = isCorrect;
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}
