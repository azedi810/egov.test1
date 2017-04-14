package game.lotto;

/* 
 * 제작자 : 자바킹 
 * 제작일 : 12.04.24 
 * 제작환경 : win7 64bit , eclipse Indigo, JDK 6.0  
 */ 
import java.util.*; 

public class ArrayListLotto extends ArrayList<String> { 
    /** 
     * 1. ArrayList를 상속받아 6개의 공간을 초기화 한다. 
     */ 
    public ArrayListLotto() { 
        super(6); 
    } 

    /** 
     * Random 수를 발생하여 ArrayListLotto; 
     */ 
    public void randomAdd() { 

        int cnt = 0; 
        while (cnt < 6) { 
            String ran = Integer.toString(((int) (Math.random() * 45 + 1))); 
            if (!contains(ran)) { 
                add(ran); // 중복이 아니면 램덤값 ArrayList추가 
                cnt++; // 중복값이 없으면 증가 
            } 
        } 
    } 

    /** 
     * ArrayList에 저장된 난수의 값들을 올림차순으로 정렬한다. 
     */ 
    public void lottoSortAsc() { 
        Collections.sort(this); // 오름차순 
    } 

    public void lottoSortDec() { 
        Collections.sort(this, Collections.reverseOrder()); // 내림차순 

    } 

    /** 
     * ArrayList 출력; 
     */ 
    public void lottoPrint() { 
        System.out.print("당첨번호는 :\t"); 
        for (String ran : /* 배열이름 */this) { 
            System.out.print(ran + "\t"); 
        } 
        System.out.println(); 
    } 
} 

