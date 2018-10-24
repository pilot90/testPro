package kr.co.lsh.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.lsh.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "ko.co.lsh.mappers.MemberMapper";

	@Override
	public List<MemberVO> getMemberList() throws Exception {
		return sqlSession.selectList(namespace + ".getMemberList");
	}

	@Override
	public void insertMember(MemberVO vo) throws Exception {
		sqlSession.insert(namespace + ".insertMember", vo);
	}

	@Override
	public MemberVO getMember(String userid) throws Exception {
		return sqlSession.selectOne(namespace + ".getMember", userid);
	}
	
}
