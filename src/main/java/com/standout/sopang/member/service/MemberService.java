package com.standout.sopang.member.service;

import java.util.Map;

import com.standout.sopang.member.dto.MemberDTO;
import com.standout.sopang.member.vo.MemberVO;

public interface MemberService {
	//�α���
	public MemberDTO login(Map  loginMap) throws Exception;

	//ȸ������
	public void addMember(MemberDTO memberDTO) throws Exception;

	//���̵� �ߺ�Ȯ��
	public String overlapped(String id) throws Exception;
}