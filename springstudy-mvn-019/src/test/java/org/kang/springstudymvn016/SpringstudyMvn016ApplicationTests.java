package org.kang.springstudymvn016;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Do not forget to add @RunWith(SpringRunner.class) to your test.
 * Otherwise, the annotations are ignored.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class SpringstudyMvn016ApplicationTests {
	@Autowired
	MockMvc mockMvc;

	@Test
	public void testFoo() {
		assertThat(mockMvc).isNotNull();
	}

}
