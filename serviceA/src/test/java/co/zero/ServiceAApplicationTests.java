package co.zero;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;

@RunWith(MockitoJUnitRunner.class)
public class ServiceAApplicationTests {
	@Mock
	private SpringApplicationBuilder builder;
	private ServiceAApplication app = new ServiceAApplication();
	
	@Test
	public void contextLoads() {
		app.configure(builder);
	}

	@Test
	public void test1() {
		ServiceAApplication.main(new String[] {""});
	}
	
	@Test
	public void test2() {
		app.helloWorld();
	}
	
	@Test
	public void test3() {}
	
	@Test
	public void test4() {}
	
	@Test
	public void test5() {}
	
	@Test
	public void test6() {}
	
	@Test
	public void test7() {}
	
	@Test
	public void test8() {}
	
	@Test
	public void test9() {}
}
