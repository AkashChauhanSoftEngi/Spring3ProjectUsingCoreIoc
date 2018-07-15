# SpringProjectWithoutAppServer

* Spring 3 + IOC (Core Container), Example
* Used BeanFactory Interface, and used XmlBeanFactory Implementation class
* When using XmlBeanFactory as Core Container and you call getBean() method then only your object is created
  not on applicationContext.xml loading time like ClassPathXmlApplicationContext().
* XmlBeanFactory is called driver class to run IOC container from main method.
* Used applicationContext.xml for defining beans
* Spring requires Spring JAR/Libraries and JDK Libraries to run an Spring based application 
* We need a driver class [XmlBeanFactory] to run Spring container[IOC], which implements BeanFactory Interface

```XML
 	<bean id="studentbean" class="com.java.spring.Student">  
    		<property name="name" value="Vimal Jaiswal"></property>  
  	</bean>
```

```java
	ClassPathResource resource = new ClassPathResource("applicationContext.xml");
 	BeanFactory factory = new XmlBeanFactory(resource);
```

> **###1. Technologies**
* Spring 3.0.1.RELEASE
