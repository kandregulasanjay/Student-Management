package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import org.hibernate.validator.constraints.Length;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "attandance")
@NoArgsConstructor
@Data
@IdClass(AttandanceBaseEntity.class)
public class Attandance{

	@Min(value = 0, message="min value should be 1")
    @Column(unique=true)
	private int aid;
	
    @Id
	private int sid;
	private LocalDate date;
	
	@Length(min = 1,max=1,message = "Invalid  Status length!!!!")
	@Column(length=1)
	private String status;
	
	@Length(min = 1,max=15,message = "Invalid  session length!!!!")
	@Column(length=15)
	private String session;
	
	public Attandance() {
		
	}

	public Attandance(@Min(value = 0, message = "min value should be 1") int aid, int sid, LocalDate date,
			@Length(min = 1, max = 1, message = "Invalid  Status length!!!!") String status,
			@Length(min = 1, max = 15, message = "Invalid  session length!!!!") String session) {
		super();
		this.aid = aid;
		this.sid = sid;
		this.date = date;
		this.status = status;
		this.session = session;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
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

	@Override
	public String toString() {
		return "Attandance [aid=" + aid + 
				", sid=" + sid +
				", date=" + date +
				", status=" + status +
				", session="+ session +
				"]";
	}	
	
}
