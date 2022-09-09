package com.hnchances.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author qinghong
 * @since 2022-09-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 用户名
     */
    @TableField("userName")
    private String username;

    /**
     * 密码，md5
     */
    @TableField("passWord")
    private String password;

    /**
     * 电话号码11位
     */
    private String phone;

    /**
     * 真实姓名
     */
    @TableField("trueName")
    private String truename;

    /**
     * 0-学生，1-老师，2-领导或管理（可看所有班级）
     */
    private Integer identity;

    /**
     * 班级关联ID
     */
    @TableField("classID")
    private Integer classid;

    /**
     * 课程ID
     */
    @TableField("courseID")
    private Integer courseid;

    /**
     * 学生ID
     */
    @TableField("studentID")
    private Integer studentid;

    /**
     * 注册日期
     */
    @TableField("creatDateTime")
    private LocalDateTime creatdatetime;

    /**
     * 修改日期
     */
    @TableField("updateDateTime")
    private LocalDateTime updatedatetime;

    /**
     * 最后登录时间
     */
    @TableField("lastLoginDateTime")
    private LocalDateTime lastlogindatetime;

    /**
     * ipv4
     */
    @TableField("loginIP")
    private String loginip;

    /**
     * 修改人ID
     */
    @TableField("updateByID")
    private Long updatebyid;

    /**
     * 0-正常，1-删除
     */
    private Integer status;

    /**
     * 0-未审核,1-审核
     */
    private Integer verify;


}
