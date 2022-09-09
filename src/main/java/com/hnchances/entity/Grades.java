package com.hnchances.entity;

import java.math.BigDecimal;
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
public class Grades extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 课程关联id
     */
    @TableField("courseID")
    private String courseid;

    /**
     * 考试关联id
     */
    @TableField("examID")
    private Integer examid;

    /**
     * 班级关联id
     */
    @TableField("classID")
    private Integer classid;

    /**
     * 成绩
     */
    private BigDecimal grades;

    /**
     * 0-正常，1-删除
     */
    private Integer status;


}
