package pers.wdj.spring_in_action.bean;

import org.springframework.stereotype.Service;
import pers.wdj.spring_in_action.aop.Performance;

@Service
public class ExcellentPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("It's an excellent performance！");
        System.out.println("Very well!");
    }
}
