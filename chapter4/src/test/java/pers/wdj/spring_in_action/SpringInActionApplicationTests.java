package pers.wdj.spring_in_action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pers.wdj.spring_in_action.aop.Performance;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringInActionApplicationTests {

    @Autowired
    private Map<String, Performance> beanMap;

    @Test
    public void contextLoads() {
        Performance performance = beanMap.get("excellentPerformance");
        performance.perform();
    }

}
