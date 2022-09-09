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
public class Student extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 出生年月日
     */
    private LocalDateTime birthday;

    /**
     * 身份证
     */
    private String idcard;

    /**
     * 班级ID
     */
    @TableField("classID")
    private Integer classid;

    /**
     * 0-正常，1-删除
     */
    private Integer status;


}
