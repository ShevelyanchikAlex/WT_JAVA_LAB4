package com.bsuir.alex.hotel.validation.impl;

import com.bsuir.alex.hotel.validation.Validation;
import com.bsuir.alex.hotel.validation.constant.ValidationConst;

import java.util.Map;

public class ValidationImpl implements Validation {

    private String invalidData;

    private String definePattern(String type) {
        switch (type) {
            case ValidationConst.USERNAME:
                return ValidationConst.USERNAME_PATTERN;
            case ValidationConst.REFILL:
                return ValidationConst.PRICE_PATTERN;
            case ValidationConst.ROOM_NUMBER:
                return ValidationConst.ROOM_NUMBER_PATTERN;
            case ValidationConst.ROOM_ID:
                return ValidationConst.ID_PATTERN;
            default:
                throw new UnsupportedOperationException();
        }
    }


    @Override
    public boolean isValid(Map<String, String> inputData) {
        for (Map.Entry<String, String> entry : inputData.entrySet()) {
            String value = entry.getValue();
            if (value == null) return false;
            String key = entry.getKey();
            String pattern = definePattern(key);
            if (!value.matches(pattern)) {
                invalidData = key;
                return false;
            }
        }
        return true;
    }


    public String getInvalidData() {
        return invalidData;
    }
}
