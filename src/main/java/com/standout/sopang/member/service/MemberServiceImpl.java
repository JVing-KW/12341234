package com.standout.sopang.member.service;

import java.util.Map;

import com.standout.sopang.member.dto.MemberDTO;
import com.standout.sopang.member.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.standout.sopang.member.vo.MemberVO;

@Service("memberService")
@Transactional(propagation=Propagation.REQUIRED)
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	//�α���
//	@Override
//	public MemberVO login(Map  loginMap) throws Exception{
//		return memberDAO.login(loginMap);
//	}
//
//	//ȸ������
//	@Override
//	public void addMember(MemberVO memberVO) throws Exception{
//		memberDAO.insertNewMember(memberVO);
//	}
//
//	//���̵� �ߺ�Ȯ��
//	@Override
//	public String overlapped(String id) throws Exception{
//		return memberDAO.selectOverlappedID(id);
//	}
	private final ModelMapper modelMapper;

	private final MemberMapper memberMapper;


	@Override
	public MemberDTO login(Map loginMap) throws Exception {
		MemberDTO memberDTO =modelMapper.map(loginMap, MemberDTO.class);

		return memberDTO;
	}

	@Override
	public void addMember(MemberDTO memberDTO) throws Exception {
		memberMapper.insertNewMember(memberDTO);
		MemberVO memberVO = modelMapper.map(memberDTO,MemberVO.class);
	}

	@Override
	public String overlapped(String id) throws Exception {
		String result   = memberMapper.selectOverlappedID(id);
		return result;
	}
}
