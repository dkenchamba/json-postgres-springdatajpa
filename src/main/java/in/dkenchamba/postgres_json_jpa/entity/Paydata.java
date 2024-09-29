package in.dkenchamba.postgres_json_jpa.entity;

import java.util.UUID;

import org.hibernate.annotations.Type;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "Paydata")
@ToString
public class Paydata {

	@Id
	@Column(name = "INSTTN_FRMFCTOR_MAP_ID", columnDefinition = "uuid")
	private UUID payDataId;

	@Column(name = "MC_CLNT_ID")
	private String mcClientId;

	@Type(JsonType.class)
	@Column(name = "NTNL_ID_JSON", columnDefinition = "json")
	private String nationIdJson;

	@Column(name = "FRST_NAM")
	private String firstName;

	@Column(name = "LST_NAM")
	private String lastName;

	@Column(name = "EML_ID")
	private String emailId;

}
