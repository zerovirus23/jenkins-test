package co.zero;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.ui.ConcurrentModel;

@RunWith(MockitoJUnitRunner.class)
public class PortalApplicationTests {
	@Mock
	private SpringApplicationBuilder builder;
	
	private PortalApplication app = new PortalApplication();
	
	@Test
	public void contextLoads() {
		app.configure(builder);
	}

	@Test
	public void test1() {
		PortalApplication.main(new String[] {""});
	}
	
	@Test
	public void test2() {
		app.hello(new ConcurrentModel());
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
	
	@Test
	public void test10() {}
	@Test
	public void test11() {}
	@Test
	public void test12() {}
	@Test
	public void test13() {}
	
}
