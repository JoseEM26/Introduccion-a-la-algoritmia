-- Crear la base de datos y utilizarla
CREATE DATABASE IF NOT EXISTS ExploraPeru;
USE ExploraPeru;

-- Crear tabla Roles
CREATE TABLE IF NOT EXISTS Roles (
    id_rol INT AUTO_INCREMENT PRIMARY KEY,
    nombre_rol VARCHAR(50) NOT NULL
);

-- Insertar datos en la tabla Roles
INSERT INTO Roles (nombre_rol) VALUES ('Usuario');
INSERT INTO Roles (nombre_rol) VALUES ('Administrador');

-- Crear tabla Usuarios (después de Roles)
CREATE TABLE IF NOT EXISTS Usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    contraseña VARCHAR(255) NOT NULL,
    id_rol INT NOT NULL,
    fecha_creacion DATE NOT NULL,
    fecha_cumpleaños DATE,
    img TEXT,
    FOREIGN KEY (id_rol) REFERENCES Roles(id_rol)
);

-- Insertar datos en la tabla Usuarios
INSERT INTO Usuarios (nombre_usuario, email, contraseña, id_rol, fecha_creacion, fecha_cumpleaños, img)
VALUES 
('Juan Pérez', 'juan.perez@gmail.com', 'contrasena123', 1, '2024-12-01', '1990-06-15', 'https://images.pexels.com/photos/2379004/pexels-photo-2379004.jpeg?auto=compress&cs=tinysrgb&w=600'),
('Ana López', 'ana.lopez@hotmail.com', 'contrasena456', 1, '2024-12-01', '1988-04-20', 'https://images.pexels.com/photos/774909/pexels-photo-774909.jpeg?auto=compress&cs=tinysrgb&w=600'),
('Carlos Díaz', 'carlos.diaz@gmail.com', 'contrasena789', 1, '2024-12-01', '1995-12-25', 'https://images.pexels.com/photos/6801642/pexels-photo-6801642.jpeg?auto=compress&cs=tinysrgb&w=600'),
('María García', 'maria.garcia@gmail.com', 'admin12345', 2, '2024-12-01', '1985-03-10', 'https://images.pexels.com/photos/415829/pexels-photo-415829.jpeg?auto=compress&cs=tinysrgb&w=600'),
('Pedro Fernández', 'pedro.fernandez@hotmail.com', 'admin54321', 2, '2024-12-01', '1992-07-18', 'https://images.pexels.com/photos/697509/pexels-photo-697509.jpeg?auto=compress&cs=tinysrgb&w=600');

-- Crear tabla CLIENTES
CREATE TABLE IF NOT EXISTS CLIENTES (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre_cliente VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    telefono VARCHAR(15) NOT NULL
);

-- Crear tabla ALOJAMIENTO
CREATE TABLE IF NOT EXISTS ALOJAMIENTO (
    id_alojamiento INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    ubicacion VARCHAR(150) NOT NULL,
    tipo ENUM('Hotel', 'Casa vacacional', 'Lodge') NOT NULL,
    precio_noche DECIMAL(10, 2) NOT NULL,
    disponible ENUM('Sí', 'No') NOT NULL,
    capacidad INT NOT NULL
);

-- Crear tabla RESERVAS_ALOJAMIENTO
CREATE TABLE IF NOT EXISTS RESERVAS_ALOJAMIENTO (
    id_reserva INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    id_alojamiento INT NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    cantidad_personas INT NOT NULL,
    total DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES CLIENTES(id_cliente),
    FOREIGN KEY (id_alojamiento) REFERENCES ALOJAMIENTO(id_alojamiento)
);

-- Crear tabla VUELOS
CREATE TABLE IF NOT EXISTS VUELOS (
    id_vuelo INT AUTO_INCREMENT PRIMARY KEY,
    origen VARCHAR(100) NOT NULL,
    destino VARCHAR(100) NOT NULL,
    fecha_salida DATE NOT NULL,
    fecha_llegada DATE NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    plazas_disponibles INT NOT NULL
);

-- Crear tabla RESERVAS_VUELOS
CREATE TABLE IF NOT EXISTS RESERVAS_VUELOS (
    id_reserva INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    id_vuelo INT NOT NULL,
    cantidad_pasajeros INT NOT NULL,
    total DECIMAL(10, 2) NOT NULL,
    FOREIGN KEY (id_cliente) REFERENCES CLIENTES(id_cliente),
    FOREIGN KEY (id_vuelo) REFERENCES VUELOS(id_vuelo)
);

-- Crear tabla TarjetasVisa
CREATE TABLE IF NOT EXISTS TarjetasVisa (
    numeroTarjeta CHAR(16) PRIMARY KEY,
    fechaValidacion DATE,
    CVV CHAR(3),
    nombreTitular VARCHAR(100)
);

-- Crear tabla Auditoria_Accesos
CREATE TABLE IF NOT EXISTS Auditoria_Accesos (
    id_acceso INT AUTO_INCREMENT PRIMARY KEY,
    id_usuario INT NOT NULL,
    ip_acceso VARCHAR(50) NOT NULL,
    fecha_acceso DATE NOT NULL,
    FOREIGN KEY (id_usuario) REFERENCES Usuarios(id_usuario)
);

-- Crear tabla CONTACTANOS
CREATE TABLE IF NOT EXISTS CONTACTANOS (
    idcontacto INT AUTO_INCREMENT PRIMARY KEY,
    nombreContacto VARCHAR(50),
    emailContacto VARCHAR(50),
    numeroContacto CHAR(9),
    mensajeContacto TEXT
);

-- Inserciones en la tabla CONTACTANOS
INSERT INTO CONTACTANOS (nombreContacto, emailContacto, numeroContacto, mensajeContacto)
VALUES 
('Juan Pérez', 'juan.perez@example.com', '987654321', 'Hola, me interesa obtener más información sobre sus servicios.'),
('María López', 'maria.lopez@example.com', '912345678', 'Tengo una consulta sobre el estado de mi pedido.'),
('Carlos Gómez', 'carlos.gomez@example.com', '998877665', 'Quisiera saber si tienen descuentos para grupos grandes.'),
('Ana Martínez', 'ana.martinez@example.com', '911223344', '¿Cómo puedo actualizar mis datos en su sistema?'),
('Luis Torres', 'luis.torres@example.com', '933112233', 'Estoy interesado en colaborar con su empresa, ¿cómo puedo contactarlos formalmente?');

-- Consultas SELECT
SELECT * FROM CONTACTANOS;
SELECT * FROM Roles;
SELECT * FROM Usuarios;
SELECT * FROM Usuarios WHERE email = 'juan.perez@gmail.com' AND contraseña = 'contrasena123';
