package com.bugstack.infrastructure.dcc;

import com.bugstack.types.annotations.DCCValue;
import org.springframework.stereotype.Service;

/**
 * @Author Haonan Jiang
 * @Date 2025/12/25 12:43
 * @Description: TODO
 */
@Service
public class DCCService {

    @DCCValue("downgradeSwitch:0")
    private String downgradeSwitch;

    @DCCValue("cutRange:100")
    private String cutRange;

    public boolean isDowngradeSwitch() {
        return "1".equals(downgradeSwitch);
    }

    public boolean isCutRange(String userId) {

        int hashCode = Math.abs(userId.hashCode());

        int lastTwoDigits = hashCode % 100;

        return lastTwoDigits <= Integer.parseInt(cutRange);

    }
}
