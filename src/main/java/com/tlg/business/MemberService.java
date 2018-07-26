package com.tlg.business;

import com.tlg.dto.MemberDto;
import com.tlg.request.MemberReq;

import java.util.List;

/**
 * Created by jiechen on 2018/7/26.
 */
public interface MemberService {
    List<MemberDto> findAll();
    void create(MemberReq memberReq);
}
