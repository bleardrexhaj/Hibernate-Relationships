package com.relationships.demo;

import com.relationships.domain.OneToMany.Address;
import com.relationships.domain.OneToMany.User;
import com.relationships.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoApplication {

    @Autowired
    UserService userService;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "context/applicationContext.xml");
        applicationContext.getBean(DemoApplication.class).mainInternal(applicationContext);
    }

    private void mainInternal(ApplicationContext applicationContext) {
        User u = new User();
        Address address = new Address();

        u.addAddress(address);

        u.setFirstName("Bleard");

        userService.save(u);

        for (User j:userService.findAllJobs(1L)) {
            System.out.println(j.getFirstName());
        }
    }

}
