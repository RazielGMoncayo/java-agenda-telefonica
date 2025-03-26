# 📱 Agendrix - Gestor de Contactos Avanzado

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![Version](https://img.shields.io/badge/Version-1.0.0-yellow)

## 🌟 Descripción General
Agendrix es una aplicación de gestión de contactos desarrollada en Java que permite administrar tu agenda personal de manera eficiente con una interfaz intuitiva basada en menús.

## 🚀 Características Principales

### 🔧 Configuración Inicial
- **Modo personalizado**: Define tu propio límite de contactos
- **Inicio rápido**: Configuración predeterminada con capacidad para 10 contactos

### 📋 Funcionalidades Completas

#### 1️⃣ Listar Contactos
- Visualización completa de todos los contactos almacenados
- Muestra formato: Nombre + Apellidos + Teléfono
- Indicador de agenda vacía cuando no hay contactos

#### 2️⃣ Agregar Contacto
- Registro con:
    - Nombre (obligatorio)
    - Apellidos (obligatorio)
    - Número telefónico
- Validación anti-duplicados
- Control de capacidad máxima

#### 3️⃣ Eliminar Contacto
- Búsqueda por nombre y apellidos
- Eliminación inmediata con confirmación visual
- Manejo de errores para contactos no encontrados

#### 4️⃣ Modificar Contacto
- Actualización de todos los campos:
    - Nuevo nombre
    - Nuevos apellidos
    - Nuevo teléfono
- Búsqueda previa para selección

#### 5️⃣ Buscar Contacto
- Opciones de búsqueda:
    - 🔍 Por nombre y apellidos (no sensible a mayúsculas)
    - 📞 Por número telefónico (búsqueda exacta)
- Resultados detallados con toda la información

## ⚙️ Requisitos Técnicos
- **JDK 17** o superior
- Terminal/consola para ejecución

## 🛠️ Estructura del Código
```plaintext
src/
└── main/
    └── java/
        └── com/
            └── generation/
                └── ejercicio/
                    └── informacion/
                        ├── Main.java         # Menú principal
                        ├── Agenda.java        # Lógica de negocio
                        └── Contacto.java      # Modelo de datos