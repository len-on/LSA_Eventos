CREATE TABLE IF NOT EXISTS `lsa_eventos`.`usuario` (
  `id_usuario` INT NOT NULL,
  `nome_usuario` VARCHAR(100) NOT NULL,
  `senha_usuario` VARCHAR(45) NOT NULL,
  `CPF_usuario` VARCHAR(45) NOT NULL,
  `email_usuario` VARCHAR(45) NOT NULL,
  `data_nascimento_usuario` DATE NOT NULL,
  PRIMARY KEY (`id_usuario`))
ENGINE = InnoDB;
