# spring-jpa-without-spring-boot
Simple spring jpa usage without spring boot

## build as a jar
Be sure to have maven.

`make build`

## run postgres instance
Be sure to have docker.

`make run-postgres`

## run the app

`make run`

Issue:
```
❯ make run  
java -jar target/TestSpringJPA-1.0.jar
Rectangle[length=4.6, width=7.7]
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
Exception in thread "main" org.springframework.beans.factory.BeanDefinitionStoreException: Failed to read candidate component class: URL [jar:file:/home/alexis/Downloads/Tutorial-SpringORMwithDataJPA/target/TestSpringJPA-1.0.jar!/fr/alexisvisco/testspringjpa/main/SpringDataJPAMain.class]; nested exception is org.springframework.core.NestedIOException: ASM ClassReader failed to parse class file - probably due to a new Java class file version that isn't supported yet: URL [jar:file:/home/alexis/Downloads/Tutorial-SpringORMwithDataJPA/target/TestSpringJPA-1.0.jar!/fr/alexisvisco/testspringjpa/main/SpringDataJPAMain.class]; nested exception is java.lang.IllegalArgumentException: Unsupported class file major version 60
        at org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider.scanCandidateComponents(ClassPathScanningCandidateComponentProvider.java:452)
        at org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider.findCandidateComponents(ClassPathScanningCandidateComponentProvider.java:315)
        at org.springframework.context.annotation.ClassPathBeanDefinitionScanner.doScan(ClassPathBeanDefinitionScanner.java:276)
        at org.springframework.context.annotation.ComponentScanBeanDefinitionParser.parse(ComponentScanBeanDefinitionParser.java:90)
        at org.springframework.beans.factory.xml.NamespaceHandlerSupport.parse(NamespaceHandlerSupport.java:74)
        at org.springframework.beans.factory.xml.BeanDefinitionParserDelegate.parseCustomElement(BeanDefinitionParserDelegate.java:1391)
        at org.springframework.beans.factory.xml.BeanDefinitionParserDelegate.parseCustomElement(BeanDefinitionParserDelegate.java:1371)
        at org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.parseBeanDefinitions(DefaultBeanDefinitionDocumentReader.java:179)
        at org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.doRegisterBeanDefinitions(DefaultBeanDefinitionDocumentReader.java:149)
        at org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.registerBeanDefinitions(DefaultBeanDefinitionDocumentReader.java:96)
        at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.registerBeanDefinitions(XmlBeanDefinitionReader.java:511)
        at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.doLoadBeanDefinitions(XmlBeanDefinitionReader.java:391)
        at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:338)
        at org.springframework.beans.factory.xml.XmlBeanDefinitionReader.loadBeanDefinitions(XmlBeanDefinitionReader.java:310)
        at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:188)
        at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:224)
        at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:195)
        at org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions(AbstractBeanDefinitionReader.java:257)
        at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:128)
        at org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions(AbstractXmlApplicationContext.java:94)
        at org.springframework.context.support.AbstractRefreshableApplicationContext.refreshBeanFactory(AbstractRefreshableApplicationContext.java:130)
        at org.springframework.context.support.AbstractApplicationContext.obtainFreshBeanFactory(AbstractApplicationContext.java:638)
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:523)
        at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:144)
        at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:85)
        at fr.alexisvisco.testspringjpa.main.SpringDataJPAMain.main(SpringDataJPAMain.java:18)
Caused by: org.springframework.core.NestedIOException: ASM ClassReader failed to parse class file - probably due to a new Java class file version that isn't supported yet: URL [jar:file:/home/alexis/Downloads/Tutorial-SpringORMwithDataJPA/target/TestSpringJPA-1.0.jar!/fr/alexisvisco/testspringjpa/main/SpringDataJPAMain.class]; nested exception is java.lang.IllegalArgumentException: Unsupported class file major version 60
        at org.springframework.core.type.classreading.SimpleMetadataReader.getClassReader(SimpleMetadataReader.java:60)
        at org.springframework.core.type.classreading.SimpleMetadataReader.<init>(SimpleMetadataReader.java:49)
        at org.springframework.core.type.classreading.SimpleMetadataReaderFactory.getMetadataReader(SimpleMetadataReaderFactory.java:103)
        at org.springframework.core.type.classreading.CachingMetadataReaderFactory.getMetadataReader(CachingMetadataReaderFactory.java:123)
        at org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider.scanCandidateComponents(ClassPathScanningCandidateComponentProvider.java:429)
        ... 25 more
Caused by: java.lang.IllegalArgumentException: Unsupported class file major version 60
        at org.springframework.asm.ClassReader.<init>(ClassReader.java:196)
        at org.springframework.asm.ClassReader.<init>(ClassReader.java:177)
        at org.springframework.asm.ClassReader.<init>(ClassReader.java:163)
        at org.springframework.asm.ClassReader.<init>(ClassReader.java:284)
        at org.springframework.core.type.classreading.SimpleMetadataReader.getClassReader(SimpleMetadataReader.java:57)
        ... 29 more
make: *** [Makefile:8: run] Error 1

```
