package com.prathamesh.hibernate.hibernateinheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TablePerClass {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
Parent p1 = new Parent (101,"a","b");
Child1 c1 = new Child1 (102, "c","d","e","f");
Child2 c2 = new Child2 (103, "g","h","i","j");
SessionFactory sf = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
Session s1 = sf.openSession();
Transaction tr = s1.beginTransaction();
s1.save(c1);
s1.flush();
tr.commit();
s1.close();
	}*/
}

/*@Entity
@Table
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)  
@DiscriminatorColumn  
@DiscriminatorValue(value = "Parent")
class Parent{
	@Id
	private int pId;
	private String pNm;
	private String pPr;
	@Override
	public String toString() {
		return "Parent [pId=" + pId + ", pNm=" + pNm + ", pPr=" + pPr + "]";
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpNm() {
		return pNm;
	}
	public void setpNm(String pNm) {
		this.pNm = pNm;
	}
	public String getpPr() {
		return pPr;
	}
	public void setpPr(String pPr) {
		this.pPr = pPr;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Parent(int pId, String pNm, String pPr) {
		super();
		this.pId = pId;
		this.pNm = pNm;
		this.pPr = pPr;
	}
	
}

@Entity
class Child1 extends Parent{
	
	
	private String c1Var1;
	private String c1Var2;
	@Override
	public String toString() {
		return "Child1 [c1Var1=" + c1Var1 + ", c1Var2=" + c1Var2 + "]";
	}
	public String getC1Var1() {
		return c1Var1;
	}
	public void setC1Var1(String c1Var1) {
		this.c1Var1 = c1Var1;
	}
	public String getC1Var2() {
		return c1Var2;
	}
	public void setC1Var2(String c1Var2) {
		this.c1Var2 = c1Var2;
	}
	public Child1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child1(int pId, String pNm, String pPr, String c1Var1, String c1Var2) {
		super(pId, pNm, pPr);
		this.c1Var1 = c1Var1;
		this.c1Var2 = c1Var2;
	}

}

@Entity
class Child2 extends Parent{
	private String c2Var1;
	private String c2Var2;
	@Override
	public String toString() {
		return "Child2 [c2Var1=" + c2Var1 + ", c2Var2=" + c2Var2 + "]";
	}
	public String getC2Var1() {
		return c2Var1;
	}
	public void setC2Var1(String c2Var1) {
		this.c2Var1 = c2Var1;
	}
	public String getC2Var2() {
		return c2Var2;
	}
	public void setC2Var2(String c2Var2) {
		this.c2Var2 = c2Var2;
	}
	public Child2(int pId, String pNm, String pPr, String c2Var1, String c2Var2) {
		super(pId, pNm, pPr);
		this.c2Var1 = c2Var1;
		this.c2Var2 = c2Var2;
	}
	public Child2() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}*/
