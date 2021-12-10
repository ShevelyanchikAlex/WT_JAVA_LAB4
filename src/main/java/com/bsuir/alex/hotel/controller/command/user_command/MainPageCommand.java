package com.bsuir.alex.hotel.controller.command.user_command;

import com.bsuir.alex.hotel.controller.command.Command;
import com.bsuir.alex.hotel.controller.command.CommandResult;
import com.bsuir.alex.hotel.entity.Room;
import com.bsuir.alex.hotel.service.impl.RoomServiceImpl;
import com.bsuir.alex.hotel.service.ServiceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MainPageCommand implements Command {

    private static final String MAIN_PAGE = "/WEB-INF/pages/makeOrder.jsp";
    private static final String ROOM_LIST = "roomList";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        RoomServiceImpl roomService = new RoomServiceImpl();
        List<Room> freeRoomList = roomService.findFree();
        request.setAttribute(ROOM_LIST, freeRoomList);
        return CommandResult.forward(MAIN_PAGE);
    }
}
