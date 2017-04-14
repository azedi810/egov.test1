package example.lecture2;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextArea;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialogExam extends JFrame
{
	// 필요한 필드 선언
	JFrame jFrame = new JFrame("J다이얼로그 예제");
	JDialog jDialog = new JDialog(jFrame, "JDialog 타이틀");
	JButton jButton = new JButton("Click");

	// GUI 구현 생성자
	public JDialogExam()
	{
		// 다이얼로그에 버튼 추가
		jDialog.add(jButton, "South");

		// 기본 프레임 크기와 보기 설정
		jFrame.setSize(200, 200);
		jFrame.setVisible(true);
		//X버튼 누르면 프로그램 종료
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 다이얼로그의 크기와 보기 설정
		jDialog.setSize(100, 100);
		jDialog.setVisible(true);
		//★X버튼 누르면 다이얼로그만 종료
		jDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}

	public static void main(String[] args)
	{
		//실행
		new JDialogExam();
		
		JDialogExam je = new JDialogExam();
		je.FileDialogExam();
		je.ListExam();
	}
	public void FileDialogExam()
	{
		FileDialog load = new FileDialog(this, "열기모드");
		FileDialog save = new FileDialog(this, "저장모드", FileDialog.SAVE);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		load.setVisible(true); // 파일 불러오기 창 열기
		System.out.println("선택폴더 : " + load.getDirectory());
		System.out.println("선택파일 : " + load.getFile());
		save.setVisible(true); // 파일 저장하기 창 열기
	}
	
	

		public void ListExam()
		{

			String ch_item[] =
				{ "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };

				// List list = new List(3);//3행으로 보여짐(단일선택)
				List list = new List(4, true);// 4행으로 보여지고 멀티선택가능

				TextArea text = new TextArea(5, 20);// 5행 10열
				
//			super("JComboBoxExam 입니다.");
			// 레이아웃 변경
			setLayout(new FlowLayout());

			// List에 항목 추가
			for (String str : ch_item)
				list.add(str);

			// 추가
			super.add(list);
			super.add(text);

			// 크기
			setSize(400, 300);
			// 보여줘
			setVisible(true);
			// x클릭
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}
