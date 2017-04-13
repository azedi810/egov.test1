/*
 * Copyright 2008-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package egovframework.example.bbs.web;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.bbs.service.BBSCommand;
import egovframework.example.bbs.service.BList;
import egovframework.example.sample.service.impl.EgovSampleServiceImpl;


/**
 * @Class Name : EgovSampleController.java
 * @Description : EgovSample Controller Class
 * @Modification Information
 * @
 * @  수정일      수정자              수정내용
 * @ ---------   ---------   -------------------------------
 * @ 2009.03.16           최초생성
 *
 * @author 개발프레임웍크 실행환경 개발팀
 * @since 2009. 03.16
 * @version 1.0
 * @see
 *
 *  10.	MVC 게시판 
 *  실습문서명 : 20.01.spring_기초.docx
 */

@Controller
public class EgovBBSController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EgovBBSController.class);
	
	BBSCommand  command;
	
	/*
	 * http://localhost:8080/sample/bbs/list.do
	 * */
	@RequestMapping(value = "/bbs/list.do")
	public String list(Model model) {
		
		LOGGER.debug("EgovBBSController 게시판리스트 --> ");
		
		command=new BList();
		command.excute(model);
		
		return "bbs/list";
		
	}

}
