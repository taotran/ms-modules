package vn.com.taotv.webconfig.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import vn.com.taotv.core.webapp.controller.HomeController;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
/**
 * Created by TaoTran on 3/23/2016.
 */
public class HomeControllerTest {

    @Test
    public void testHome() throws Exception{
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/")).andExpect(view().name("index"));
    }

}
