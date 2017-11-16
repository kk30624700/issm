package com.m24.demo.entity;

import java.io.Serializable;
/*import java.util.List;*/

public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	private long studentId;

    private String studentName;
    
/*    private List<Appointment> appointments;*/
    
	public long getStudentId() {
		return studentId;
	}


	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


/*	public List<Appointment> getAppointments() {
		return appointments;
	}


	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}*/

	@Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName/* + ", bookNumber=" + appointments.size()*/ + "]";
    }

}
