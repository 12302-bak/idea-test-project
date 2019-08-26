package netty.hikvisionLED.demo.enums;

/**
 * Copyright 2018 ...com Inc. All Rights Reserved.
 *
 * @author: 12302
 * @Date: 2019-08-26
 * @Desc:
 */
public enum CMD {
    SEND_DISPLAY_DATA("0xDA","发送显示数据"),
    INSTANT_MESSAGE_COMMAND("0xDB","即使信息指令"),
    STOP_INSTANT_MSG_CMD("0xDC","终止即时信息指令"),
    VOICE_MESSAGE_COMMAND("0xDE","语音信息指令"),
    TIME_CHECK_COMMAND("0xC5","校对时间指令"),
    BRIGHTNESS_CONTROL_COMMAND("0xC9","亮度调节");


    /**
     * _12302_2019-08-26
     * 指令代码
     */
    private String code;
    /**
     * _12302_2019-08-26
     * 指令描述
     */
    private String desc;

    CMD(String code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}