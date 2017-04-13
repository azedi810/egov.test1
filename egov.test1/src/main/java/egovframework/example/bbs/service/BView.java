package egovframework.example.bbs.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class BView implements BBSCommand {


/**
 * @Description : 게시판 보기
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2017.03.13    지홍구       게시판 view
 * @author 개발프레임웍크 실행환경 개발팀
 * @since  2017.03.13
 * @version 1.0
 * @see
 *  10.	MVC 게시판 
 *  실습문서명 : 20.01.spring_기초.docx
 */
	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bid=request.getParameter("bid");
		
//		BDao dao  = new BDao();
//		BDto dto = dao.contentView(bid);
//		model.addAttribute("content_view", dto);
	}

}
