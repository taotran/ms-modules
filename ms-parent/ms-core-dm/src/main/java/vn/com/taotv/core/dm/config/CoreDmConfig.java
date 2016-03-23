package vn.com.taotv.core.dm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * Created by TaoTran on 3/23/2016.
 */
@Component
@ComponentScan(basePackages = "vn.com.taotv.core.dm")
public class CoreDmConfig {

    @Bean
    public void testBean() {
        System.out.println("Test Bean");
    }

}
