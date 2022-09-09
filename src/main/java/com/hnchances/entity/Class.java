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
public class Class extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 班级名称
     */
    @TableField("className")
    private String classname;

    /**
     * 0正常，1删除
     */
    private Integer status;


}
