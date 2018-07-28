package com.tlg.business.impl;

import com.tlg.Entity.Departemt;
import com.tlg.Entity.Member;
import com.tlg.business.MemberService;
import com.tlg.dao.DepartmentDao;
import com.tlg.dao.MemberDao;
import com.tlg.dto.MemberDto;
import com.tlg.request.MemberReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by jiechen on 2018/7/26.
 */
@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberDao memberDao;
    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public List<MemberDto> findAll() {
        List<MemberDto> memberDtoList = memberDao.findAll().stream()
                .map(this::getMemberDto)
                .collect(Collectors.toList());
        return memberDtoList;
    }

    @Override
    public void create(MemberReq memberReq) {
        Member member = new Member();
        member.setAccount(memberReq.getAccount());
        member.setNeme(memberReq.getName());
        member.setPassword(memberReq.getPassword());
        //finOne被findById取代??要怎弄?
        Departemt departemt = departmentDao.findById(Integer.parseInt(memberReq.getDepId())).get();
        member.setDepartemt(departemt);
        memberDao.save(member);

    }

    private MemberDto getMemberDto(Member member) {
        MemberDto memberDto = new MemberDto();
        memberDto.setId(member.getId().toString());
        memberDto.setAccount(member.getAccount());
        memberDto.setPassword(member.getPassword());
        memberDto.setNeme(member.getNeme());
        if (member.getDepartemt() != null) {
            memberDto.setDepName(member.getDepartemt().getDepName());
        } else {
            memberDto.setDepName("");
        }
        return memberDto;
    }
}
