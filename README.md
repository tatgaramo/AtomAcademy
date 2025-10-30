# ⚛️ AtomAcademy
- Es una aplicación para la gestión de una Academia, diseñada para administrar cursos, alumnos, profesores, notas y pagos de manera intuitiva.

# 📖 Características
- Interfaz con Swing.
- Operaciones CRUD para todas las entidades.
- Filtrado y exportación a PDF.
- Dashboard con gráficos.

# 🔨  ️Tecnologías

| Categoría           		| Tecnologías/Librerías               |  
|-------------------------------|-------------------------------------|  
| **Lenguaje**        		| Java                                |  
| **Base de Datos**   		| H2 Database (SQL)                   |  
| **ORM**             		| Hibernate + Criteria API            |  
| **Interfaz**        		| Swing                               |  
| **Gráficos**        		| JFreeChart                          |  
| **Utilidades**      		| Lombok, libphonenumber (Google)     |  
| **PDF**             		| iTextPDF                            |  
| **Calendario**      		| JCalendar                           |  
| **Gestión de Dependencias** 	| Maven                               |  

# ⚙️ Requisitos
- Windows

# 📥 Ejecución e Instalación
### ⚡ Ejecutar .exe
- Hacer doble clic sobre el archivo AtomAcademy.exe y seguir los pasos del instalador.
- Una vez instalado la aplicación podrá ser ejecutad des de el acceso directo creado en el Escritorio o el menú inicio.

# 🚀 Uso
Una vez que la aplicación esté en funcionamiento, puedes acceder a las diferentes funcionalidades a través de una interfaz de usuario que proporciona opciones para administrar los registros de los diferentes elementos (cursos, alumnos, notas, profesores y pagos).
- Desde la Ventana Principal se podrá navegar a las diferentes opciones de menú con sus funcionalidades:
    ## Menú Principal
    ### 🏠 Inicio
    - Esta vista muestra información complementaria de la academia, incluyendo un calendario, la hora y fecha actual, y dos gráficos:
        - Un gráfico circular que representa los porcentajes de las calificaciones generales de los alumnos.
        - Un gráfico de barras que muestra el número de aprobados y suspensos por evaluación.
    ### 📅  Horario
    - Aquí puedes visualizar el horario de los cursos registrados. Si realizas cambios en los registros, puedes actualizar la vista usando el botón Actualizar.
    ### 📚 Cursos
    - En esta vista se muestra una tabla con todos los cursos registrados. Puedes filtrar los registros según diferentes criterios, y realizar las siguientes acciones:
        - Filtrar, Crear, Editar, Eliminar registros.
        - Exportar los registros de la tabla a formato PDF, tanto la tabla completa como la filtrada.
    ### 👨‍🏫 Profesores
    - En esta vista se muestra una tabla con todos los profesores registrados. Puedes filtrar los registros según diferentes criterios, y realizar las siguientes acciones:
        - Filtrar, Crear, Editar, Eliminar registros.
        - Exportar los registros de la tabla a formato PDF, tanto la tabla completa como la filtrada.
    ### 🎓 Alumnos
    - En esta vista se muestra una tabla con todos los alumnos registrados. Puedes filtrar los registros según diferentes criterios, y realizar las siguientes acciones:
        - Filtrar, Crear, Editar, Eliminar registros.
        - Exportar los registros de la tabla a formato PDF, tanto la tabla completa como la filtrada.
    ### 💶 Pagos
   - En esta vista se muestra una tabla con todos los pagos registrados. Puedes filtrar los registros según diferentes criterios, y realizar las siguientes acciones:
        - Filtrar, Crear, Editar, Eliminar registros.
        - Exportar los registros de la tabla a formato PDF, tanto la tabla completa como la filtrada.
    ### 📄 Notas
    - En esta vista se muestra una tabla con todos las notas registradas. Puedes filtrar los registros según diferentes criterios, y realizar las siguientes acciones:
        - Filtrar, Crear, Editar, Eliminar registros.
        - Exportar los registros de la tabla a formato PDF, tanto la tabla completa como la filtrada.
    
# ⚠️ Avisos
- El archivo de la base de datos ("atomacademy.mv.db") se encuentra ubicado en una carpeta llamada AtomAcademy dentro de la carpeta de su usuario.
- Deberá realizar las operaciones necesarias para mantener la seguridad de sus datos, de perder dicho archivo se perderán los datos almacenados.

# ❗ Posibles problemas y soluciones
 - La aplicación facilita una opción para cargar datos de prueba, siempre que no hayan datos registrados.
- Eliminar registros: Se debe tener en cuenta que la información de los registros puede estar enlazada con otros registros y no se podrá proceder a la eliminación si no se eliminan los registros dependientes.