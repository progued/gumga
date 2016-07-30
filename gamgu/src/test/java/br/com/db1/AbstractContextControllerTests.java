package br.com.db1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/gamgu-servlet.xml")
public class AbstractContextControllerTests {

	@Autowired
	protected WebApplicationContext wac;

}

