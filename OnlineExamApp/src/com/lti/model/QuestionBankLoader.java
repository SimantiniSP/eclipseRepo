package com.lti.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {

	public static List<Question> loadQusetionOnJava(){
		QuestionBank qb=new QuestionBank();
		Subject s1=new Subject();
		s1.setName("Java");
		qb.addNewSubject(s1);
		
		Question q=new Question();
		q.setQuestion("What is G1 in Java?");
		
		List<Option> ops=new ArrayList<Option>();
		ops.add(new Option("G1 is Collector",true));
		ops.add(new Option("G1 is another name for Jeevan",false));
		ops.add(new Option("G1 is the name of spy agency",false));
		ops.add(new Option("G1 is sequel of Ra.One",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s1,q);
		
	
		q=new Question();
		ops=new ArrayList<Option>();
		q.setQuestion("Which concept of Java is a way of converting real world objects in terms of class?");
		ops.add(new Option("Polymorphism",false));
		ops.add(new Option("Encapsulation",false));
		ops.add(new Option("Abstraction",true));
		ops.add(new Option("Inheritance",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s1,q);
		
		q=new Question();
		ops=new ArrayList<Option>();
		q.setQuestion("What is it called if an object has its own lifecycle and there is no owner?");
		ops.add(new Option("Aggregation",false));
		ops.add(new Option("Encapsulation",false));
		ops.add(new Option("Composition",false));
		ops.add(new Option("Association",true));
		q.setOptions(ops);
		
		qb.addNewQuestion(s1,q);
		
		
		q=new Question();
		ops=new ArrayList<Option>();
		q.setQuestion("How constructor can be used for a servlet?");
		ops.add(new Option("Initialization",false));
		ops.add(new Option("Constructor function",false));
		ops.add(new Option("Initialization and Constructor function",true));
		ops.add(new Option("Setup() method",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s1,q);
		
		q=new Question();
		ops=new ArrayList<Option>();
		q.setQuestion("Can servlet class declare constructor with ServletConfig object as an argument?");
		ops.add(new Option("True",false));
		ops.add(new Option("False",true));
		q.setOptions(ops);
		
		qb.addNewQuestion(s1,q);
		
		q=new Question();
		ops=new ArrayList<Option>();
		q.setQuestion("What is the difference between servlets and applets?\ni.Servlets execute on Server; Applets execute on browser\nii.Servlets have no GUI; Applet has GUI\niii. Servlets creates static web pages; Applets creates dynamic web pages\niv. Servlets have no GUI; Applet has GUI");
		ops.add(new Option("i,ii,iii are correct",false));
		ops.add(new Option("i,ii are correct",true));
		ops.add(new Option("i,iii are correct",false));
		ops.add(new Option("i,ii,iii,iv are correct",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s1,q);
		
		q=new Question();
		ops=new ArrayList<Option>();
		q.setQuestion("Which component is used to compile, debug and execute java program?");
		ops.add(new Option("JVM",false));
		ops.add(new Option("JDK",true));
		ops.add(new Option("JIT",false));
		ops.add(new Option("JRE",false));
		q.setOptions(ops);
		
		qb.addNewQuestion(s1,q);
		
		return qb.getQuestionsFor(s1);
		
	}
}
