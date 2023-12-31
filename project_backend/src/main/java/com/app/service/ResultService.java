package com.app.service;

import java.util.List;

import com.app.pojos.Result;

public interface ResultService {
	
	List<Result> getAllResult();
	Result addOrUpdateResultDetails(Result result);
	String deleteResultDetails(int rid);
	String deleteResultDetail(int sid);
	List<Result>findResultById(int stuid);
    //List<StudentResultDto>resultbySId(int sid);
    List<Result> findResultBySessionId(int stuid,String session);
    Result findResultByRid(int sid);
    String session(int sid);
	Object resultbySId(int stuId);
}
