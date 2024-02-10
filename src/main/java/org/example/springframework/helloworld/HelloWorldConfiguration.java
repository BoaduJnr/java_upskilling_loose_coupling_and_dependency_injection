package org.example.springframework.helloworld;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Address(String firstLine, String City){ }
record Person(String name, int age ,Address address){ }



@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "George";
    }
    @Bean
    public Integer age() {
        return 30;
    }

    @Bean
    public Person person(){
        return new Person("Junior", 34, new Address("Prempeh II Street", "Adum"));

    }
    @Bean
    @Primary
    public Person person2MethodCall(){
        return new Person(name(),age(), address3() );

    }
    @Bean
    public Person person3Parameters(String name, int age, @Qualifier("LagosStreetQualifier") Address address){
        return new Person(name,age, address);

    }
    @Bean("address2")
    public Address address2(){
        return new Address("13th Street", "Santasi");

    }
    @Bean()
    @Qualifier("LagosStreetQualifier")
    public Address address(){
        return new Address("Lagos Street", "East Legon");

    }
    @Bean()
    @Primary
    public Address address3(){
        return new Address("Jungle Avenue Street", "American House");

    }
}
