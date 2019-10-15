package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.soundsystem.SoundSystemConfig;

/**
 *  Auto Configuration - Java Config
 *  Component Scanning( @Component, @Named, @Autowired, @Inject )
 *                      @Service
 *                      @Controller
 *                      @Repository
 * 
 */
/*
 * 
 * 테스트 클래스는 반드시 public으로 선언해야 하며 클래스명은 관례에 따라 테스트클래명 + Test 끝나는 이름으로 사용된다.
 * JUnit 3에서는 TestCase클래스를 상속받아 사용해야 했으나 JUnit 4에서는 상속받지 않아도 된다.
 * 
 * @Test 어노테이을 선언하여 testSum 메서드가 단위 테스트 메서드임을 선언한다.
 * 클래스명과 마찬가지로 테스트 메서드는 test + 테스트메서드명으로 선언한다.
 * @Test 어노테이션을 선언한 메서드는 JUnit이 알아서 실행을 해준다.
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SoundSystemConfig.class})
public class SoundSystemJavaConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	@Qualifier("highSchoolRapper3Final")
	private CompactDisc cd;

	@Autowired
	private CDPlayer cdPlayer;

	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}

	@Test
	public void testCDPlayerNull() {
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertEquals("Playing 지구멸망 by 양승호", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

}
