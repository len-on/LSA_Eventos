CREATE TABLE IF NOT EXISTS `lsa_eventos`.`Adm Gerencia Evento` (
  `id_adm_evento` INT NOT NULL,
  `Evento_id_evento` INT NOT NULL,
  `Administrador_id_adm` INT NOT NULL,
  PRIMARY KEY (`id_adm_evento`),
  INDEX `fk_Adm Gerencia Evento_Evento1_idx` (`Evento_id_evento` ASC) VISIBLE,
  INDEX `fk_Adm Gerencia Evento_Administrador1_idx` (`Administrador_id_adm` ASC) VISIBLE,
  CONSTRAINT `fk_Adm Gerencia Evento_Evento1`
    FOREIGN KEY (`Evento_id_evento`)
    REFERENCES `lsa_eventos`.`Evento` (`id_evento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Adm Gerencia Evento_Administrador1`
    FOREIGN KEY (`Administrador_id_adm`)
    REFERENCES `lsa_eventos`.`Administrador` (`id_adm`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;