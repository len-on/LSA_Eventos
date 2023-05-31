CREATE TABLE IF NOT EXISTS `lsa_eventos`.`participante_realiza_inscricao` (
  `id_participante_inscricao` INT NOT NULL,
  `inscricao_id_inscricao` INT NOT NULL,
  `participante_id_participante` INT NOT NULL,
  PRIMARY KEY (`id_participante_inscricao`),
  INDEX `fk_participante_realiza_inscricao_inscricao1_idx` (`inscricao_id_inscricao` ASC) VISIBLE,
  INDEX `fk_participante_realiza_inscricao_participante_idx` (`participante_id_participante` ASC) VISIBLE,
  CONSTRAINT `fk_participante_realiza_inscricao_inscricao`
    FOREIGN KEY (`inscricao_id_inscricao`)
    REFERENCES `lsa_eventos`.`inscricao` (`id_inscricao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_participante_realiza_inscricao_participante`
    FOREIGN KEY (`participante_id_participante`)
    REFERENCES `lsa_eventos`.`participante` (`id_participante`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;