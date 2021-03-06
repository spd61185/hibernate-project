
package com.satish.hibernate;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "lab4")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sid")
	private int sid;
	@Column(name = "sname")
	private String sname;
	@Column(name = "dob")
	private String dob;
	@Column(name = "quali")
	private String qualification;
	
	@JoinTable(name = "courses", joinColumns = @JoinColumn(name="sid"))
	@IndexColumn(name = "idx")
	@Column(name = "cname")
	private String[] courses;
	
	@JoinTable(name = "email", joinColumns = @JoinColumn(name="sid"))
	@IndexColumn(name = "idx")
	@Column(name = "emailId")
	private List<String>emails;
	
	@JoinTable(name = "marks", joinColumns = @JoinColumn(name="sid"))
	@IndexColumn(name = "idx")
	@Column(name = "marks")
	private List<Integer>marks;
	
	@JoinTable(name = "phones", joinColumns = @JoinColumn(name="sid"))
	@IndexColumn(name = "idx")
	@Column(name = "phoneNo")
	private Set<Long>phones;
	
	@JoinTable(name = "refs", joinColumns = @JoinColumn(name="sid"))
	@IndexColumn(name = "idx")
	@Column(name = "phone")
	private Map<String, Long>refes;
	
	public Student() {}

	public Student(String sname, String dob, String qualification, String[] courses, List<String> emails,
			List<Integer> marks, Set<Long> phones, Map<String, Long> refes) {
		super();
		this.sname = sname;
		this.dob = dob;
		this.qualification = qualification;
		this.courses = courses;
		this.emails = emails;
		this.marks = marks;
		this.phones = phones;
		this.refes = refes;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public List<String> getEmails() {
		return emails;
	}

	public void setEmails(List<String> emails) {
		this.emails = emails;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<Long> getPhones() {
		return phones;
	}

	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}

	public Map<String, Long> getRefes() {
		return refes;
	}

	public void setRefes(Map<String, Long> refes) {
		this.refes = refes;
	}
	
	

}


