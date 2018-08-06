package com.tlg.business;


import com.tlg.Entity.OtherMsg;
import com.tlg.dto.OtherMsgDto;
import com.tlg.request.OtherMsgReq;

import java.util.List;

/**
 * Created by jiechen on 2018/8/2.
 */
public interface OtherMsgService {
    List<OtherMsgDto> findAll();
    void create(OtherMsgReq otherMsgReq);
    OtherMsgDto findOne(Integer id);
    void update(OtherMsgReq otherMsgReq);
    void delete(Integer id);
}
