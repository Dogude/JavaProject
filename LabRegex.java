import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.*;
import java.nio.file.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;


class Main  {
	
	@Test
	public static void test_task1() {
		
		Pattern pattern = Pattern.compile("[a-z]+@(stu)?.?[a-z]+.com");
		
		String t = "aa@domain.com";
		boolean re = pattern.matcher(t).matches();
		if(re) {
			assertTrue(re);			
		} else { 
			assertFalse(re);
		}
		
	}

	@Test
	public static void test_task2() {
		
		String inputFileName = "studentsEN.txt";
	    String outputFileName = "output.txt";
	    Path inputPath = Paths.get(inputFileName);

		Pattern pattern = Pattern.compile("[A-Za-z][ ]+[A-Za-z][ ]+[A-Za-z]+?[ ]+([1-5])");
		
		List<String> allLines = Files.readAllLines(inputPath);
		List<String> matchedLines = new ArrayList<>();

		for (String line : allLines) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                try {
                    double value = Double.parseDouble(matcher.group(1));
                    
                    // Check if the decimal equals 5
                    if (value == 5.0) {
                        matchedLines.add(line);
                    }
                } catch (NumberFormatException e) {
                    
                }
            }
        }

        Files.write(outputPath, matchedLines);
		
	}


	public static void main(String[]  args) {
		 

		 
		
	}


}





