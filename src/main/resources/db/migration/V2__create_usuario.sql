-- Create users table (if not exists)
IF NOT EXISTS (SELECT * FROM sys.tables WHERE name = 'users' AND schema_id = SCHEMA_ID('dbo'))
BEGIN
    CREATE TABLE dbo.users (
        id BIGINT IDENTITY(1,1) PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        email VARCHAR(255) NOT NULL UNIQUE,
        company_email VARCHAR(255),
        address VARCHAR(255),
        transport_mode VARCHAR(255),
        points INT NOT NULL DEFAULT 0,
        password VARCHAR(255) NOT NULL,
        role VARCHAR(50),
        phone VARCHAR(20) NOT NULL
    );
END;

-- Create endereco table (if not exists)
IF NOT EXISTS (SELECT * FROM sys.tables WHERE name = 'endereco' AND schema_id = SCHEMA_ID('dbo'))
BEGIN
    CREATE TABLE dbo.endereco (
        id BIGINT IDENTITY(1,1) PRIMARY KEY,
        endereco VARCHAR(255),
        numero VARCHAR(50),
        cep VARCHAR(20)
    );
END;

