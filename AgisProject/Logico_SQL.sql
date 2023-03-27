/* Logico_Final: */

CREATE TABLE Aluno (
    Nome CHARACTER,
    ID_Aluno NUMERIC PRIMARY KEY,
    fk_Turma_ID_turma NUMERIC
);

CREATE TABLE Escola (
    ID_Escola NUMERIC PRIMARY KEY,
    Nome CHARACTER
);

CREATE TABLE Turma (
    ID_turma NUMERIC PRIMARY KEY,
    Ano_letivo CHARACTER,
    fk_Escola_ID_Escola NUMERIC
);

CREATE TABLE Diciplina (
    Materia CHARACTER,
    ID_diciplina NUMERIC PRIMARY KEY
);

CREATE TABLE Atividades (
    Data DATE,
    ID_atividade NUMERIC PRIMARY KEY,
    Tipo CHARACTER,
    Nota NUMERIC
);

CREATE TABLE Turma_Diciplina (
    fk_Diciplina_ID_diciplina NUMERIC,
    fk_Turma_ID_turma NUMERIC
);

CREATE TABLE Turma_Atividades (
    fk_Turma_ID_turma NUMERIC,
    fk_Atividades_ID_atividade NUMERIC
);

CREATE TABLE Aluno_Atividades (
    fk_Aluno_ID_Aluno NUMERIC,
    fk_Atividades_ID_atividade NUMERIC
);
 
ALTER TABLE Aluno ADD CONSTRAINT FK_Aluno_2
    FOREIGN KEY (fk_Turma_ID_turma)
    REFERENCES Turma (ID_turma)
    ON DELETE RESTRICT;
 
ALTER TABLE Turma ADD CONSTRAINT FK_Turma_2
    FOREIGN KEY (fk_Escola_ID_Escola)
    REFERENCES Escola (ID_Escola)
    ON DELETE RESTRICT;
 
ALTER TABLE Turma_Diciplina ADD CONSTRAINT FK_Turma_Diciplina_1
    FOREIGN KEY (fk_Diciplina_ID_diciplina)
    REFERENCES Diciplina (ID_diciplina)
    ON DELETE RESTRICT;
 
ALTER TABLE Turma_Diciplina ADD CONSTRAINT FK_Turma_Diciplina_2
    FOREIGN KEY (fk_Turma_ID_turma)
    REFERENCES Turma (ID_turma)
    ON DELETE RESTRICT;
 
ALTER TABLE Turma_Atividades ADD CONSTRAINT FK_Turma_Atividades_1
    FOREIGN KEY (fk_Turma_ID_turma)
    REFERENCES Turma (ID_turma)
    ON DELETE RESTRICT;
 
ALTER TABLE Turma_Atividades ADD CONSTRAINT FK_Turma_Atividades_2
    FOREIGN KEY (fk_Atividades_ID_atividade)
    REFERENCES Atividades (ID_atividade)
    ON DELETE RESTRICT;
 
ALTER TABLE Aluno_Atividades ADD CONSTRAINT FK_Aluno_Atividades_1
    FOREIGN KEY (fk_Aluno_ID_Aluno)
    REFERENCES Aluno (ID_Aluno)
    ON DELETE RESTRICT;
 
ALTER TABLE Aluno_Atividades ADD CONSTRAINT FK_Aluno_Atividades_2
    FOREIGN KEY (fk_Atividades_ID_atividade)
    REFERENCES Atividades (ID_atividade)
    ON DELETE RESTRICT;