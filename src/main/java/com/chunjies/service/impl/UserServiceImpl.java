package com.chunjies.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chunjies.entity.User;
import com.chunjies.mapper.UserMapper;
import com.chunjies.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 大虫
 * @since 2019-04-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
