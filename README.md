# Taller3Softka

Ejercicio Practico de buenas practicas de POO

# La aplicación cuenta con:
## - Una biblioteca principal con todas las canciones 
## - Una funcionalidad que permita crear playlist con canciones determinadas 
## - Cada canción tiene un id, titulo, fecha, duración, genero, caratula y una descripción corta.
## - Con una funcionalidad en donde se permita hacer filtros a la biblioteca principal, los filtros son:
### * Filtrar canciones del mismo genero
### * Filtrar canciones en el mismo año
## - Una funcionalidad en donde se permite ordenar por duración y fecha.

# Clases de la aplicación
## - Clase Info: Esta clase nos apoya como clase base abstracta, de esta manera podemos extenderla para crear otro tipo de arraysList, ya sea con los mismos parametros u omitiendo alguno de estos.
## - Clase InfoLibrary: Esta clase extiende de la clase Info, donde organizamos cada parametro de la clase Info.
## - Clase OrderYear: Esta clase nos apoya como clase de utilidad. para asi sobreescribir el metodo compare facilitando el ordenamiento del arrayList por fecha.
## - Clase Main: Esta es la clase principal donde efectuamos la aplicacion de la libreria
