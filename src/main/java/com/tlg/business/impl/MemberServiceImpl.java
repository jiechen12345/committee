package com.tlg.business.impl;

import com.tlg.Entity.Member;
import com.tlg.business.MemberService;
import com.tlg.dto.MemberDto;
import com.tlg.request.MemberReq;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * Created by jiechen on 2018/7/26.
 */
@Service
public class MemberServiceImpl implements MemberService{

    @Override
    public List<MemberDto> findAll() {
        List<Member> memberList = memberDao.findAll();
        model.addAttribute("members",memberList);
        List<Member> teacherDtos = memberDao.findAll().stream()
                .map(this::getMemberDto)
                .collect(Collectors.toList());
    }

    @Override
    public void create(MemberReq memberReq) {

    }

    private MemberDto getTeacherDto(Member teacher) {
        MemberDto teacherDto = new MemberDto();
        teacherDto.setName(teacher.getName());
        teacherDto.setId(teacher.getId());
        teacherDto.setLessons(teacher.getLessons().stream().map(it -> it.getName()).collect(toList()));
        return teacherDto;
    }
}
