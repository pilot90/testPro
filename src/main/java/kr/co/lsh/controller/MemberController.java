package kr.co.lsh.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.lsh.domain.MemberVO;
import kr.co.lsh.service.MemberService;

@Controller
public class MemberController {
	@Inject
	MemberService service;
	
	@RequestMapping(value = "/memberList", method = RequestMethod.GET)
	public void memberList(Model model) throws Exception {
		List<MemberVO> memberList = service.getMemberList();
		
		model.addAttribute("memberList", memberList);
	}
}
