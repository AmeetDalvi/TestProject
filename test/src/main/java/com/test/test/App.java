package com.test.test;

import java.io.IOException;
import java.net.URL;

/**
 * Hello world!
 *
 */
public class App 
{
	
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      
        try {
        	  testingPath path = new testingPath();
              String pathStr = path.testing();
              System.out.println("path = " +pathStr);
            String replaced =   pathStr.replace("\\", "\\\\");
           System.out.println("replaced = " +replaced);
            String testBatString =  replaced.concat("\\testbat.bat");
          //  System.out.println("testBatString = " +testBatString);
            
            char ch='"';

           // testBatString =ch+testBatString+ch; 
         //   System.out.println("testBatStringaaaa = " +testBatString);
            
            String newpathStr = path.testingtarget();
         //   System.out.println("newpathStr = " +newpathStr);
            
            newpathStr = newpathStr.concat("\\test-0.0.1-SNAPSHOT.jar");
          //  System.out.println("newpathStr1 = " +newpathStr);
            
            
            String pathtargetClass = path.testingtargetclass();
            String replacedtarg =   pathtargetClass.replace("\\", "\\\\");
           // System.out.println("replaced = " +replacedtarg);
            replacedtarg = replacedtarg.concat("\\classes");
            
            String testreplacedtarg =  replacedtarg.concat("\\\\testBat.bat");
         //   System.out.println("replacedtarg = " +testreplacedtarg);
           
          //  String totalString  = testBatString.concat(" ").concat(newpathStr);
          //  System.out.println("totalString = " +totalString);
            
			//Runtime.getRuntime().exec(new String[] {"cmd.exe","/c","Start",totalString});
          
           // Runtime.getRuntime().exec(new String[] {"cmd.exe","/c","Start","D:\\workspace_SiteConstruction\\test\\src\\main\\java\\testbat.bat     \\\" D:\\workspace_SiteConstruction\\test\\target\\test-0.0.1-SNAPSHOT.jar\\\"" });
            
        	//Runtime.getRuntime().exec(new String[] {"cmd.exe","/c","Start"});
            
          //  Runtime.getRuntime().exec(new String[] {"cmd.exe","/c","Start", "D:\\workspace_SiteConstruction\\test\\src\\main\\java\\testbat.bat","Amit"});
            
        //    Runtime.getRuntime().exec(new String[] {"cmd.exe","/c","Start","D:\\workspace_SiteConstruction\\test\\src\\main\\java\\testbat.bat", "D:\\workspace_SiteConstruction\\test\\target\\test-0.0.1-SNAPSHOT.jar" });
            																  
          //  Runtime.getRuntime().exec(new String[] {"cmd.exe","/c","Start",testBatString.toString(), newpathStr.toString() });
            
       String s1 = new String("D:\\workspace_SiteConstruction\\test\\src\\main\\java\\testbat.bat");
      // testBatString =ch+testBatString+ch; 
       String s2 = new String(testBatString);
       
       System.out.println("value s1 = "+s1);
       System.out.println("value s2 = "+s2);
            String cmds[] = new String[]{"cmd.exe", "/c","Start", s2};
            Runtime runtime = Runtime.getRuntime();
            Process proc = runtime.exec(cmds);
            
            //    Runtime.getRuntime().exec(new String[] {"cmd.exe","/c","Start", testBatString});
            
       //    Runtime.getRuntime().exec(new String[] {"cmd.exe","/c","Start","D:\\\\workspace_SiteConstruction\\\\test\\\\src\\\\main\\\\java\\\\mybat.bat" });
            

        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
