package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student extends StudentBaseEntity {
	@NotEmpty(message ="Class can't be blank")
	@Length(min = 1,max=5,message = "Invalid Class length!!!!")
	@Column(length = 5)
	private String classes;
	@NotEmpty(message ="Name can't be blank")
	@Length(min = 3,max=45,message = "Invalid Name length!!!!")
	@Column(length = 45)
	private String name;
	@NotNull(message ="Admission date can't be blank")
	private LocalDate addmissiondate;
	@Column(length = 45)
	@NotEmpty(message ="Father Name can't be blank")
	@Length(min = 3,max=45,message = "Invalid Father Name length!!!!")	
	private String father_name;
	@Column(length =6)
	@NotEmpty(message ="Gender can't be blank")
	@Length(min =4 ,max=6,message = "Invalid gender length!!!!")	
	private String gender;
	@NotNull(message ="DOB can't be blank")
    private LocalDate dob;
	@Column(length =30)
	@Length(min =10 ,max=30,message = "Invalid Email length!!!!")	
	private String emailid;
	@Column(length =20)
	@NotEmpty(message = "Mobile no must be supplied")
	@Length(min =10 ,max=20,message = "Invalid mobile length!!!!")	
	private String mobile_no;
	@Column(length = 45)
	@NotEmpty(message="address must be supplied")
	private String address;
	@NotNull(message = "pincode must be supplied")
	private int pincode;
	@Column(length=10)
	@NotEmpty(message="student status must be supplied")
	@Length(min = 6,max=10,message = "Invalid  Status length!!!!")
	private String status;
	@Column(length=30)
	@NotEmpty(message="password status must be supplied")
	@Length(min = 4,max=30,message = "Invalid  password length!!!!")
	private String password;
	public Student(int sid,String classes,String name) {
		super.setSid(sid);
		this.classes = classes;
		this.name = name;
	}
	public Student(String classes) {
	this.classes = classes;
	}
	public Student(int sid,String classes,String name,LocalDate addmissiondate,String father_name,String gender,LocalDate dob,String emailid, String mobile_no,String address,int pincode,String status) {
		super.setSid(sid);
		this.classes = classes;
		this.name = name;
		this.addmissiondate=addmissiondate;
		this.father_name=father_name;
		this.gender=gender;
		this.dob=dob;
		this.mobile_no=mobile_no;
		this.emailid=emailid;
		this.status=status;
		this.address=address;
		this.pincode=pincode;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getAddmissiondate() {
		return addmissiondate;
	}
	public void setAddmissiondate(LocalDate addmissiondate) {
		this.addmissiondate = addmissiondate;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Student [classes=" + classes + ", name=" + name + ", addmissiondate=" + addmissiondate
				+ ", father_name=" + father_name + ", gender=" + gender + ", dob=" + dob + ", emailid=" + emailid
				+ ", mobile_no=" + mobile_no + ", address=" + address + ", pincode=" + pincode + ", status=" + status
				+ ", password=" + password + "]";
	}
	
}
