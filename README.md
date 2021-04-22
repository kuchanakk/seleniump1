Motivation
If you use Selenium WebDriver, you probably know that to use some browsers such as Chrome, Firefox, Edge, Opera, PhantomJS, or Internet Explorer, first you need to download the so-called driver, i.e. a binary file which allows WebDriver to handle these browsers. In Java, the path to this driver should be set as JVM properties, as follows:

System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
System.setProperty("webdriver.edge.driver", "/path/to/msedgedriver.exe");
System.setProperty("webdriver.opera.driver", "/path/to/operadriver");
System.setProperty("phantomjs.binary.path", "/path/to/phantomjs");
System.setProperty("webdriver.ie.driver", "C:/path/to/IEDriverServer.exe");
This is quite annoying since it forces you to link directly this driver into your source code. In addition, you have to check manually when new versions of the drivers are released. WebDriverManager comes to the rescue, performing in an automated way this job for you. WebDriverManager can be used in different ways:

WebDriverManager as Java dependency (typically from test cases).
WebDriverManager as Command Line Interface (CLI) tool (from the shell).
WebDriverManager as Server (using a REST-like API).
WebDriverManager as Agent (using Java instrumentation).
WebDriverManager as Container (using Docker).
WebDriverManager is open-source, released under the terms of Apache 2.0 License.

WebDriverManager as Java dependency
Basic usage
To use WebDriverManager from tests in a Maven project, you need to add the following dependency in your pom.xml (Java 8 or upper required), typically using the test scope:

<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>4.4.1</version>
    <scope>test</scope>
</dependency>
... or in Gradle project: