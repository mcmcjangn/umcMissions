package umc.spring.apiPayLoad.exception.handler;

import umc.spring.apiPayLoad.code.BaseErrorCode;
import umc.spring.apiPayLoad.code.status.ErrorStatus;
import umc.spring.apiPayLoad.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException{
    private ErrorStatus errorStatus;

    public FoodCategoryHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}