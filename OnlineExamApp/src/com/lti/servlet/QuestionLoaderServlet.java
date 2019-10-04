package com.lti.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.model.Option;
import com.lti.model.Question;
import com.lti.model.QuestionBankLoader;

/**
 * Servlet implementation class QuestionLoaderServlet
 */
@WebServlet("/QuestionLoaderServlet")
public class QuestionLoaderServlet extends HttpServlet {
	
	private List<Question> questions;
	private int noOfQuestions;
	
	@Override
	public void init() throws ServletException {
	
		questions=QuestionBankLoader.loadQusetionOnJava();
		noOfQuestions=questions.size();
		
	}

 //doGet method is used to query or get information from server
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session=request.getSession();
		Integer questionNo=(Integer) session.getAttribute("qNo");
		
		if(questionNo==null)//first time user no session
			questionNo=0;//first question
		else
			questionNo++;//next question
		session.setAttribute("qNo", questionNo);
		
		Question q=questions.get(questionNo++);//getting a question from questions LIST 
		//where is the user at current moment is given by session 'which user' on qth question
		PrintWriter out=response.getWriter();
			if(questionNo<noOfQuestions) {
			
				session.setAttribute("currentQs",q);
				response.setContentType("text/html");

				out.print("<form action='CalculateScoreServlet'>");
				
				out.print("<h3>"+questionNo+". "+q.getQuestion()+"</h3>");
				int optionNo=0;
				for(Option o:q.getOptions()) {
					out.print("<h4><input type='radio'name='op' value='"+(optionNo++)+"'>"+o.getOption()+"</h4>");
					}	
				String btnLabel="Continue";
				if(questionNo==noOfQuestions-1)
					btnLabel="Finish";
				out.print("<button type='submit'>"+btnLabel+"</button>");
				out.print("</form>");	
			}
			else {
				
				RequestDispatcher rd=request.getRequestDispatcher("DisplayScoreServlet");
				rd.forward(request, response);
			}
				
			
			
		}
			
			
	}



