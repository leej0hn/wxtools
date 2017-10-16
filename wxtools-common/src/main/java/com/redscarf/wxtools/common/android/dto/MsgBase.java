package com.redscarf.wxtools.common.android.dto;

import lombok.Data;

import java.io.Serializable;


/**
 * <p>function: 微信netty通信基础类
 * <p>User: LeeJohn
 * <p>Date: 2017/08/04
 * <p>Version: 1.0
 */
@Data
public class MsgBase implements Serializable {
    private static final long serialVersionUID = 1L;
    private String clientId ;//netty客户端ID
    private String clientWxId;//客户端微信ID
    private String apiCode ; //接口编码

}
