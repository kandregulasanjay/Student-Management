package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "result")
@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(ResultBaseEntity.class)

public class Result  {
	@Min(value = 1, message="salary < min salary")
	@Column(unique=true)
	private Integer rid;
	@Id
	private Integer sid;
    @NotEmpty(message ="Class can't be blank")
	@Length(min = 1,max=5,message = "Invalid Class length!!!!")
	@Column(length = 5)
	private String classes;
	@Id
	@NotEmpty(message ="Class can't be blank")
	@Length(min = 1,max=15,message = "Invalid Class length!!!!")
	@Column(length = 15)
	private String examid;
	@Id
	@NotEmpty(message ="Class can't be blank")
	@Length(min = 1,max=15,message = "Invalid Class length!!!!")
	@Column(length = 15)
	private String subject;
	private Integer marks;
	@Id
	@NotEmpty(message ="Class can't be blank")
	@Length(min = 1,max=10,message = "Invalid Class length!!!!")
	@Column(length = 10)
    private String	session;
	private String	status;
	//@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="student_sid")
	//private Student student;
	
	public Result() {
		
	}
	
	public Result(@Min(value = 1, message = "salary < min salary") Integer rid, Integer sid,
			@NotEmpty(message = "Class can't be blank") @Length(min = 1, max = 5, message = "Invalid Class length!!!!") String classes,
			@NotEmpty(message = "Class can't be blank") @Length(min = 1, max = 15, message = "Invalid Class length!!!!") String examid,
			@NotEmpty(message = "Class can't be blank") @Length(min = 1, max = 15, message = "Invalid Class length!!!!") String subject,
			Integer marks,
			@NotEmpty(message = "Class can't be blank") @Length(min = 1, max = 10, message = "Invalid Class length!!!!") String session,
			String status) {
		super();
		this.rid = rid;
		this.sid = sid;
		this.classes = classes;
		this.examid = examid;
		this.subject = subject;
		this.marks = marks;
		this.session = session;
		this.status = status;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getExamid() {
		return examid;
	}
	public void setExamid(String examid) {
		this.examid = examid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Result [rid=" + rid + 
				", sid=" + sid + 
				", classes=" + classes +
				", examid=" + examid + 
				", subject="+ subject + 
				", marks=" + marks + 
				", session=" + session + 
				", status=" + status + 
				"]";
	}
	
}
