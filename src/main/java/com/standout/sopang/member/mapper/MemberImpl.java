    package com.standout.sopang.member.mapper;

    import com.standout.sopang.member.dto.MemberDTO;
    import com.standout.sopang.member.vo.MemberVO;

    import java.util.Map;

    public class MemberImpl implements MemberMapper{
        @Override
        public void insertNewMember(MemberDTO memberDTO) {

        }

        @Override
        public MemberVO login(Map loginMap) {
            return null;
        }

        @Override
        public String selectOverlappedID(String member_id) {
            return null;
        }
    }
