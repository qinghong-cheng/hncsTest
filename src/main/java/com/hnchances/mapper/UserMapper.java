package com.hnchances.mapper;

import com.hnchances.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author qinghong
 * @since 2022-09-09
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
