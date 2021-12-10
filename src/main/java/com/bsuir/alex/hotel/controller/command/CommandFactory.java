package com.bsuir.alex.hotel.controller.command;

import com.bsuir.alex.hotel.controller.command.admin_command.AddRoomCommand;
import com.bsuir.alex.hotel.controller.command.admin_command.DeoccupyRoomCommand;
import com.bsuir.alex.hotel.controller.command.admin_command.ShowRoomsCommand;
import com.bsuir.alex.hotel.controller.command.common_command.*;
import com.bsuir.alex.hotel.controller.command.user_command.MainPageCommand;
import com.bsuir.alex.hotel.controller.command.user_command.MakeOrderCommand;

public class CommandFactory {
    private static final CommandFactory INSTANCE = new CommandFactory();
    private static final String MAIN_PAGE = "mainPage";
    private static final String MAKE_ORDER = "makeOrder";
    private static final String LOGIN = "login";
    private static final String SHOW_ROOMS = "showRooms";
    private static final String CHANGE_LANGUAGE = "changeLanguage";
    private static final String ADD_ROOM = "addRoom";
    private static final String DEOCCUPY_ROOM = "deoccupyRoom";
    private static final String LOG_OUT = "signOut";
    private static final String SIGN_UP = "signUp";
    private static final String START_PAGE = "startPage";
    private static final String START_LOGIN = "startLogin";

    private CommandFactory() {
    }

    public static CommandFactory getInstance() {
        return INSTANCE;
    }

    public Command getCommand(String name) {
        switch (name) {
            case LOGIN:
                return new LoginCommand();
            case SHOW_ROOMS:
                return new ShowRoomsCommand();
            case MAIN_PAGE:
                return new MainPageCommand();
            case CHANGE_LANGUAGE:
                return new ChangeLanguageCommand();
            case ADD_ROOM:
                return new AddRoomCommand();
            case MAKE_ORDER:
                return new MakeOrderCommand();
            case DEOCCUPY_ROOM:
                return new DeoccupyRoomCommand();
            case LOG_OUT:
                return new LogOutCommand();
            case START_PAGE:
                return new StartPageCommand();
            case SIGN_UP:
                return new SignUpCommand();
            case START_LOGIN:
                return new StartLoginCommand();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
