package com.eat.melon.common.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author lixinyi03
 * @version 1.0
 * @date 2023/8/31 9:36
 * @Description
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("tb_reply")
public class ReplyMsg {

    //评论id
    private String rpid;

    //视频id
    private Long vid;

    //评论人昵称
    private String name;

    //评论
    private String reply;

    //点赞数
    private Integer liked;

    //评论时间
    private Long ctime;

    //平台
    private String platform;

}
