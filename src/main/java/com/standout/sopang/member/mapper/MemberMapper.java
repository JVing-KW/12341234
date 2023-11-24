package com.standout.sopang.member.mapper;

import com.standout.sopang.member.dto.MemberDTO;
import com.standout.sopang.member.vo.MemberVO;

import java.util.List;
import java.util.Map;

public interface MemberMapper {

    MemberVO login(Map loginMap);

    void insertNewMember(MemberDTO memberDTO);

    //Ÿ�� ����
    String selectOverlappedID(String member_id);


}
