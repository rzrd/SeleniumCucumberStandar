# How To Runing the Test:
1. Clone the repository
2. Open the project with your IDEA (e.g IntelliJ, Eclipse)
3. make sure your browser (Chrome / Firefox) is updated.
4. open conf.properties file
5. set browser for which browser used
6. isHeadless "yes" for running test with headless browser or "no" for non headless test
7. closeBrowser "yes" for automatic close browser when test finished
8. takeScreenshot "yes" for taking screenshot whenever testcase failed. the screenshot will bee attached in test report.
9. open testRunner file in src/test/java/runner/testRunner.java
10. and run the testRunner file.
11. after the test finished we can see a set of test report (extentReport, HTML, JSON, Pretty, usage, and Junit) at /Target folder. 
