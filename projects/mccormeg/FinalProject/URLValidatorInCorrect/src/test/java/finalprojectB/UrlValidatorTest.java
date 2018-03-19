
package finalprojectB;

import junit.framework.TestCase;

//You can use this as a skeleton for your 3 different test approach
//It is an optional to use this file, you can generate your own test file(s) to test the target function!
// Again, it is up to you to use this file or not!





public class UrlValidatorTest extends TestCase {

 private final boolean printStatus = false;
 private final boolean printIndex = false;//print index that indicates current scheme,host,port,path, query test were using.
 
   public UrlValidatorTest(String testName) {
      super(testName);
   }
   
   
   public void testManualTest()
   {
	  //You can use this function to implement your manual testing	   
	  UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      //You can use this function to implement your manual testing	   
      assertTrue(urlVal.isValid("https://www.google.com"));
      assertTrue(urlVal.isValid("http://developer.mozilla.org"));
      assertTrue(urlVal.isValid("http://people.oregonstate.edu:80/~mcquoidi"));
      assertTrue(urlVal.isValid("data://gmail.com/test.html?key1=value1&key2=value2"));
      assertTrue(urlVal.isValid("ftp://www.amazon.com/test.html#SomewhereInTheDocument"));
      assertTrue(urlVal.isValid("file://localhost/etc/fstab"));  
   }
   
   
   public void testYourFirstPartition()
   {
	 //You can use this function to implement your First Partition testing	   
	UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      //Testing ports
      String[] schemes = { 
         "http://",
         "https://",
         "ftp://",
         "h3t://",
         "data://",
         ""
      };
      String[] domains = {
         "www.google.com",
         "people.oregonstate.edu",
         "go.com",
         "255.255.255.255"
      };
      String port = ":80";
      String[] paths = {
         "",
         "/test/",
         "/test/file",
         "/~test"
      };
      int a = 0, b = 0, c = 0;
      while(true) {
         String toTest = schemes[a].concat(domains[b]).concat(port).concat(paths[c]);
         assertTrue(urlVal.isValid(toTest));
         if(a == 5) {
            if(b == 3){
               if(c == 3){
                  break;
               }
               c = c + 1;
            }else {
               b = b + 1;
            }
         }else {
            a = a + 1;
         }
      }
   }
   
   public void testYourSecondPartition(){
		 //You can use this function to implement your Second Partition testing	   
 UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      //Testing tildas
      String[] schemes = { 
         "http://",
         "https://",
         "ftp://",
         "h3t://",
         "data://",
         ""
      };
      String[] domains = {
         "www.google.com",
         "people.oregonstate.edu",
         "go.com",
         "255.255.255.255"
      };
      String[] port = {
         ":80",
         ""
      };

      String path = "/~test";
      int a = 0, b = 0, c = 0;
      while(true) {
         String toTest = schemes[a].concat(domains[b]).concat(port[c]).concat(path);
         assertTrue(urlVal.isValid(toTest));
         if(a == 5) {
            if(b == 3){
               if(c == 2){
                  break;
               }
               c = c + 1;
            }else {
               b = b + 1;
            }
         }else {
            a = a + 1;
         }
      }
   }
   //You need to create more test cases for your Partitions if you need to 
    public void testYourThirdPartition(){
      UrlValidator urlVal = new UrlValidator(null, null,  UrlValidator.ALLOW_ALL_SCHEMES); 
      // testing file uris  
      String scheme = "file://";
      String[] host = {
         "",
         "test",
         "localhost",
         "123"
      };
      String[] path = {
         "/c:/WINDOWS/clock.avi",
         "/file.gpg",
         "/folder/otherfolder/file",
         "/path/to/the%20file.txt"
      };
      int a = 0, b = 0;
      while(true) {
         String toTest = scheme.concat(host[a]).concat(path[b]);
         assertTrue(urlVal.isValid(toTest));
         if(a == 3) {
            if(b == 3){
               break;
            }else {
               b = b + 1;
            }
         }else {
            a = a + 1;
         }
      }
   }
   public void testIsValid(Object[] testObjects, long allowAllSchemes)
   {
	   //You can use this function for programming based testing
	UrlValidator urlVal = new UrlValidator(null, null,UrlValidator.ALLOW_ALL_SCHEMES); 
	   // Doing everything that isn't the bad stuff.
      String[] schemes = { 
         "http://",
         "https://",
         "ftp://",
         "h3t://",
         "data://",
         ""
      };
      String[] domains = {
         "www.google.com",
         "people.oregonstate.edu",
         "go.com",
         "255.255.255.255",
         "test",
         "localhost",
         "123"
      };
      String[] port = {
         ":80",
         ""
      };
      String[] paths = {
         "",
         "/test/",
         "/test/file",
         "/c:/WINDOWS/clock.avi",
         "/file.gpg",
         "/folder/otherfolder/file",
         "/path/to/the%20file.txt"
      };

      int a = 0, b = 0, c = 0, d = 0;
      while(true) {
         String toTest = schemes[a].concat(domains[b]).concat(port[c]).concat(paths[d]);
         assertTrue(urlVal.isValid(toTest));
         if(a == 5) {
            if(b == 6){
               if(c == 1){
                  if(d == 6){
                     break;
                  }
                  d = d + 1;
               }
               c = c + 1;
            }else {
               b = b + 1;
            }
         }else {
            a = a + 1;
         }
      }
   }
   


}