import com.lmy.Application;
import com.lmy.service.apiService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
    @Resource
    private apiService apiService;

    @org.junit.Test
    public void test(){
        System.out.println(apiService.index());
    }
    @org.junit.Test
    public void test1(){
        System.out.println(apiService.index());
    }
    @org.junit.Test
    public void test2(){
        System.out.println(apiService.index());
    }
}
