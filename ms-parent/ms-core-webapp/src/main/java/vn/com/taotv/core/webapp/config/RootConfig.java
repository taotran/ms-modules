package vn.com.taotv.core.webapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import vn.com.taotv.core.dm.config.CoreDmConfig;

/**
 * Created by TaoTran on 3/23/2016.
 */
@Configuration
@ComponentScan(basePackages = {"vn.com.taotv.config"}, excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class)})
@Import(CoreDmConfig.class)
public class RootConfig {


}
