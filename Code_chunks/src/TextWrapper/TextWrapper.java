package TextWrapper;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * This class enables a user to feed in a text file with a desired output
 * column width, which is output to the screen wrapped to the specifed output
 * column width.
 */
public class TextWrapper{

	/**
	 * Run this method to run this program.
	 */
	public static void main(String[] args)	{
		/* this program requires 2 parameters to run */
		if (args.length >= 2){
			try{
				TextWrapper textWrapper = new TextWrapper();
				String text = textWrapper.readText(new BufferedReader(new FileReader(args[0])));
				int colWidth = Integer.parseInt(args[1]);
				textWrapper.wrapText(text, colWidth);
			} 
			catch (FileNotFoundException e)
			{
				System.err.println("Could not find file '" + args[0] + "'");
			}
			catch (NumberFormatException e)
			{
				System.err.println("'" + args[1] + "' is not a number");
			}
		}
		else{
			System.out.println("This program requires 2 parameters to run: " +
					"a filename (string) and a column width (integer)");
		}
	}

	/**
	 * Reads from the BufferedReader and returns the contents as a String.
	 * @param br - the BufferedReader to read from.
	 * @return the text as a String.
	 */
	public String readText(BufferedReader br){
		StringBuffer sb = new StringBuffer();
		try{
			String line;
			while ((line = br.readLine()) != null)
			{
				sb.append(line);
			}
			br.close();
		}
		catch (IOException e){
			System.err.println("An IOException occurred: " + e);
		}
		return sb.toString();
	}

	/**
	 * Prints the text to the screen, wrapping each line at the 'width'.
	 * @param text - the text to wrap and output.
	 * @param width - the column width for outputting the text.
	 */
	public void wrapText(String text, int width){

		String[] words = text.split(" ");
		int remaining = width;
		
		for (String word : words){
			if (word.length() <= remaining ){
				System.out.print(word + " ");
				remaining = remaining - word.length() - 1;
			}else {
				System.out.println();
				System.out.print(word + " ");
				remaining = width - word.length() - 1 ;
			}
			 if ( word.length() > width){
				remaining = 0;
			}
		}
		
		//Note: the same output can be achieved by using the apache commons WordUtils library.
		//System.out.println(WordUtils.wrap(text, width));
	}
}

