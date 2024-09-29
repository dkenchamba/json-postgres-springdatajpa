package in.dkenchamba.postgres_json_jpa.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import in.dkenchamba.postgres_json_jpa.entity.Paydata;

public interface PaydataRepository extends JpaRepository<Paydata, UUID> {
	// Do Nothing
}
