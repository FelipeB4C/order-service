-- This script will be automatically executed by Spring Boot when the application starts
-- (typically in development/test profiles).

INSERT INTO tb_products (name, current_price, stock) VALUES ('Laptop Pro X', 1299.99, 10) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Smartphone Ultra', 899.00, 15) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Wireless Headphones', 199.50, 25) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Smartwatch Series 7', 349.99, 12) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Gaming Mouse RGB', 75.25, 30) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Mechanical Keyboard', 120.00, 20) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('External SSD 1TB', 150.75, 18) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('USB-C Hub 7-in-1', 45.99, 40) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Portable Bluetooth Speaker', 89.90, 22) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('E-Reader Paperwhite', 139.00, 10) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Tablet Air 10.9', 599.00, 8) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Drone Explorer 4K', 799.99, 5) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Action Camera Pro', 299.00, 15) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Robot Vacuum Cleaner', 450.50, 7) ON CONFLICT (name) DO NOTHING;
INSERT INTO tb_products (name, current_price, stock) VALUES ('Coffee Maker Deluxe', 110.00, 20) ON CONFLICT (name) DO NOTHING;