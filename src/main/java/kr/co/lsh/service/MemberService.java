package kr.co.lsh.service;

import java.util.List;

import kr.co.lsh.domain.MemberVO;

public interface MemberService {
	
	public List<MemberVO> getMemberList() throws Exception;
	
	public void insertMember(MemberVO vo) throws Exception;
	
	public MemberVO getMember(String userid) throws Exception;
	
}
