# Principio Open-Closed (SOLID)


-> CONCEPTO: 
        Este principio establece que una entidad de software (clase, módulo, función, etc) debe quedar abierta para su extensión, 
        pero cerrada para su modificación. Es decir, que por ejemplo si tenemos una entidad Auto, en la cual tenemos distintos 
        tipos de Autos como en este ejemplo (Nave, Moto), cuando venga un nuevo auto (Avion), lo unico que tenemos que hacer es
        agregarlo a la lista de vehiculos que tenemos previamente, sin necesidad de cambiar la jerarquia o funcionamiento de la
        clase madre (Auto), solo agregamos los metodos que nos provee dicha clase dentro de avion dentro de avion y agregandole
        el comportamiento que corresponda.
        
-> COMO SE LOGRA?: Con polimorfismo, con interfaces, delegacion o herencia.

-> EJEMPLO:
      El objetivo de este repo es mostrar el principio de Open-Closed, el cual se hace a través de un ejemplo que tiene 2 tipos
      de autos (Nave, Moto), donde la clase Auto esta abierta para la extension (puede recibir n nuevos vehiculos) y cerrada
      para su modificacion (No se deben agregar nuevos metodos, solo debe reeimplementar los metodos que cambien entre los
      distintos subautos).
      
      Ademas agregamos test unitarios, para mostrar que las clases funcionan correctamente y para practicar tdd y manejo de 
      excepciones.
