package egovframework.example.bbs.service;

import java.sql.Timestamp;

/**
 * @author hpnote
 *
 */
public class BBSDto {
	
	int num;
	int su1;
	int su2;
	int su3;
	int su4;
	int su5;
	int su6;
	int su7;
	String update_d;
	
	/**
	 * 
	 */
	public BBSDto() {
		
	}
	
	
	public BBSDto(int num, int su1, int su2, int su3, int su4, int su5, int su6, int su7, String update_d) {
		this.num=num;
		this.su1=su1;
		this.su2=su2;
		this.su3=su3;
		this.su4=su4;
		this.su5=su5;
		this.su6=su6;
		this.su7=su7;
		this.update_d=update_d;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getSu1() {
		return su1;
	}


	public void setSu1(int su1) {
		this.su1 = su1;
	}


	public int getSu2() {
		return su2;
	}


	public void setSu2(int su2) {
		this.su2 = su2;
	}


	public int getSu3() {
		return su3;
	}


	public void setSu3(int su3) {
		this.su3 = su3;
	}


	public int getSu4() {
		return su4;
	}


	public void setSu4(int su4) {
		this.su4 = su4;
	}


	public int getSu5() {
		return su5;
	}


	public void setSu5(int su5) {
		this.su5 = su5;
	}


	public int getSu6() {
		return su6;
	}


	public void setSu6(int su6) {
		this.su6 = su6;
	}


	public int getSu7() {
		return su7;
	}


	public void setSu7(int su7) {
		this.su7 = su7;
	}


	public String getUpdate_d() {
		return update_d;
	}


	public void setUpdate_d(String update_d) {
		this.update_d = update_d;
	}
	
	

}
