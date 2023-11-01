package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "exam")
@NoArgsConstructor
@Data
public class Exam{

	
    @Id
    @NotEmpty(message ="Class can't be blank")
	@Length(min = 1,max=15,message = "Invalid Class length!!!!")
	@Column(length = 15)
	private String examid;
    private int max_mark;
    
	public Exam() {

	}

	public Exam(
			@NotEmpty(message = "Class can't be blank") @Length(min = 1, max = 15, message = "Invalid Class length!!!!") String examid,
			int max_mark) {
		super();
		this.examid = examid;
		this.max_mark = max_mark;
	}

	public String getExamid() {
		return examid;
	}

	public void setExamid(String examid) {
		this.examid = examid;
	}

	public int getMax_mark() {
		return max_mark;
	}

	public void setMax_mark(int max_mark) {
		this.max_mark = max_mark;
	}

	@Override
	public String toString() {
		return "Exam [examid=" + examid + 
				", max_mark=" + max_mark + 
				"]";
	} 	
}
