package com.redscarf.wxtools.common.android.dto;


import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * <p>function: 微信人员信息
 * <p>User: LeeJohn
 * <p>Date: 2017/08/04
 * <p>Version: 1.0
 */
@Data
public class WechatContactInfo extends MsgBase implements Serializable{
    private static final long serialVersionUID = 1L;
    private List<WechatContact> wechatContacts;

}
