package com.education.entity;
//持久化教师对象
public class Teacher {
	 private int  id;  //账号
	    private int login_id;  //登陆id
	    private String  question;  //密保
	    private String  answer;   //答案
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getLogin_id() {
			return login_id;
		}
		public void setLogin_id(int login_id) {
			this.login_id = login_id;
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
		@Override
		public String toString() {
			return "["+"账号"+this.getId()+","+"密保"+this.getQuestion()+","+"答案"+
		this.getQuestion()+","+"loginid"+this.getLogin_id()+"]";
		}
}
