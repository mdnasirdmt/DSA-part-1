package com.masai;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.masai.model.User;
import com.masai.userRepo.UserRepository;

@SpringBootApplication
public class SpringDataJpaPracticeApplication implements CommandLineRunner {

	@Autowired
	UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ArrayList<User> al = new ArrayList<>();

		User u1 = new User(1, "Nasir");
		User u2 = new User(2, "Amit");
		User u3 = new User(3, "Gupta");

		al.add(u1);
		al.add(u2);
		al.add(u3);

		repository.saveAll(al);

		Optional<User> record = repository.findById(1);

		// get one record by id
		record.stream().forEach(s -> {
			System.out.println(s.id + " " + s.name);

		});

		// get list of record
		List<User> list = repository.findAll();

		list.stream().forEach(r -> {
			System.out.println(r.id + " " + r.name);
		});

	}

}
