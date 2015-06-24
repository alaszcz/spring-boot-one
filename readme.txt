The goal for this project is to create a simple Spring Web app equivalent to spring-mvc-java-based-config project
with following features:
- starting on Jetty
- embedded database
- connect to database via JDBC
- logback logging
- profiling towards different environments
- xml free app
- with custom setup of servlet (but still no web.xml)

In current (1.2.3) spring-boot release there are issues with using JSP. It's supported only with Tomcat
and with some circustances (must be executable war not jar). See this project for more details:
https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-web-jsp 