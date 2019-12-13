package ru.javamentor.predProject8.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.javamentor.predProject8.exception.DBException;
import ru.javamentor.predProject8.repository.RoleRepository;
import ru.javamentor.predProject8.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public Long getRoleIdByName(String name) throws DBException {
        return roleRepository.findRoleByRolename(name).get().getId();
    }

    @Override
    public void addRoles(Long user_id, Long role_id) throws DBException {
        roleRepository.insertRoles(user_id, role_id);
    }

    @Override
    public void deleteRoles(Long user_id, Long role_id) throws DBException {
        roleRepository.deleteRoles(user_id, role_id);
    }
}
