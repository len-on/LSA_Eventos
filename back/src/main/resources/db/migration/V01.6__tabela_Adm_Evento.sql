CREATE TABLE IF NOT EXISTS `lsa_eventos`.`adm_gerencia_evento` (
  `id_adm_evento` INT NOT NULL,
  `evento_id_evento` INT NOT NULL,
  `administrador_id_adm` INT NOT NULL,
  PRIMARY KEY (`id_adm_evento`),
  INDEX `fk_adm_gerencia_evento_evento_idx` (`evento_id_evento` ASC) VISIBLE,
  INDEX `fk_adm_gerencia_evento_administrador_idx` (`administrador_id_adm` ASC) VISIBLE,
  CONSTRAINT `fk_adm_gerencia_evento_evento`
    FOREIGN KEY (`evento_id_evento`)
    REFERENCES `lsa_eventos`.`evento` (`id_evento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_adm_gerencia_evento_administradora`
    FOREIGN KEY (`administrador_id_adm`)
    REFERENCES `lsa_eventos`.`administrador` (`id_adm`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;