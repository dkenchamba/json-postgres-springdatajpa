CREATE SCHEMA IF NOT EXISTS dken
    AUTHORIZATION adsapps;

CREATE TABLE IF NOT EXISTS dken.paydata
(
    INSTTN_FRMFCTOR_MAP_ID uuid NOT NULL,
    MC_CLNT_ID character varying(100) NOT NULL,
    NTNL_ID_JSON json,
    FRST_NAM character varying(99),
    LST_NAM character varying(99),
    EML_ID character varying(50)
);

SELECT * FROM dken.paydata;

insert into dken.paydata values ('903f5371-038c-4bfc-8259-02a526793a42', 'XYZ-12345', 
	'{"value":"The Cipher value goes here","iv":"The IV lives here","tag":"The additional authentication tag goes here"}',
	'Deepak', 'Kenchamba','dken@dkenchamba.in'
);
