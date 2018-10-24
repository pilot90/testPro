package kr.co.lsh.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.lsh.domain.MemberVO;
import kr.co.lsh.persistence.MemberDAO;

@Service
public class MemverServiceImpl implements MemberService {
	
	@Inject
	MemberDAO dao;

	@Override
	public List<MemberVO> getMemberList() throws Exception {
		return dao.getMemberList();
	}

	@Override
	public void insertMember(MemberVO vo) throws Exception {
		dao.insertMember(vo);
	}

	@Override
	public MemberVO getMember(String userid) throws Exception {
		return dao.getMember(userid);
	}

}
