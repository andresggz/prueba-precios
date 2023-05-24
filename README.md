# prueba-precios


## Aplicación que permite filtrar precios, arquitectura hexagonal y predicados con JpaSpecificationExecutor, con base de datos en memoria h2 y pruebas unitarias y de integración

### Hace uso de una Arquitectura hexagonal, cada componente (dentro del package component) se subdivide en los subpaquetes io (infraestructura), model (entidades), service (logica y abstracciones), cada capa como del web dentro de io tiene sus propios modelos tipo Request y Response, de igual manera los service tienen un subpackage con modelos propios de esta capa que son los comandos.
### Contiene un global exception handler

## URL de consumo por postman: localhost:8080/zara/api/v1/prices?productId=35455&applicationDate=2020-06-16T21:00:00&brandId=1
## Respuesta:

{
"priceId": 4,
"brandId": 1,
"price": 38.95,
"startDate": "2020-06-15T16:00:00",
"endDate": "2020-12-31T23:59:59",
"productId": 35455
}
