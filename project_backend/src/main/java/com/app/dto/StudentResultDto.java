package com.app.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class StudentResultDto {
	
	private int rid;
	private int sid;
	private String examid;
	private String classes;
	private String subject;
	private int marks;
	private int max_mark;
	private String status;
	private String session;
	
	public StudentResultDto() {
		
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getExamid() {
		return examid;
	}

	public void setExamid(String examid) {
		this.examid = examid;
	}

	public String getClasses() {
		return classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getMax_mark() {
		return max_mark;
	}

	public void setMax_mark(int max_mark) {
		this.max_mark = max_mark;
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

	public StudentResultDto(int rid, int sid, String examid, String classes, String subject, int marks, int max_mark,
			String status, String session) {
		super();
		this.rid = rid;
		this.sid = sid;
		this.examid = examid;
		this.classes = classes;
		this.subject = subject;
		this.marks = marks;
		this.max_mark = max_mark;
		this.status = status;
		this.session = session;
	}

	@Override
	public String toString() {
		return "StudentResultDto [rid=" + rid + ", sid=" + sid + ", examid=" + examid + ", classes=" + classes
				+ ", subject=" + subject + ", marks=" + marks + ", max_mark=" + max_mark + ", status=" + status
				+ ", session=" + session + "]";
	}
	
}
