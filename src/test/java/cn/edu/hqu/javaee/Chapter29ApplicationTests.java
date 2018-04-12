package cn.edu.hqu.javaee;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cn.edu.hqu.javaee.domain.cd.CompactDisc;
import cn.edu.hqu.javaee.domain.cd.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:CDPlayerConfig.xml")
public class Chapter29ApplicationTests {
	
	@Autowired
	private MediaPlayer player;
	
	@Autowired 
	private CompactDisc cd;
	
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void play() {
		player.turnOn();
	}

}
