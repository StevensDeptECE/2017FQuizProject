package edu.stevens.ee552.quiz;

import java.util.ArrayList;


public class MatchingQuestion extends Question {

    public MatchingQuestion() {
        super();
        this.setProblemType(problemType.MATCHING);
    }

    @Override
    public int getGrade(ArrayList<IntegerPair>) {

    }

    class IntegerPair {
        int optionA;
        int optionB;

        public IntegerPair(int optionA, int optionB) {
            this.optionA = optionA;
            this.optionB = optionB;
        }
    }
}
