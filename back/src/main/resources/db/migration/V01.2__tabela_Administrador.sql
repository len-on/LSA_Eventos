CREATE TABLE IF NOT EXISTS `lsa_eventos`.`Administrador` (
  `id_adm` INT NOT NULL,
  `Usuário_id_usuario` INT NOT NULL,
  PRIMARY KEY (`id_adm`),
  INDEX `fk_Administrador_Usuário1_idx` (`Usuário_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_Administrador_Usuário1`
    FOREIGN KEY (`Usuário_id_usuario`)
    REFERENCES `lsa_eventos`.`Usuário` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;