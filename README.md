# Proyecto de Cartas y Juego

Proyecto Java simple con clases `Carta`, `Jugador`, `Mazo` y `Juego`.

## Uso básico

1. Abra una terminal en el directorio del proyecto.
2. Compile los fuentes:
   ```powershell
   javac *.java
   ```
3. Ejecute la aplicación principal (si `Juego` tiene `main`):
   ```powershell
   java Juego
   ```

Las pruebas (`*Test.java`) también se pueden compilar y ejecutar con `javac`/`java` si contienen métodos `main`.

## Documentación

La Javadoc está en `bin/`. Para regenerarla:
```powershell
javadoc -d bin *.java
```

¡Listo!
