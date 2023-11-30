-- comentAndRating
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Write', 'POST:/app/comentAndRating/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Read', 'GET:/app/comentAndRating/');
INSERT INTO authorities (name, endpoint) values ('comentAndRatingById_Read', 'GET:/app/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Delete', 'DELETE:/app/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Update', 'PUT:/app/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_PartialUpdate', 'PATCH:/app/comentAndRating/{id}/');
-- categoryProduct
INSERT INTO authorities (name, endpoint) values ('categoryProduct_Write', 'POST:/app/categoryProduct/');
INSERT INTO authorities (name, endpoint) values ('categoryProduct_Read', 'GET:/app/categoryProduct/');
INSERT INTO authorities (name, endpoint) values ('categoryProductById_Read', 'GET:/app/categoryProduct/{id}/');
INSERT INTO authorities (name, endpoint) values ('categoryProduct_Delete', 'DELETE:/app/categoryProduct/{id}/');
INSERT INTO authorities (name, endpoint) values ('categoryProduct_Update', 'PUT:/app/categoryProduct/{id}/');
INSERT INTO authorities (name, endpoint) values ('categoryProduct_PartialUpdate', 'PATCH:/app/categoryProduct/');
-- deliveryAddresses
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Write', 'POST:/app/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Read', 'GET:/app/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddressesById_Read', 'GET:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Delete', 'DELETE:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Update', 'PUT:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_PartialUpdate', 'PATCH:/app/deliveryAddresses/');
-- customer
INSERT INTO authorities (name, endpoint) values ('Authority_Write', 'POST:/app/authority/');
INSERT INTO authorities (name, endpoint) values ('Authority_Read', 'GET:/app/authority/');
INSERT INTO authorities (name, endpoint) values ('AuthorityById_Read', 'GET:/app/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_Delete', 'DELETE:/app/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_Update', 'PUT:/app/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_PartialUpdate', 'PATCH:/app/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('AuthorityBycomentAndRating_Read', 'GET:/app/authority/bycomentAndRating/{id}/');
-- deliveries
INSERT INTO authorities (name, endpoint) values ('deliveries_Write', 'POST:/app/deliveries/');
INSERT INTO authorities (name, endpoint) values ('deliveries_Read', 'GET:/app/deliveries/');
INSERT INTO authorities (name, endpoint) values ('deliveriesById_Read', 'GET:/app/deliveries/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveries_Delete', 'DELETE:/app/deliveries/{id}');
INSERT INTO authorities (name, endpoint) values ('deliveries_Update', 'PUT:/app/deliveries/{id}');
INSERT INTO authorities (name, endpoint) values ('deliveries_PartialUpdate', 'PATCH:/app/deliveries/{id}');
-- deliveryAddresses
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Write', 'POST:/app/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Read', 'GET:/app/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddressesById_Read', 'GET:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Delete', 'DELETE:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Update', 'PUT:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_PartialUpdate', 'PATCH:/app/deliveryAddresses/{id}/');
-- deliveryPerson
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_Write', 'POST:/app/deliveryPerson/');
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_Read', 'GET:/app/deliveryPerson/');
INSERT INTO authorities (name, endpoint) values ('deliveryPersonById_Read', 'GET:/app/deliveryPerson/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_Delete', 'DELETE:/app/deliveryPerson/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_Update', 'PUT:/app/deliveryPerson/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_PartialUpdate', 'PATCH:/app/deliveryPerson/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryPersonPdf_Read', 'GET:/app/deliveryPerson/pdf/{id}/');
-- inventory
INSERT INTO authorities (name, endpoint) values ('inventory_Write', 'POST:/app/inventory/');
INSERT INTO authorities (name, endpoint) values ('inventory_Read', 'GET:/app/inventory/');
INSERT INTO authorities (name, endpoint) values ('inventoryById_Read', 'GET:/app/inventory/{id}/');
INSERT INTO authorities (name, endpoint) values ('inventory_Delete', 'DELETE:/app/inventory/{id}/');
INSERT INTO authorities (name, endpoint) values ('inventory_Update', 'PUT:/app/inventory/{id}/');
INSERT INTO authorities (name, endpoint) values ('inventory_PartialUpdate', 'PATCH:/app/inventory/{id}/');
INSERT INTO authorities (name, endpoint) values ('inventoryPdf_Read', 'GET:/app/inventory/pdf/{id}/');
-- order
INSERT INTO authorities (name, endpoint) values ('order_Write', 'POST:/app/order/');
INSERT INTO authorities (name, endpoint) values ('order_Read', 'GET:/app/order/');
INSERT INTO authorities (name, endpoint) values ('orderById_Read', 'GET:/app/order/{id}/');
INSERT INTO authorities (name, endpoint) values ('order_Delete', 'DELETE:/app/order/{id}/');
INSERT INTO authorities (name, endpoint) values ('order_Update', 'PUT:/app/order/{id}/');
INSERT INTO authorities (name, endpoint) values ('order_PartialUpdate', 'PATCH:/app/order/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderPdf_Read', 'GET:/app/order/pdf/{id}/');
-- orderStatus
INSERT INTO authorities (name, endpoint) values ('orderStatus_Write', 'POST:/app/orderStatus/');
INSERT INTO authorities (name, endpoint) values ('orderStatus_Read', 'GET:/app/orderStatus/');
INSERT INTO authorities (name, endpoint) values ('orderStatusById_Read', 'GET:/app/orderStatus/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderStatus_Delete', 'DELETE:/app/orderStatus/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderStatus_Update', 'PUT:/app/orderStatus/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderStatus_PartialUpdate', 'PATCH:/app/orderStatus/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderStatusPdf_Read', 'GET:/app/orderStatus/pdf/{id}/');
-- paymentMethod
INSERT INTO authorities (name, endpoint) values ('paymentMethod_Write', 'POST:/app/paymentMethod/');
INSERT INTO authorities (name, endpoint) values ('paymentMethod_Read', 'GET:/app/paymentMethod/');
INSERT INTO authorities (name, endpoint) values ('paymentMethodById_Read', 'GET:/app/paymentMethod/{id}/');
INSERT INTO authorities (name, endpoint) values ('paymentMethod_Delete', 'DELETE:/app/paymentMethod/{id}/');
INSERT INTO authorities (name, endpoint) values ('paymentMethod_Update', 'PUT:/app/paymentMethod/{id}/');
INSERT INTO authorities (name, endpoint) values ('paymentMethod_PartialUpdate', 'PATCH:/app/paymentMethod/{id}/');
INSERT INTO authorities (name, endpoint) values ('paymentMethodPdf_Read', 'GET:/app/paymentMethod/pdf/{id}/');
-- deliveryAddresses
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Write', 'POST:/app/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Read', 'GET:/app/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddressesById_Read', 'GET:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Delete', 'DELETE:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Update', 'PUT:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_PartialUpdate', 'PATCH:/app/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddressesPdf_Read', 'GET:/app/deliveryAddresses/pdf/{id}/');
-- purchaseList
INSERT INTO authorities (name, endpoint) values ('purchaseList_Write', 'POST:/app/purchaseList/');
INSERT INTO authorities (name, endpoint) values ('purchaseList_Read', 'GET:/app/purchaseList/');
INSERT INTO authorities (name, endpoint) values ('purchaseListById_Read', 'GET:/app/purchaseList/{id}/');
INSERT INTO authorities (name, endpoint) values ('purchaseList_Delete', 'DELETE:/app/purchaseList/{id}/');
INSERT INTO authorities (name, endpoint) values ('purchaseList_Update', 'PUT:/app/purchaseList/{id}/');
INSERT INTO authorities (name, endpoint) values ('purchaseList_PartialUpdate', 'PATCH:/app/purchaseList/{id}/');
INSERT INTO authorities (name, endpoint) values ('purchaseListPdf_Read', 'GET:/app/purchaseList/pdf/{id}/');
-- rol
INSERT INTO authorities (name, endpoint) values ('rol_Write', 'POST:/app/rol/');
INSERT INTO authorities (name, endpoint) values ('rol_Read', 'GET:/app/rol/');
INSERT INTO authorities (name, endpoint) values ('rolById_Read', 'GET:/app/rol/{id}/');
INSERT INTO authorities (name, endpoint) values ('rol_Delete', 'DELETE:/app/rol/{id}/');
INSERT INTO authorities (name, endpoint) values ('rol_Update', 'PUT:/app/rol/{id}/');
INSERT INTO authorities (name, endpoint) values ('rol_PartialUpdate', 'PATCH:/app/rol/{id}/');
INSERT INTO authorities (name, endpoint) values ('rolPdf_Read', 'GET:/app/rol/pdf/{id}/');
-- shppingCar
INSERT INTO authorities (name, endpoint) values ('shppingCar_Write', 'POST:/app/shppingCar/');
INSERT INTO authorities (name, endpoint) values ('shppingCar_Read', 'GET:/app/shppingCar/');
INSERT INTO authorities (name, endpoint) values ('shppingCarById_Read', 'GET:/app/shppingCar/{id}/');
INSERT INTO authorities (name, endpoint) values ('shppingCar_Delete', 'DELETE:/app/shppingCar/{id}/');
INSERT INTO authorities (name, endpoint) values ('shppingCar_Update', 'PUT:/app/shppingCar/{id}/');
INSERT INTO authorities (name, endpoint) values ('shppingCar_PartialUpdate', 'PATCH:/app/shppingCar/{id}/');
INSERT INTO authorities (name, endpoint) values ('shppingCarPdf_Read', 'GET:/app/shppingCar/pdf/{id}/');
-- store
INSERT INTO authorities (name, endpoint) values ('store_Write', 'POST:/app/store/');
INSERT INTO authorities (name, endpoint) values ('store_Read', 'GET:/app/store/');
INSERT INTO authorities (name, endpoint) values ('storeById_Read', 'GET:/app/store/{id}/');
INSERT INTO authorities (name, endpoint) values ('store_Delete', 'DELETE:/app/store/{id}/');
INSERT INTO authorities (name, endpoint) values ('store_Update', 'PUT:/app/store/{id}/');
INSERT INTO authorities (name, endpoint) values ('store_PartialUpdate', 'PATCH:/app/store/{id}/');
INSERT INTO authorities (name, endpoint) values ('storePdf_Read', 'GET:/app/store/pdf/{id}/');
-- comentAndRating
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Write', 'POST:/app/comentAndRating/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Read', 'GET:/app/comentAndRating/');
INSERT INTO authorities (name, endpoint) values ('comentAndRatingById_Read', 'GET:/app/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Delete', 'DELETE:/app/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Update', 'PUT:/app/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_PartialUpdate', 'PATCH:/app/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRatingPdf_Read', 'GET:/app/comentAndRating/pdf/{id}/');
