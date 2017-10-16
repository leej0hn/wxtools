package com.redscarf.wxtools.common.android.contants;

/**
 * <p>function: netty接口AIP
 * <p>User: LeeJohn
 * <p>Date: 2017/09/08
 * <p>Version: 1.0
 */
public class ApiCodes {
    public static final String WECHAT_MESSAGE_API_CODE                          = "0001"; //消息接口
    public static final String WECHAT_CHATROOM_REFRESH_API_CODE                 = "0002"; //更新群信息接口
    public static final String WECHAT_CONTACT_REFRESH_API_CODE                  = "0003"; //更新联系人接口
    public static final String WECHAT_CONTACT_IMG_REFRESH_API_CODE              = "0004"; //更新联系人头像接口
    public static final String WECHAT_JOIN_CHATROOM_API_CODE                    = "0005"; //加入群消息接口
    public static final String WECHAT_CHANGE_CHATROOM_API_CODE                  = "0006"; //群信息变动消息接口

    public static final String SERVER_PUSH_MSG_SEDN_TEXT_API_CODE               = "9007";//服务器发送文本消息接口
    public static final String SERVER_PUSH_MSG_SEDN_VOICE_API_CODE              = "9008";//服务器发送音频消息接口
    public static final String SERVER_PUSH_MSG_SEDN_IMG_API_CODE                = "9009";//服务器发送图片消息接口
    public static final String SERVER_PUSH_MSG_SEDN_VIDEO_API_CODE              = "9010";//服务器发送视频消息接口


    public static final String SERVER_HEARTBEAT_API_CODE                        = "9999";//服务器客户端保持心跳线程
}
