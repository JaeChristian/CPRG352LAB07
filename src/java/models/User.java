/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import services.RoleService;

/**
 *
 * @author Jay
 */
public class User {
    private String email;
    private boolean active;
    private String firstname;
    private String lastname;
    private String password;
    private int role;
    private String roleName;
    private RoleService rs = new RoleService(); 
    
    public User(String email, boolean active, String firstname, String lastname, String password, int role) throws Exception
    {
        this.email = email;
        this.active = active;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
        this.role = role;
        this.roleName=rs.getRole(role).getRole();
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public boolean getActive()
    {
        return active;
    }
    
    public void setActive(boolean active)
    {
        this.active = active;
    }
    
    public String getFirstname()
    {
        return firstname;
    }
    
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }
    
    public String getLastname()
    {
        return lastname;
    }
    
    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public int getRole()
    {
        return role;
    }
    
    public String getRoleName()
    {
        return roleName;
    }
    
    public void setRole(int role) throws Exception
    {
        this.role = role;
        this.roleName=rs.getRole(role).getRole();
    }
}
