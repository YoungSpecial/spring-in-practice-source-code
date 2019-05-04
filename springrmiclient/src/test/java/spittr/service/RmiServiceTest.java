package spittr.service;



import com.habuma.spittr.config.RmiConfig;
import com.habuma.spittr.service.SpitterService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= RmiConfig.class)
public class RmiServiceTest {

  @Autowired
  private SpitterService spitterService;

  @Before
  public void clearContext() {
    SecurityContextHolder.clearContext();
  }

  @Test
  public void test(){
    spitterService.savespittle(null);
  }
  



}
