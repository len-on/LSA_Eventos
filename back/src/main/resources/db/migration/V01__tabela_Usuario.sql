CREATE TABLE IF NOT EXISTS `lsa_eventos`.`Usuário` (
  `id_usuario` INT NOT NULL,
  `nome` VARCHAR(100) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  `CPF` VARCHAR(45) NOT NULL,
  `e-mail` VARCHAR(45) NOT NULL,
  `data_nascimento` DATE NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;