
INSERT INTO users (name, username, email, password) VALUES
('Normal User', 'user', 'user@example.com', '$2a$10$FVwVujKG9vWRxZfhmiMLdu1uh7O2F2Oszwq4Rt4y269INYwoJwlU2');

INSERT INTO users (name, username, email, password) VALUES
('Admin User', 'admin', 'admin@example.com', '$2a$10$FUBGyVsq4osVbHHS3TgP9u1XcOZLozT7gkkF1FeDrYTmymq9vSLdG');

INSERT INTO roles (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO roles (id, name) VALUES (2, 'ROLE_ADMIN');

-- User with ROLE_USER
INSERT INTO users_roles (user_id, role_id) VALUES (1, 1);

-- Admin with ROLE_ADMIN
INSERT INTO users_roles (user_id, role_id) VALUES (2, 2);
