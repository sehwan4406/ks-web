package com.sehwan.app;

import com.sehwan.app.entity.*;
import com.sehwan.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner  {

	private final SocialMediaRepository socialMediaRepository;
	private final PersonRepository personRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(SocialMediaRepository socialMediaRepository, PersonRepository personRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository) {
		this.socialMediaRepository = socialMediaRepository;
		this.personRepository = personRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("홍길동", "데이터 분석", "hello@test.com", "010-1234-5678"));

		socialMediaRepository.save(new SocialMedia("","hong","","hong"));
		interestsRepository.save(new Interests("동물의 숲"));
		interestsRepository.save(new Interests("LoL"));
		interestsRepository.save(new Interests("FF7"));

		skillRepository.save(new Skill("Java", 100));
		skillRepository.save(new Skill("Kotlin", 70));
		skillRepository.save(new Skill("JS(>=ES6)", 50));
		skillRepository.save(new Skill("Go", 30));
		skillRepository.save(new Skill("Haskell", 90));

		workRepository.save(new Work("개발자", "우리회사", "2017~2020", "호호호!"));
		workRepository.save(new Work("개발자", "우리회사", "2017~2020", "호호호!"));
		workRepository.save(new Work("개발자", "우리회사", "2017~2020", "호호호!"));
		workRepository.save(new Work("개발자", "우리회사", "2017~2020", "호호호!"));workRepository.save(new Work("개발자", "우리회사", "2017~2020", "호호호!"));
		workRepository.save(new Work("개발자", "우리회사", "2017~2020", "호호호!"));



	}
}