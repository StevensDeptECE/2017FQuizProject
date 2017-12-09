package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello {
	
	@RequestMapping(path="/hello")
	public @ResponseBody String hello () {
		return "Hello! ";
	}
	
	@RequestMapping(path="/quiz")
	public String quiz (Model model) {
		List<Question> qs = new ArrayList<>();
		
		Question q1 = new Question();
		q1.id = "Fruit1";
		q1.type = "radio";
		q1.question = "2 + 2 = ?";
		q1.Point = 10;
		q1.correctAnswer = new ArrayList<String>();
		q1.correctAnswer.add("4");
		q1.wrongAnswer = new ArrayList<String>();
		q1.wrongAnswer.add("3");
		q1.wrongAnswer.add("5");
		q1.wrongAnswer.add("6");
		qs.add(q1);
		
		Question q2 = new Question();
		q2.id = "Fruit2";
		q2.type = "checkbox";
		q2.question = "2 + 5 = ?";
		q2.Point = 5;
		q2.correctAnswer = new ArrayList<String>();
		q2.correctAnswer.add("7");
		q2.correctAnswer.add("seven");
		q2.wrongAnswer = new ArrayList<String>();
		q2.wrongAnswer.add("6");
		q2.wrongAnswer.add("8");
		qs.add(q2);
        
		model.addAttribute("questions", qs);
		return "quiz";
	}
	
	class Question {
		public String id;
		public String type;
		public String question;
		public List<String> correctAnswer;
		public List<String> wrongAnswer;
		public Integer Point;
	}
}
