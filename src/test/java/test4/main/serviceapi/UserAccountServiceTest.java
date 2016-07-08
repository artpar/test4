package test4.main.serviceapi;

import org.junit.Test;
import org.sculptor.framework.test.AbstractDbUnitJpaTests;
import org.springframework.beans.factory.annotation.Autowired;
import test4.main.serviceapi.UserAccountService;

import static org.junit.Assert.*;

/**
 * Spring based transactional test with DbUnit support.
 */
public class UserAccountServiceTest extends AbstractDbUnitJpaTests implements UserAccountServiceTestBase {

	@Autowired
	protected UserAccountService userAccountService;

	@Test
	public void testFindById() throws Exception {
		// TODO Auto-generated method stub
		fail("testFindById not implemented");
	}

	@Test
	public void testFindAll() throws Exception {
		// TODO Auto-generated method stub
		fail("testFindAll not implemented");
	}

	@Test
	public void testSave() throws Exception {
		// TODO Auto-generated method stub
		fail("testSave not implemented");
	}

	@Test
	public void testDelete() throws Exception {
		// TODO Auto-generated method stub
		fail("testDelete not implemented");
	}
}
