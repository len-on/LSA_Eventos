CREATE TABLE IF NOT EXISTS `lsa_eventos`.`Aluno` (
  `id_aluno` INT NOT NULL,
  `turma` VARCHAR(45) NULL,
  `Usuário_id_usuario` INT NOT NULL,
  PRIMARY KEY (`id_aluno`),
  INDEX `fk_Aluno_Usuário1_idx` (`Usuário_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_Aluno_Usuário1`
    FOREIGN KEY (`Usuário_id_usuario`)
    REFERENCES `lsa_eventos`.`Usuário` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;