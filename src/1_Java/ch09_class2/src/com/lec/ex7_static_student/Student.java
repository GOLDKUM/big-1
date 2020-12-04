package com.lec.ex7_static_student;

public class Student {
	private static int count = 0;
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	public Student(){}
	public Student(String name, int kor, int eng, int mat){
		no = ++count;
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
		tot = kor+eng+mat;
		avg = tot/3.0; // 반올림
	}
	public void print() {
		System.out.println(no+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg);
	}
	public String infoString() {
		return no+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+avg;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Student.count = count;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
}
