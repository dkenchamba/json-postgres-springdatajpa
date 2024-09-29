package in.dkenchamba.postgres_json_jpa.repository;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import in.dkenchamba.postgres_json_jpa.entity.Paydata;

@SpringBootTest
class PaydataRepositoryTest {

	@Autowired
	PaydataRepository paydataRepo;

	@Test
	void test() {

		Paydata paydataRec = new Paydata();
		paydataRec.setPayDataId(UUID.randomUUID());
		paydataRec.setMcClientId("XYZ-12345");
		paydataRec.setNationIdJson(
				"{\"value\":\"The Cipher value goes here\",\"iv\":\"The IV lives here\",\"tag\":\"The additional authentication tag goes here\"}");
		paydataRec.setFirstName("Deepak");
		paydataRec.setLastName("Kenchamba");
		paydataRec.setEmailId("dken@dken.in");

		Paydata savedPaydata = paydataRepo.save(paydataRec);
		System.out.println("savedPaydata: " + savedPaydata);
		Assert.notNull(savedPaydata, "Insertion has failed");
	}

}
