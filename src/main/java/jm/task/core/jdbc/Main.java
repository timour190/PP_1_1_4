package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Тимур", "Рустемович", (byte) 10);
        userService.saveUser("Андрей", "Соболев", (byte) 44);
        userService.saveUser("Георгий", "Олегович", (byte) 21);
        userService.saveUser("Светлана", "Шмелева", (byte) 32);

        userService.removeUserById(0);
        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}

