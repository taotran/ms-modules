package vn.com.taotv.core.webapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import vn.com.taotv.core.dm.config.CoreDmConfig;

/**
 * Created by TaoTran on 3/23/2016.
 */
@Configuration
@ComponentScan(basePackages = "vn.com.taotv")
@Import(CoreDmConfig.class)
public class RootConfig {
}
