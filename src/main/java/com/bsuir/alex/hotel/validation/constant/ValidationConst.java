package com.bsuir.alex.hotel.validation.constant;

public final class ValidationConst {
    public static final String USERNAME = "username";
    public static final String REFILL = "refill";
    public static final String ROOM_NUMBER = "roomNumber";
    public static final String ROOM_ID = "roomId";


    public static final String ID_PATTERN = "^([1-9]{1}[0-9]{0,10})$";
    public static final String USERNAME_PATTERN = "^[a-zA-Z][a-zA-Z0-9-_\\.]{1,20}$";
    public static final String PRICE_PATTERN = "^([1-9]{1}[0-9]{0,8})$";
    public static final String ROOM_NUMBER_PATTERN = "^([0-9]{3})$";
}
