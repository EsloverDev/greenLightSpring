CREATE DATABASE ecolegado;

USE ecolegado;

CREATE TABLE rol (
	id TINYINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL
);

CREATE TABLE tipo_documento (
	id SMALLINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    sigla VARCHAR(8) NOT NULL
);

CREATE TABLE tipo_material (
	id SMALLINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(11) NOT NULL
);

CREATE TABLE localidad (
	id SMALLINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(15) NOT NULL
);

CREATE TABLE persona (
	id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    apellido VARCHAR(40) NOT NULL,
    correo_electronico VARCHAR(40) NOT NULL,
    clave VARCHAR(30),
    numero_documento VARCHAR(40) NOT NULL,
    rol_id TINYINT,
    documento_id SMALLINT,
    FOREIGN KEY (rol_id) REFERENCES rol(id),
    FOREIGN KEY (documento_id) REFERENCES tipo_documento(id)
);

CREATE TABLE capacitacion (
	id SMALLINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    ruta_capacitacion VARCHAR(40) NOT NULL,
    persona_id INT,
    FOREIGN KEY (persona_id) REFERENCES persona(id)
);

CREATE TABLE barrio (
	id SMALLINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(40) NOT NULL,
    localidad_id SMALLINT,
    FOREIGN KEY (localidad_id) REFERENCES localidad(id)
);

CREATE TABLE solicitud (
	id INT AUTO_INCREMENT PRIMARY KEY,
    direccion VARCHAR(50) NOT NULL,
    telefono VARCHAR(13) NOT NULL,
    barrio_id SMALLINT,
    persona_solicita_id INT,
    persona_recolecta_id INT,
    persona_almacenista_id INT,
    FOREIGN KEY (barrio_id) REFERENCES barrio(id),
    FOREIGN KEY (persona_solicita_id) REFERENCES persona(id),
    FOREIGN KEY (persona_recolecta_id) REFERENCES persona(id),
    FOREIGN KEY (persona_almacenista_id) REFERENCES persona(id)
);

CREATE TABLE calificacion (
	id INT AUTO_INCREMENT PRIMARY KEY,
    calificacion_solicitud TINYINT,
    fecha_calificacion_solicitud DATE,
    calificacion_recolector TINYINT,
    fecha_calificacion_recolector DATE,
    observacion_solicitud VARCHAR(250),
    observacion_recoleccion VARCHAR(250),
    solicitud_id INT,
    FOREIGN KEY (solicitud_id) REFERENCES solicitud(id)
);

CREATE TABLE embalaje (
	id TINYINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(11) NOT NULL,
    tipo_material_id SMALLINT,
    FOREIGN KEY (tipo_material_id) REFERENCES tipo_material(id)
);

CREATE TABLE detalle_solicitud (
	id INT AUTO_INCREMENT PRIMARY KEY,
    peso_material TINYINT NOT NULL,
    solicitud_id INT,
    embalaje_id TINYINT,
    FOREIGN KEY (solicitud_id) REFERENCES solicitud(id),
    FOREIGN KEY (embalaje_id) REFERENCES embalaje(id)
);