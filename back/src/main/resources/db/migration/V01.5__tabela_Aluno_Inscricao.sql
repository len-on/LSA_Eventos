CREATE TABLE IF NOT EXISTS `lsa_eventos`.`aluno_realiza_inscricao` (
  `id_aluno_inscricao` INT NOT NULL,
  `inscricao_id_inscricao` INT NOT NULL,
  `aluno_id_aluno` INT NOT NULL,
  PRIMARY KEY (`id_aluno_inscricao`),
  INDEX `fk_aluno_realiza_inscricao_inscricao1_idx` (`inscricao_id_inscricao` ASC) VISIBLE,
  INDEX `fk_aluno_realiza_inscricao_aluno_idx` (`aluno_id_aluno` ASC) VISIBLE,
  CONSTRAINT `fk_aluno_realiza_inscricao_inscricao`
    FOREIGN KEY (`inscricao_id_inscricao`)
    REFERENCES `lsa_eventos`.`inscricao` (`id_inscricao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_aluno_realiza_inscricao_aluno`
    FOREIGN KEY (`aluno_id_aluno`)
    REFERENCES `lsa_eventos`.`aluno` (`id_aluno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;