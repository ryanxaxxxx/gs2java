-- Baseline migration - ensures schema exists
-- This migration is safe to run multiple times
IF NOT EXISTS (SELECT * FROM sys.schemas WHERE name = 'dbo')
BEGIN
    EXEC('CREATE SCHEMA dbo')
END;