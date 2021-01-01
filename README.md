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

# Run the test with command
1. You need to have Java JDK installed along with maven.
1. Clone the repository.
3. make sure your browser (Chrome / Firefox) is updated.
4. download the latest stable driver from https://chromedriver.chromium.org/downloads for chrome.
5. or https://github.com/mozilla/geckodriver/releases for firefox driver.
5. extract driver file and copy the driver to src/driver folder path.
4. open conf.properties file and set based on your need.
5. Open the command prompt and cd until the project root directory.
9. run $ mvn clean install
10. run $ mvn test
11. You can also select specific scenarios to execute using -Dcucumber.options="--tags @tag" , see list tags below.

# List Tag of the test

- @PositiveTest
- @Test1




just add note for github change "master" to "main". dont take care about this. :)
- git init
- git branch -m master
- git add .
- git commit -m "first commit"
- git remote add origin remote repository URL
- before push, makesure add .project .classpath and .settings/ to your gitignore file
- git push origin main
- if you wan to pull first, do git pull origin main --allow-unrelated-histories
