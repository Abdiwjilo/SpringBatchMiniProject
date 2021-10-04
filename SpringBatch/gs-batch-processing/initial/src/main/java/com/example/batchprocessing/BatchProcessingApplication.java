package com.example.batchprocessing;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class   BatchProcessingApplication implements CommandLineRunner {

	public static void main(String[] args) throws Exception {
		System.exit(SpringApplication.exit(SpringApplication.run(BatchProcessingApplication.class, args)));
	}

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job job;

	@Override
	public void run(String... args) throws Exception {
		jobLauncher.run(job, new JobParameters());
	}
}
