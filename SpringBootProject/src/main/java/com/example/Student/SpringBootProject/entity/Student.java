package com.example.Student.SpringBootProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private int StuId;
	private String StuName;
	private String StuDept;
	private float Stupercent;
	
	
	public Student() {
	
	}
	public Student(int stuId, String stuName, String stuDept, float stupercent) {
		super();
		StuId = stuId;
		StuName = stuName;
		StuDept = stuDept;
		Stupercent = stupercent;
	}
	public int getStuId() {
		return StuId;
	}
	public void setStuId(int stuId) {
		StuId = stuId;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public String getStuDept() {
		return StuDept;
	}
	public void setStuDept(String stuDept) {
		StuDept = stuDept;
	}
	public float getStupercent() {
		return Stupercent;
	}
	public void setStupercent(float stupercent) {
		Stupercent = stupercent;
	}
	@Override
	public String toString() {
		return "Student [StuId=" + StuId + ", StuName=" + StuName + ", StuDept=" + StuDept + ", Stupercent="
				+ Stupercent + "]";
	}
	
	
}
