package com.app.dto;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class StudentAttandanceDto {
	
	private int adminId;
	private int studentId;
	private String name;
	private String classes;
	private LocalDate date;
	private String status;
	private String session;
	
	public StudentAttandanceDto() {
		
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public StudentAttandanceDto(int adminId, int studentId, String name, String classes, LocalDate date, String status,
			String session) {
		super();
		this.adminId = adminId;
		this.studentId = studentId;
		this.name = name;
		this.classes = classes;
		this.date = date;
		this.status = status;
		this.session = session;
	}

	@Override
	public String toString() {
		return "StudentAttandanceDto [adminId=" + adminId + 
				", studentId=" + studentId + 
				", name=" + name + 
				", classes="+ classes + 
				", date=" + date +
				", status=" + status +
				", session=" + session + 
				"]";
	}

}
