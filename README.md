# ChallengeVueling

Este reto se basa en crear un MVP para una nueva función de búsqueda de viajes con los siguientes requisitos:
La aplicación toma al menos tres letras de la entrada estándar para ejecutar la búsqued y buscar viajes con ciudades que coincidan con el texto ingresado por el usuario en cualquier parte del nombre de la ciudad.

Existen dos tipos de viajes: "viajes terrestres" y "viajes aéreos". Cada uno con unas características específicas.

La aplicación debería devolver el resultado utilizando la vista de salida estándar:

Nombre del viaje.
Tipo de viaje.
Duración.
Nombres de las ciudades.
Detalles específicos (Para hoteles: nombre y categoría, para vuelos: ciudad y horario de salida).
También se requiere que sea manejable para agregar nuevas funciones.

## Arquitectura

Utilizamos una estructura básica con capa modelo donde están todas las clases y una clase main para ejecutar la aplicación con un metodo que realiza la función requerida de filtrado y un metodo que carga una supuesta BD (fake).


## Justificación de la solución aportada

He optado por esta solución y no entrar en hacer una APIRest con una BD y peticiones por endpoint ya que en los requerimientos pide que el texto sea ingresado por el usuario por entrada estándar y la salida por salida estándar.
Tampoco tenía claro si se podía usar Spring Boot ya que en los requerimientos técnicos especificaba que no se podían utilizarframeworks como Symphony, Laravel, etc.
