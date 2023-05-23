CREATE TABLE IF NOT EXISTS `lsa_eventos`.`Evento` (
  `id_evento` INT NOT NULL,
  `data_evento` DATE NOT NULL,
  `horario_evento` TIME NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `duracao_evento` VARCHAR(45) NOT NULL,
  `nome_evento` VARCHAR(45) NULL,
  PRIMARY KEY (`id_evento`))
ENGINE = InnoDB;