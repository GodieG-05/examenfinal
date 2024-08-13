TABLA SELECCIONADA: customer

ENDPOINTS:

getAllCustomer: GET http://localhost:8080/customer/customer

getCustomerById: GET http://localhost:8080/customer/CUST002

updateCustomer: PUT http://localhost:8080/customer/CUST004

    json: 

        {
    "idCustomer": "CUST001",
    "nameCostumer": "Carolina",
    "lastNameCostumer": "Márquez",
    "codeCityCostumer": {
        "codeCity": "CTY03"
    },
    "emailCostumer": "caro.marquez@example.com",
    "birthDate": "1999-03-20",
    "lon": -58.3816,
    "latitud": -34.6037
    }

createCustomer: POST http://localhost:8080/customer

deleteCustomer: DELETE http://localhost:8080/customer/CUST003