package vn.com.taotv.core.dm.service.test;

import org.springframework.stereotype.Service;

/**
 * Created by TaoTran on 3/23/2016.
 */
@Service
public class TestServiceBean implements TestService {

    public void test() {
        System.out.println("inside testService");
    }
}
