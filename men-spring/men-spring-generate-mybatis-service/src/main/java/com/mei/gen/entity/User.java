package com.mei.gen.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * BackOffice用户
 * </p>
 *
 * @author zoufuqun
 * @since 2022-07-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 经纪商Id, 经纪商的用户需要这个值，券商的用户不需要
     */
    private String dealerId;

    /**
     * 登录用户名
     */
    private String userName;

    /**
     * 密码加密值
     */
    private String password;

    /**
     * 密码salt
     */
    private String salt;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否是主账号
     */
    private String isMain;

    /**
     * 用户token依赖的私钥
     */
    private String keySecretPri;

    /**
     * 是否删除
     */
    private String isDeleted;

    private LocalDateTime createTime;

    private String creatorId;

    private LocalDateTime modifyTime;

    private String modifierId;

    /**
     * 密码过期时间
     */
    private LocalDateTime psdExtTime;


}
