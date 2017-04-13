package egovframework.example.bbs.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

public class BList implements BBSCommand {

	@Override
	public void excute(Model model) {
		// TODO Auto-generated method stub
		BBSDao dao = new BBSDao();
		ArrayList<BBSDto> bdto=dao.list();
		
		model.addAttribute("list", bdto);

	}

}
