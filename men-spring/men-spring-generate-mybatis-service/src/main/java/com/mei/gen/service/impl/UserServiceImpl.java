package com.mei.gen.service.impl;

import com.mei.gen.entity.User;
import com.mei.gen.mapper.UserMapper;
import com.mei.gen.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * BackOffice用户 服务实现类
 * </p>
 *
 * @author zoufuqun
 * @since 2022-07-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
