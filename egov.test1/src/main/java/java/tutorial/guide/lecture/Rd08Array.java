package java.tutorial.guide.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
객체 추가
		boolean add(E e) 주어진 객체를 맨 끝에 추가
		void add(int index, E element) 주어진 인덱스에 객체를 추가
		set(int index, E element) 주어진 인덱스에 저장된 객체를 주어진 객체로 바꿈
객체 검색
		boolean contains(Object o) 주어진 객체가 저장되어 있는지 여부
		E get(int index) 주어진 인덱스에 저장된 객체를 리턴
		isEmpty() 컬렉션이 비어 있는지 조사
		int size() 저장되어있는 전체 객체 수를 리턴
객체 삭제
		void clear() 저장된 모든 객체를 삭제
		E remove(int index) 주어진 인덱스에 저장된 객체를 삭제
		boolean remove(Ojbect o) 주어진 객체를 삭제
*/
public class Rd08Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rd08Array ra = new Rd08Array();
		ra.sample2();
	}
	
	
	public void sample1() {
//		* 배열에 String만 들어있을 경우, 배열을 String[]로 형변환
		ArrayList<String> arrlstWorksheetNo = new ArrayList();
		String[] result = (String[])arrlstWorksheetNo.toArray(new String[arrlstWorksheetNo.size()]);
		
//		* 그럼 반대의 경우! [java] String 배열을 List에 넣기 스트링 배열을 리스트에 담는다.
		String[] strs = {"1", "2", "3"};
		java.util.List<String> list = new ArrayList<String>(Arrays.asList(strs));
	}
	
	public void sample2() {
		List<String> list1 = Arrays.asList("네이버", "블로그", "부르곰");
		  for(String name: list1) {
			  System.out.println(name);
		  }
		  
		  List<Integer> list2 = Arrays.asList(1, 2, 3);
		  for(int value : list2) {
			  System.out.println(value);
		  }
	}
}
