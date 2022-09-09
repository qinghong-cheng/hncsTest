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
public class Exam extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 考试名称
     */
    @TableField("examName")
    private String examname;

    /**
     * 0正常1删除
     */
    private Integer status;


}
