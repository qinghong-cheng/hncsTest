package com.hnchances.entity;

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
public class Course extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 课程名称
     */
    @TableField("courseName")
    private String coursename;

    /**
     * 0正常，1删除
     */
    private Integer status;


}
