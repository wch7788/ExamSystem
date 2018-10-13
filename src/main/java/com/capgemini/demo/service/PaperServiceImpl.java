package com.capgemini.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.demo.bean.Paper;
import com.capgemini.demo.bean.Question;
import com.capgemini.demo.mapper.AnswerMapper;
import com.capgemini.demo.mapper.PaperMapper;
import com.capgemini.demo.mapper.UserMapper;

@Repository("PaperService")
public class PaperServiceImpl implements PaperService{
	int thispaperid;
	
	@Autowired
	private PaperMapper paperMapper;
	@Autowired 
	private UserMapper userMapper;
    @Autowired
    private AnswerMapper answerMapper;
	
	@Override
	public void addPaper(int grade, int userid) {
       
        int paperid=paperMapper.CountPaper()+1;
        thispaperid=paperid;
        Paper paper=new Paper(paperid,userid,grade);
        paperMapper.addPaper(paper);
        
        
		
	}

	@Override
	public void addPaperQuestion(List<Question> thisquestionlist) {
             
             for(int i=0;i<10;i++){
            	 int paperquestionid= paperMapper.CountPaperQuestion()+1;
            	 paperMapper.addPaperQuestion(paperquestionid,thispaperid,thisquestionlist.get(i).getId());
            	 
             }
		
	}

	@Override
	public void addUserAnswer(List<Question> thisquestionlist, ArrayList<Object> answerid, int userid) {
            
		for(int i=0;i<10;i++){
			int useranswerid=paperMapper.CountUserAnswer()+1;
			int selectanswerid=(int) answerid.get(i);
			int  questionid=answerMapper.FindAnswerByAnswerId(selectanswerid).getQuestionid();
		    userMapper.addUserAnswer(useranswerid,userid,selectanswerid,questionid);
	}


	}
	
	

}
