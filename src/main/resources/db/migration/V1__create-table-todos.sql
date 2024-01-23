CREATE TABLE todos (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    nome TEXT NOT NULL,
    descricao TEXT NOT NULL,
    realizado BOOLEAN NOT NULL,
    prioridade INTEGER NOT NULL
);