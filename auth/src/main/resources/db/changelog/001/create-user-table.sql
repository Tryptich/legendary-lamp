CREATE SEQUENCE IF NOT EXISTS seq_user START WITH 1 INCREMENT BY 1;

CREATE TABLE user_tag
(
    tag_id  BIGINT NOT NULL,
    user_id BIGINT NOT NULL
);

CREATE TABLE user_wallet
(
    user_id   BIGINT NOT NULL,
    wallet_id BIGINT NOT NULL
);

CREATE TABLE "user"
(
    user_id    BIGINT NOT NULL,
    login      VARCHAR(255),
    password   VARCHAR(255),
    first_name VARCHAR(255),
    last_name  VARCHAR(255),
    CONSTRAINT pk_user PRIMARY KEY (user_id)
);

ALTER TABLE user_tag
    ADD CONSTRAINT uc_user_tag_tag UNIQUE (tag_id);

ALTER TABLE user_wallet
    ADD CONSTRAINT uc_user_wallet_wallet UNIQUE (wallet_id);

ALTER TABLE user_tag
    ADD CONSTRAINT fk_user_tag_on_tag FOREIGN KEY (tag_id) REFERENCES tag (tag_id);

ALTER TABLE user_tag
    ADD CONSTRAINT fk_user_tag_on_user FOREIGN KEY (user_id) REFERENCES "user" (user_id);

ALTER TABLE user_wallet
    ADD CONSTRAINT fk_usewal_on_user FOREIGN KEY (user_id) REFERENCES "user" (user_id);

ALTER TABLE user_wallet
    ADD CONSTRAINT fk_usewal_on_wallet FOREIGN KEY (wallet_id) REFERENCES wallet (wallet_id);