package umc.spring.tempService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TempCommandServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
    }
}