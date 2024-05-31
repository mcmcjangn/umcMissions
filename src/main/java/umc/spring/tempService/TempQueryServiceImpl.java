package umc.spring.tempService;

import umc.spring.apiPayLoad.code.status.ErrorStatus;
import umc.spring.apiPayLoad.exception.handler.TempHandler;

public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}
