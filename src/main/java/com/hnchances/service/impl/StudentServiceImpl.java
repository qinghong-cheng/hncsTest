package com.hnchances.service.impl;

import com.hnchances.entity.Student;
import com.hnchances.mapper.StudentMapper;
import com.hnchances.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qinghong
 * @since 2022-09-09
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
