CREATE TABLE Setor (
    cd_setor CHAR(26) PRIMARY KEY,
    nome VARCHAR2(100) NOT NULL,
    num_funcionarios NUMBER
);

CREATE TABLE Endereco (
    cd_endereco CHAR(26) PRIMARY KEY,
    tp_logradouro VARCHAR2(50),
    logradouro VARCHAR2(150),
    numero VARCHAR2(10),
    bairro VARCHAR2(100),
    cep VARCHAR2(15)
);

CREATE TABLE Funcionario (
    cd_funcionario CHAR(26) PRIMARY KEY,
    nome VARCHAR2(150) NOT NULL,
    cd_setor CHAR(26),
    cd_endereco CHAR(26),
    pontos NUMBER DEFAULT 0,
    nvl_acesso NUMBER DEFAULT 1,
    CONSTRAINT fk_func_setor FOREIGN KEY (cd_setor) REFERENCES Setor(cd_setor),
    CONSTRAINT fk_func_endereco FOREIGN KEY (cd_endereco) REFERENCES Endereco(cd_endereco)
);

CREATE TABLE Telefone (
    cd_telefone CHAR(26) PRIMARY KEY,
    cd_funcionario CHAR(26) NOT NULL,
    ddi VARCHAR2(5),
    ddd VARCHAR2(5),
    numero VARCHAR2(20),
    CONSTRAINT fk_tel_func FOREIGN KEY (cd_funcionario) REFERENCES Funcionario(cd_funcionario)
);

CREATE TABLE Desafio (
    cd_desafio CHAR(26) PRIMARY KEY,
    nome VARCHAR2(150) NOT NULL,
    desc_desafio CLOB,
    pontos NUMBER NOT NULL
);

CREATE TABLE FuncionarioDesafio (
    cd_funcionario CHAR(26) NOT NULL,
    cd_desafio CHAR(26) NOT NULL,
    data_atribuicao DATE DEFAULT SYSDATE,
    status VARCHAR2(30),
    CONSTRAINT pk_func_desafio PRIMARY KEY (cd_funcionario, cd_desafio),
    CONSTRAINT fk_funcdes_func FOREIGN KEY (cd_funcionario) REFERENCES Funcionario(cd_funcionario),
    CONSTRAINT fk_funcdes_desafio FOREIGN KEY (cd_desafio) REFERENCES Desafio(cd_desafio)
);