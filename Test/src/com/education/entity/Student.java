package com.education.entity;
//持久化学生对象
public class Student {
  private int stu_id;
  private String question;
  private String answer;
  private int login_id;


public int getStu_id() {
	return stu_id;
}
public void setStu_id(int stu_id) {
	this.stu_id = stu_id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public int getLogin_id() {
	return login_id;
}
public void setLogin_id(int login_id) {
	this.login_id = login_id;
}
@Override
	public String toString() {
		return "["+this.getStu_id()+","+this.getAnswer()+","+this.getLogin_id()+","+this.getQuestion()+"]";
	}
  
}
