package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

  

public class main {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        System.out.println("Education Ontology For IT");
        String parameter = "";
        int x = 1;
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int count = 0;
        while (true) {
            count=count+1;
            System.out.println("Please enter your required knowladge ? ");
            parameter = reader.readLine();
            String queary = "SELECT * WHERE { ?sub ?pred " + " ' " + parameter + " ' " + ".} LIMIT 10";
            System.out.println(queary);
            try {
                PrintWriter out = new PrintWriter("C:\\Users\\LahiruRajapaksha\\OneDrive - Kaleris\\Pictures\\SLIIT\\MSc\\Gayani\\Research\\text files\\queary" + count+ ".txt");
                out.print(queary);
                out.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            //System.setProperty("webdriver.chrome.driver","C:\\Users\\LahiruRajapaksha\\OneDrive - Kaleris\\Pictures\\SLIIT\\MSc\\Gayani\\Research\\chromedriver_win32\\chromedriver.exe"); 
            //WebDriver driver=new ChromeDriver();   
        }

    }

}
