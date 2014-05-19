package TextWrapper;

import java.util.Arrays;
import java.util.Collection;

/**
 * @author Periklas
 * We must test different values, and this can be done with the @parameters. 
 */


//Parameterized.class will run the same test case with different set of inputs.
@RunWith(Parameterized.class)

public class TextWrapperTest{

	private String testfilename;
	private String testwidth;
	public TextWrapperTest(String testfilename, String testwidth){
		this.testfilename = testfilename;
		this.testwidth = testwidth;
	}

	@Parameters 
	public static Collection<String[]> arguments() {
		return Arrays.asList(new String[][]{
				{"input.pdf", "10"},
				{"input.txt", "qwerty20"},
				{"input.txt", "0"},
				{"null.txt", "20"},
				{"\\anotherdirectory\\input.atxt", "30"},
				{"input.atxt", "30"},
				{"input.txt", "20"}});

	}

	@Test
	public void testMethod() {
		TextWrapper.main(new String[]{testfilename, testwidth});

	}
}
