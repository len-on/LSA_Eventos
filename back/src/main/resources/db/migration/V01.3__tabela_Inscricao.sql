CREATE TABLE IF NOT EXISTS `lsa_eventos`.`inscricao` (
  `id_inscricao` INT NOT NULL,
  `horario_inscricao` TIME NOT NULL,
  `data_inscricao` DATE NOT NULL,
  `num_inscricao` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_inscricao`))
ENGINE = InnoDB;