CREATE TABLE IF NOT EXISTS `lsa_eventos`.`aluno` (
  `id_aluno` INT NOT NULL,
  `turma_aluno` VARCHAR(45) NULL,
  `usuario_id_usuario` INT NOT NULL,
  PRIMARY KEY (`id_aluno`),
  INDEX `fk_aluno_usuario_idx` (`usuario_id_usuario` ASC) VISIBLE,
  CONSTRAINT `fk_aluno_usuario`
    FOREIGN KEY (`usuario_id_usuario`)
    REFERENCES `lsa_eventos`.`usuario` (`id_usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;