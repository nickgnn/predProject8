package ru.javamentor.predProject8.service;

import ru.javamentor.predProject8.exception.DBException;

public interface RoleService {
    Long getRoleIdByName(String name) throws DBException;
    void addRoles(Long user_id, Long role_id) throws DBException;
    void deleteRoles(Long user_id, Long role_id) throws DBException;
}