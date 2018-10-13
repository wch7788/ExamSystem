package com.capgemini.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.capgemini.demo.bean.Paper;
import com.capgemini.demo.bean.PaperQuestion;
import com.capgemini.demo.bean.Question;

@Mapper
public interface PaperMapper {

	public int CountPaper();
	public int CountPaperQuestion();
	public int CountUserAnswer();
    public void addPaper(Paper paper);
	public void addPaperQuestion(@Param("pqid")int paperquestionid, @Param("paperid")int thispaperid,@Param("questionid") int id);
	
	public Paper FindPaperByUserId(int id);
    
    public List<PaperQuestion> FindQuestionsByPaperid(int id);
}

