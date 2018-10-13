package com.capgemini.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.demo.bean.Question;
import com.capgemini.demo.bean.User;
import com.capgemini.demo.mapper.UserMapper;
import com.capgemini.demo.service.AnswerService;
import com.capgemini.demo.service.AnswerServiceImpl;
import com.capgemini.demo.service.PaperService;
import com.capgemini.demo.service.PaperServiceImpl;
import com.capgemini.demo.service.QuestionService;
import com.capgemini.demo.service.QuestionServiceImpl;
import com.capgemini.demo.service.UserService;
import com.capgemini.demo.service.UserServiceImpl;
import com.mysql.fabric.xmlrpc.base.Array;



@Controller
public class LoginController {
	String thisname;
	
	List<Question> thisquestionlist=new ArrayList<Question>();
	
	@Autowired
	private UserService userService=new UserServiceImpl();
	@Autowired
	private QuestionService questionService=new QuestionServiceImpl();
    @Autowired
    private AnswerService answerService=new AnswerServiceImpl();
    @Autowired
    private PaperService paperService=new PaperServiceImpl();
    @Autowired
    UserMapper userMapper; 
    
	
	@RequestMapping(value="login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="confirmidentity")
	public ModelAndView checkIdentity(HttpServletRequest request,HttpServletResponse response){
		String identity=request.getParameter("identity");
		thisname=identity;
		if(userService.checkIdentity(identity)){
			ModelAndView mv=new ModelAndView();
			Random r=new Random();
			List<Question> list=new ArrayList<Question>();
			boolean[] bool=new boolean[20];//7g 0-6
			int questionid;
			for(int i=0;i<10;i++){
				do{
					questionid=r.nextInt(12)+1;//随机取[0,7)=[0,6]
					
				}while(bool[questionid]);
				bool[questionid]=true;
				list.add(questionService.addQuestion(questionid)); 
				
			}
			System.out.println(list);
			thisquestionlist.addAll(list);
			
			mv.addObject("questions", list);
			mv.setViewName("index");
			userService.addUser(identity);
			return mv;
		}else{
			return new ModelAndView("erroridentity");
		}
		
		
	}
	
	
	@RequestMapping(value="FinshExam")
	public ModelAndView ShowExamGrade(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		ArrayList<Object> answerid=new ArrayList<Object>();
		int grade=0;//定义成绩
		int checkedanswerid;
		String radio;
		System.out.println(thisquestionlist.get(0).getQuestion());
		String radioname=String.valueOf(thisquestionlist.get(0).getId());
		System.out.println(request.getParameter(radioname));//取到选中
		for(int i=0;i<10;i++){
			radio=String.valueOf(thisquestionlist.get(i).getId());
			checkedanswerid=Integer.valueOf(request.getParameter(radio));
			answerid.add(checkedanswerid);
			if(answerService.checkAnswer(checkedanswerid)){
				grade=grade+10;
			}
			
		}
		  int userid=userService.FindUserId(thisname).getId();
		  System.out.println(thisname);
		   paperService.addPaper(grade,userid);
		   paperService.addPaperQuestion(thisquestionlist);
		   paperService.addUserAnswer(thisquestionlist,answerid,userid);
		    mv.addObject("grade", grade);
		    mv.setViewName("examgrade");
		
		   return mv;
	}
	
	@RequestMapping(value="show")
	public ModelAndView show(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv=new ModelAndView();
		List<User> list=userMapper.FindAllUser();
		mv.addObject("users", list);
		mv.setViewName("show");
		
		return mv;
	}
}
