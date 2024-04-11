package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "S223123562";
		Assert.assertNotNull("Student ID is 223123562", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Zainab";
		Assert.assertNotNull("Student name is Zainab", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	/*
	 * Write more test functions below.
	 */

    @Test
    public void testUsernameAndPasswordEmpty() {
        LoginStatus status = LoginForm.login("-", "-");
        Assert.assertTrue(status.isLoginSuccess() == false);
    }

  
    @Test
    public void testUsernameEmptyAndPasswordWrong() {
        LoginStatus status = LoginForm.login("-", "W");
        Assert.assertTrue(status.isLoginSuccess() == false);
    }

  
    @Test
    public void testUsernameEmptyAndPasswordCorrect() {
        LoginStatus status = LoginForm.login("-", "C");
        Assert.assertTrue(status.isLoginSuccess() == false);
    }

 
    @Test
    public void testUsernameWrongAndPasswordEmpty() {
        LoginStatus status = LoginForm.login("W", "-");
        Assert.assertTrue(status.isLoginSuccess() == false);
    }


    @Test
    public void testUsernameWrongAndPasswordWrong() {
        LoginStatus status = LoginForm.login("W", "W");
        Assert.assertTrue(status.isLoginSuccess() == false);
    }

 
    @Test
    public void testUsernameWrongAndPasswordCorrect() {
        LoginStatus status = LoginForm.login("W", "C");
        Assert.assertTrue(status.isLoginSuccess() == false);
    }

    
    


    @Test
    public void testUsernameCorrectAndPasswordWrong() {
        LoginStatus status = LoginForm.login("C", "W");
        Assert.assertTrue(status.isLoginSuccess() == false);
    }

   
    @Test
    public void testUsernameCorrectAndPasswordCorrect() {
        LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
        Assert.assertTrue(status.isLoginSuccess());
    }
}
