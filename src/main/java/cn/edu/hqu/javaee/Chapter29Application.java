package cn.edu.hqu.javaee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.edu.hqu.javaee.domain.cd.MediaPlayer;

public class Chapter29Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:CDPlayerConfig.xml");
		MediaPlayer mediaPlayer=ctx.getBean(MediaPlayer.class);
		mediaPlayer.turnOn();
		ctx.close();
	}
}
