package guru.springframework.springdi;

import guru.otherframework.componentscan.OtherFrameworkController;
import guru.springframework.config.DataSourceProperties;
import guru.springframework.config.JMSConfiguration;
import guru.springframework.config.PropertiesConfig;
import guru.springframework.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"guru.springframework", "guru.otherframework"})
//@ComponentScan(basePackages = {"guru"})
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringDiApplication.class, args);


		SpringContextController springContextController = (SpringContextController) applicationContext.getBean("springContextController");
		System.out.println(springContextController.sayHello());

		System.out.println("Next - Property Injected Controller ");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) applicationContext.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("Next - Setter Injected Controller ");
		SetterInjectedController setterInjectedController = (SetterInjectedController) applicationContext.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Next - Constructor Injected Controller ");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) applicationContext.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("Next - Primary/Default Controller");
		JustAnotherController justAnotherController = (JustAnotherController) applicationContext.getBean("justAnotherController");
		System.out.println(justAnotherController.getGreeting());

		System.out.println("Next - Verifying active/default Profiles");
		I18nController i18nController = (I18nController) applicationContext.getBean("i18nController");
		System.out.println(i18nController.findGreeting());

		System.out.println("Next - Verifying Component scan via other framework component scan package");
		OtherFrameworkController otherFrameworkController = (OtherFrameworkController) applicationContext.getBean("otherFrameworkController");
		System.out.println(otherFrameworkController.getGreeting());

        DataSourceProperties dataSourceProperties = (DataSourceProperties) applicationContext.getBean("dataSourceProperties");
        System.out.println(dataSourceProperties.getUsername());
        System.out.println(dataSourceProperties.getPassword());
        System.out.println(dataSourceProperties.getDburl());

		PropertiesConfig propertiesConfig = (PropertiesConfig) applicationContext.getBean("propertiesConfig");
		System.out.println(propertiesConfig.getUsername());
		System.out.println(propertiesConfig.getPassword());
		System.out.println(propertiesConfig.getUrl());
		System.out.println(propertiesConfig.getEnvironment().getProperty("JAVA_HOME"));

		System.out.println("=====================================================================================");

		/**
		for(String beanName: applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
		**/

		System.out.println("Get JMS Properties as a different Bean from a different property file");
		JMSConfiguration jmsConfiguration = (JMSConfiguration) applicationContext.getBean("jmsConfiguration");
		System.out.println(jmsConfiguration.getUsername());
		System.out.println(jmsConfiguration.getQueueSize());

	}

}
