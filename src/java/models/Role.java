package models;

public class Role {
    private int roleID;
    private String role;
    public Role(int roleID, String role)
    {
        this.roleID = roleID;
        this.role = role;
    }
    
    public int getRoleID()
    {
        return roleID;
    }
    
    public String getRole()
    {
        return role;
    }
}
