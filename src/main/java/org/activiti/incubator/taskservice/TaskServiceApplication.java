package org.activiti.incubator.taskservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@SpringBootApplication
public class TaskServiceApplication {

    //we create a logger to check things out in the terminal
    private static final Logger log = LoggerFactory.getLogger(TaskServiceApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(TaskServiceApplication.class, args);

        log.info("Everything OK"); //using the log for the first time in the app...

	}
}


