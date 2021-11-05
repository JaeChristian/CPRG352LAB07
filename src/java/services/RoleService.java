package services;

import dataaccess.RoleDB;
import java.util.List;
import models.Role;

public class RoleService {
    public List<Role> getAll() throws Exception
    {
        RoleDB roleDB = new RoleDB();
        List<Role> roles = roleDB.getAll();
        return roles;
    }
    
    public Role getRole(int roleID) throws Exception
    {
        for(int i = 0; i<getAll().size();i++)
        {
            if(roleID == getAll().get(i).getRoleID())
            {
                return getAll().get(i);
            }
        }
        return null;
    }
}
