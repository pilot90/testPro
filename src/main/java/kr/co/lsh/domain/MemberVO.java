package kr.co.lsh.domain;

import lombok.Data;

@Data
public class MemberVO {
	private String userid;
	private String name;
	private String pwd;
	private String email;
	private String phone;
	private String admin;
}
