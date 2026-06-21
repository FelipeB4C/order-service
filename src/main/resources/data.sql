-- This script will be automatically executed by Spring Boot when the application starts
-- (typically in development/test profiles).

INSERT INTO tb_products (name, current_price) VALUES ('Laptop Pro X', 1299.99) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Smartphone Ultra', 899.00) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Wireless Headphones', 199.50) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Smartwatch Series 7', 349.99) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Gaming Mouse RGB', 75.25) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Mechanical Keyboard', 120.00) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('External SSD 1TB', 150.75) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('USB-C Hub 7-in-1', 45.99) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Portable Bluetooth Speaker', 89.90) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('E-Reader Paperwhite', 139.00) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Tablet Air 10.9', 599.00) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Drone Explorer 4K', 799.99) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Action Camera Pro', 299.00) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Robot Vacuum Cleaner', 450.50) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price) VALUES ('Coffee Maker Deluxe', 110.00) ON CONFLICT (name) DO NOTHING;