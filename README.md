# prueba-precios


## Aplicación que permite filtrar precios, se hace uso de paginación, arquitectura hexagonal y predicados con JpaSpecificationExecutor, con base de datos en memoria h2 y pruebas unitarias y de integración

### Hace uso de una Arquitectura hexagonal, cada componente (dentro de el package component) se subdivide en los subpaquetes io (infraestructura), model (entidades), service (logica y abstracciones), cada capa como del web dentro de io tiene sus propios modelos tipo Request y Response, de igual manera los service tienen un subpackage con modelos propios de esta capa que son los comandos.

## URL de consumo por postman: localhost:8080/zara/api/v1/prices?productId=35455&applicationDate=2020-06-14T:00:00&brandId=1
## Respuesta:

{
    "result": [
        {
            "priceId": 1,
            "brandId": 1,
            "price": 35.50,
            "startDate": "2020-06-14T00:00:00",
            "endDate": "2020-12-31T23:59:59",
            "productId": 35455
        },
        {
            "priceId": 2,
            "brandId": 1,
            "price": 25.45,
            "startDate": "2020-06-14T15:00:00",
            "endDate": "2020-06-14T18:30:00",
            "productId": 35455
        }
    ],
    "total": 2,
    "page": 0,
    "returnedRecords": 2
}
