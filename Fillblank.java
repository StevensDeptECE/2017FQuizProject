 package edu.stevens.ee552.quiz;


	public class fillBlank  extends Question{

		
	    public static String typeOfQuestion ;
	    private String question1;
	    private String correctAnswer;
	    
	    public fillBlank(String question, String correctAnswer) {
	    	 this.setProblemType(p.FILL_IN_BLANK);
	         setQuestion(question);
	         setAnswer(correctAnswer);
	        // TODO Auto-generated constructor stub
	    }
        public String getLagalQuestion(){
        	question1=getQuestion().replaceAll("^[a-zA-Z0-9]", "");
        	return question1;
        }
	    public boolean isCorrectAnswer(String answer) {
	        if (answer.equals(getLagalQuestion())) {
	            return true;
	        }
	        return false;
	    }

	    public String getCorrectAnswer() {
	        // TODO Auto-generated method stub
	        return correctAnswer;
	    }
	    public int getGrade(){
	    	if(isCorrectAnswer(getAnswer())) return 2;
			return 0;
	    	
	    }

	}
