package edu.stevens.ee552.quiz;
public class Question {

    private int numOptions;
    private enum problemType {MULTIPLE_CHOICE, FILL_IN_BLANK, PATTERN, MATCHING, CHECKBOX};
    private problemType p;
    private String question;
    private String answer;
    private String wrongAnswer;
    private String[] answerList;
    private String[] wrongAnswerList;
    private int grade;

    public Question() {}

    public int getNumOptions() {return numOptions;}
    public void setNumOptions(int i) {numOptions = i;}

    public problemType getProblemType() {return p;}
    public void setProblemType(problemType t) {p = t;}

    public String getQuestion() {return question;}
    public void setQuestion(String q) {question = q;}

    public String getAnswer() {return answer;}
    public void setAnswer(String a) {answer  = a;}

    public String getWrongAnswer() {return wrongAnswer;}
    public void setWrongAnswer(String w) {wrongAnswer = w;}

    public String[] getAnswerList() {
        return answerList;
    }

    public void setAnswerList(String[] answerList) {
        this.answerList = answerList;
    }

    public String[] getWrongAnswerList() {
        return wrongAnswerList;
    }

    public void setWrongAnswerList(String[] wrongAnswerList) {
        this.wrongAnswerList = wrongAnswerList;
    }

    //need override
    public int getGrade() {return grade;}
    public void setGrade(int g) {grade = g;}


}