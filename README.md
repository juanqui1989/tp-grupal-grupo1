###Patron Builder.


 
 ![builder](https://user-images.githubusercontent.com/49033186/68078347-fe105500-fdb2-11e9-8b5b-5f094f929bae.png)
 
 
 
Problema:
 
Imagine un objeto complejo que requiere una laboriosa inicialización paso a paso de muchos campos y objetos anidados. Tal código de      inicialización generalmente está enterrado dentro de un monstruoso constructor con muchos parámetros. O peor aún: dispersos por todo el  código del cliente.


Por ejemplo, pensemos en cómo crear un Houseobjeto. Para construir una casa simple, debe construir cuatro paredes y un piso, instalar una puerta, colocar un par de ventanas y construir un techo. Pero, ¿qué pasa si desea una casa más grande y brillante, con un patio trasero y otras cosas buenas (como un sistema de calefacción, plomería y cableado eléctrico)?

La solución más simple es extender la Houseclase base y crear un conjunto de subclases para cubrir todas las combinaciones de los parámetros. Pero eventualmente terminarás con un número considerable de subclases. Cualquier parámetro nuevo, como el estilo de porche, requerirá aumentar aún más esta jerarquía.

Hay otro enfoque que no implica subclases de cría. Puede crear un constructor gigante directamente en la Houseclase base con todos los parámetros posibles que controlan el objeto de la casa. Si bien este enfoque elimina la necesidad de subclases, crea otro problema.

En la mayoría de los casos, la mayoría de los parámetros no se usarán, lo que hace que el constructor llame bastante feo . Por ejemplo, solo una fracción de las casas tiene piscinas, por lo que los parámetros relacionados con las piscinas serán inútiles nueve de cada diez veces.


Solución:

El patrón Builder sugiere que extraiga el código de construcción del objeto de su propia clase y lo mueva a objetos separados llamados constructores .

El patrón organiza construcción de objetos en un conjunto de pasos ( buildWalls, buildDoor, etc.). Para crear un objeto, ejecuta una serie de estos pasos en un objeto generador. La parte importante es que no necesita llamar a todos los pasos. Puede invocar solo aquellos pasos que son necesarios para producir una configuración particular de un objeto.

Algunos de los pasos de construcción pueden requerir una implementación diferente cuando necesite crear varias representaciones del producto. Por ejemplo, las paredes de una cabaña pueden estar construidas de madera, pero las paredes del castillo deben estar construidas con piedra.

En este caso, puede crear varias clases de constructores diferentes que implementen el mismo conjunto de pasos de construcción, pero de manera diferente. Luego puede usar estos constructores en el proceso de construcción (es decir, un conjunto ordenado de llamadas a los pasos de construcción) para producir diferentes tipos de objetos.


Diferentes constructores ejecutan la misma tarea de varias maneras.

Por ejemplo, imagine un constructor que construye todo de madera y vidrio, un segundo que construye todo con piedra y hierro y un tercero que usa oro y diamantes. Al llamar al mismo conjunto de pasos, obtienes una casa normal del primer constructor, un pequeño castillo del segundo y un palacio del tercero. Sin embargo, esto solo funcionaría si el código del cliente que llama a los pasos de construcción puede interactuar con los constructores utilizando una interfaz común.

Director:

Puede ir más allá y extraer una serie de llamadas a los pasos del constructor que utiliza para construir un producto en una clase separada llamada director . La clase de director define el orden en el que ejecutar los pasos de construcción, mientras que el constructor proporciona la implementación de esos pasos.


El director sabe qué pasos de construcción ejecutar para obtener un producto que funcione.

Tener una clase de director en su programa no es estrictamente necesario. Siempre puede llamar a los pasos de construcción en un orden específico directamente desde el código del cliente. Sin embargo, la clase de director puede ser un buen lugar para poner varias rutinas de construcción para que pueda reutilizarlas en su programa.

Además, la clase de director oculta completamente los detalles de la construcción del producto del código del cliente. El cliente solo necesita asociar un constructor con un director, iniciar la construcción con el director y obtener el resultado del constructor.

 Pros y contras:
 
 Puede construir objetos paso a paso, diferir los pasos de construcción o ejecutar pasos de forma recursiva.
 Puede reutilizar el mismo código de construcción al crear varias representaciones de productos.
 Principio de responsabilidad única . Puede aislar el código de construcción complejo de la lógica empresarial del producto.
 
Relaciones con otros patrones:
 
Muchos diseños comienzan utilizando el Método Factory (menos complicado y más personalizable a través de subclases) y evolucionan hacia Abstract Factory , Prototype o Builder (más flexible, pero más complicado).

Builder se centra en la construcción de objetos complejos paso a paso. Abstract Factory se especializa en crear familias de objetos relacionados. Abstract Factory devuelve el producto de inmediato, mientras que Builder le permite ejecutar algunos pasos de construcción adicionales antes de buscar el producto.

Puede usar el Generador al crear árboles compuestos complejos porque puede programar sus pasos de construcción para trabajar de forma recursiva.

Puede combinar Builder con Bridge : la clase de director desempeña el papel de abstracción, mientras que los diferentes constructores actúan como implementaciones .

Fábricas abstractas , constructores y prototipos se pueden implementar como Singletons 
