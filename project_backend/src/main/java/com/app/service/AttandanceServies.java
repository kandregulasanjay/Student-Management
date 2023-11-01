package com.app.service;

import java.time.LocalDate;
import java.util.List;

import com.app.pojos.Attandance;

public interface AttandanceServies {

	List<Attandance> getAllAttandance();
	Attandance addorUpdateAttandanceDetails( Attandance attandance);
	String deleteAttandanceDetails(int rid);
	String deleteAttandanceDetail(int sid);
	List<Attandance> findAttandanceById(int stuid,LocalDate datefrom,LocalDate dateto);
	//List<StudentAttandanceDto> findAttandanceByDate(LocalDate date);
	List<Integer>AttandanceCount(int sid);
	Object findAttandanceByDate(LocalDate date);
}
