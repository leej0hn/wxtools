package com.redscarf.wxtools.common.android.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * <p>function: 微信人员信息
 * <p>User: LeeJohn
 * <p>Date: 2017/08/04
 * <p>Version: 1.0
 */
@Data
public class WechatContact implements Serializable{
    private static final long serialVersionUID = 1L;
    private String username;//用户名
    private String alias ;//微信号
    private String nickname;//微信昵称
    private String type;//联系人类型

}
