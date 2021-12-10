package com.bsuir.alex.hotel.controller.command.user_command;

import com.bsuir.alex.hotel.controller.command.Command;
import com.bsuir.alex.hotel.controller.command.CommandResult;
import com.bsuir.alex.hotel.service.impl.RoomServiceImpl;
import com.bsuir.alex.hotel.service.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrderCommand implements Command {

    private static final String MAIN_PAGE = "controller?command=mainPage";
    private static final String ROOM_ID = "roomId";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        String roomId = request.getParameter(ROOM_ID);

        RoomServiceImpl roomService = new RoomServiceImpl();
        roomService.changeStatus(Integer.valueOf(roomId), true);

        return CommandResult.redirect(MAIN_PAGE);
    }
}
