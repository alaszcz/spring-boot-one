The goal for this project is to create a simple Spring Web app equivalent to spring-mvc-java-based-config project
with following features:
- starting on Jetty - JSP tag libraries not supported in current version of Spring Boot when running on Jetty
- embedded database - DONE
- connect to database via JDBC - DONE
- logback logging - DONE
- profiling towards different environments - DONE
- xml free app - DONE
- with custom setup of servlet (but still no web.xml) - DONE

In current (1.2.3) spring-boot release there are issues with using JSP. It's supported only with Tomcat
and with some circustances (must be executable war not jar). 
http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#boot-features-jsp-limitations
See this project for more details:
https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-web-jsp 

Some info about how to setup DB via JNDI. However it does not work.
http://stackoverflow.com/questions/24941829/how-to-create-jndi-context-in-spring-boot-with-embedded-tomcat-container