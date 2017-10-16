package com.redscarf.wxtools.common.android.dto;


import lombok.Data;

import java.io.Serializable;

/**
 * <p>function:
 * <p>User: LeeJohn
 * <p>Date: 2017/7/28
 * <p>Version: 1.0
 */
@Data
public class WechatMsg extends MsgBase implements Serializable{
    private static final long serialVersionUID = -615160665998607887L;
    private String talker;//发言人
    private long createTime;//发送时间 1500954322000 13位
    private String content;//文本内容
    private String filePath;//文件路径，即当发送的是图片或视频或表情时，此文件在安卓手机端的路径
    private String fileUrl;// 文件URL,即当发送的文件在微信服务器上有URL，我们先传文件URL，目前自定义表情发送URL
    private int msgTye;// 0:系统消息（自定义），1:文本，或系统自带表情 ;  3: 图片 ; 34: 音频 ; 43: 视频  ; 47: 自定义表情或专辑表情 ; 49: 群邀请链接
    private String chatRoomId;// 群ID
    private Integer isSend ;//用来区别是他人发消息，还是自己发的消息，在私聊时起区分作用。0是他人发，1是自己发
    private int contentType ;//用来区别msgTye相同时的消息类型
    private String file;//图片、视频缩略图 ，包括音频文件，base64 成字符

}
