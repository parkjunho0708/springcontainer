package kr.co.itcen.springcontainer.user;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;

/*
 * < 대표적인 단정문 >
 * assertArrayEquals(a,b) : 배열 a와b가 일치함을 확인
 * assertEquals(a,b) : 객체 a와b의 값이 같은지 확인
 * assertSame(a,b) : 객체 a와b가 같은 객체임을 확인
 * assertTrue(a) : a가 참인지 확인
 * assertNotNull(a) : a객체가 null이 아님을 확인
 * 이외에도 다양한 단정문이 존재합니다. 
 * 자세한 내용은 아래 링크를 가시면 확인하실 수 있습니다. 
 * http://junit.sourceforge.net/javadoc/org/junit/Assert.html
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { UserConfig01.class })
public class UserTest {

	@Autowired
	private User user;

	@Autowired
	private Friend friend;

	@Test
	public void testUserNull() {
		assertNotNull(user);
	}

	@Test
	public void testFriendNull() {
		assertNotNull(friend);
	}

	@Test
	public void testFriendDooly() {
		assertNotEquals(friend.getName(), "마이콜");
	}

}
