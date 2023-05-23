CREATE TABLE IF NOT EXISTS `lsa_eventos`.`Aluno Realiza Inscrição` (
  `id_aluno_inscricao` INT NOT NULL,
  `Inscrição_id_inscricao` INT NOT NULL,
  `Aluno_id_aluno` INT NOT NULL,
  PRIMARY KEY (`id_aluno_inscricao`),
  INDEX `fk_Aluno Realiza Inscrição_Inscrição1_idx` (`Inscrição_id_inscricao` ASC) VISIBLE,
  INDEX `fk_Aluno Realiza Inscrição_Aluno1_idx` (`Aluno_id_aluno` ASC) VISIBLE,
  CONSTRAINT `fk_Aluno Realiza Inscrição_Inscrição1`
    FOREIGN KEY (`Inscrição_id_inscricao`)
    REFERENCES `lsa_eventos`.`Inscrição` (`id_inscricao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Aluno Realiza Inscrição_Aluno1`
    FOREIGN KEY (`Aluno_id_aluno`)
    REFERENCES `lsa_eventos`.`Aluno` (`id_aluno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;