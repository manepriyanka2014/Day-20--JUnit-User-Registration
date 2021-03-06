package bridgelabz.junituser;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitUserRegistrationTest {
	JunitUserRegistration junitUserRegistration = new JunitUserRegistration();

	@Test
	public void givenFirstName_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.firstName("Ramakrishna");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenFirstName_IsProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.firstName("RamaKrishna");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenLastName_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.lastName("Velisetti");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenLastName_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.lastName("veliseTTi");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenEmailId_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.emailId("ramakrishna96.velisetti@gmail.com");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenEmailId_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.emailId("ramakrishna96.velisettigmail.com");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenMobileNumber_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.mobileNumber("91 9989774456");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenMobileNumber_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.mobileNumber("919989774456");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenPasswordRule1_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.passwordRule1("qwgthjkdl");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenPasswordRule1_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.passwordRule1("jnsdsjRcvc");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenPasswordRule2_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.passwordRule2("qwgthRLjkdl");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenPasswordRule2_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.passwordRule2("jnsdjcvcp");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenPasswordRule3_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.passwordRule3("qw98hRLkdl");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenPasswordRule3_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.passwordRule3("jnsdjcvcp");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenPasswordRule4_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.passwordRule4("qw98hRL@&dl");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenPasswordRule4_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.passwordRule4("jsdjcvcp");
		Assert.assertEquals(false, actualResult);
	}
}