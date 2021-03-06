package cn.dooling.samlazure.service.impl;

import cn.dooling.samlazure.dao.SysUserRoleDao;
import cn.dooling.samlazure.domain.entity.SysUserRole;
import cn.dooling.samlazure.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private SysUserRoleDao sysUserRoleDao;

    @Override
    public List<SysUserRole> listByUserId(Integer userId) {
        return sysUserRoleDao.selectByUserId(userId);
    }
}
