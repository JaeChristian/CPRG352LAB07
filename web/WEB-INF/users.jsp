<%-- 
    Document   : users
    Created on : Nov 4, 2021, 7:01:29 AM
    Author     : Jay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Manager</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/style.css"/>
    </head>
    <body>
            <form action="users" method="POST">
                <div class="add">
                    <div class="addcontainer">
                        <div class="header">Add User</div>
                        <ul>
                            <li><input type="email" name="email" placeholder="Email"></li>
                            <li><input type="text" name="firstname" placeholder="First Name"></li>
                            <li><input type="text" name="lastname" placeholder="Last Name"></li>
                            <li><input type="password" name="password" placeholder="Password"></li>
                            <li>
                                <select name="role">
                                    <option value="regularuser">Regular User</option>
                                    <option value="systemadmin">System Admin</option>
                                    <option value="companyadmin">Company Admin</option>
                                </select>
                            </li>
                            
                        </ul>
                        <div class="active"><label>Active: </label><input type="checkbox" name="active"></div>
                        
                        <input type="submit" value="Add">
                        <input type="hidden" name="action" value="add">
                        
                    </div>
                </div>
            </form>
            <div class="manage">
                
                    <table>
                        <tr><td><div class="header">Manager Users</div></td></tr>
                        <tr class="theader">
                            <td class="email">Email</td>
                            <td class="name">First Name</td>
                            <td class="name">Last Name</td>
                            <td class="role">Role</td>
                            <td class="options">Edit</td>
                            <td class="options">Delete</td>
                        </tr>
                        
                        <c:forEach items="${users}" var="user">
                            <tr class="users">
                                <td>${user.email}</td>
                                <td>${user.firstname}</td>
                                <td>${user.lastname}</td>
                                <td>${user.roleName}</td>
                                <td class="button"> <a href="users?action=edit&amp;selectedUser=${user.email}">Edit</a></td>
                                <td class="button2"><a href="users?action=delete&amp;selectedUser=${user.email}">Delete</a></td>
                            </tr>
                        </c:forEach>
                    </table>
            </div>
            <form action="users" method="POST">
                <div class="edit">
                    <div class="editcontainer">
                        <div class="header">Edit User</div>
                        <ul>
                            <li><input type="email" name="emailedit" placeholder="Email" disabled></li>
                            <li><input type="text" name="firstnameedit" placeholder="First Name"></li>
                            <li><input type="text" name="lastnameedit" placeholder="Last Name"></li>
                            <li><input type="password" name="passwordedit" placeholder="Password"></li>
                            <li>
                                <select name="roleedit">
                                    <option value="regularuser">Regular User</option>
                                    <option value="systemadmin">System Admin</option>
                                    <option value="companyadmin">Company Admin</option>
                                </select>
                            </li>
                        </ul>
                        <div class="active"><label>Active: </label><input type="checkbox" name="activeedit"></div>
                        <div class="save">
                            <input type="submit" value="Save">
                            <input type="hidden" name="action" value="save">
                        </div>
                    </div>
                </div>
            </form>
    </body>
</html>
