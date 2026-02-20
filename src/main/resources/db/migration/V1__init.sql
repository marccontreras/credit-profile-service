-- V1__init.sql
CREATE TABLE IF NOT EXISTS customers (
  id BIGSERIAL PRIMARY KEY,
  full_name VARCHAR(120) NOT NULL,
  credit_score INT NOT NULL CHECK (credit_score >= 300 AND credit_score <= 850),
  created_at TIMESTAMP NOT NULL DEFAULT NOW()
);

INSERT INTO customers (full_name, credit_score)
VALUES
  ('Alice Johnson', 750),
  ('Bob Smith', 680),
  ('Carla Ruiz', 720)
ON CONFLICT DO NOTHING;
