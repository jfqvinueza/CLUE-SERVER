-- comentAndRating
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Write', 'POST:/api/comentAndRating/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Read', 'GET:/api/comentAndRating/');
INSERT INTO authorities (name, endpoint) values ('comentAndRatingById_Read', 'GET:/api/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Delete', 'DELETE:/api/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Update', 'PUT:/api/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_PartialUpdate', 'PATCH:/api/comentAndRating/{id}/');
-- categorydeliveryAddresses
INSERT INTO authorities (name, endpoint) values ('categorydeliveryAddresses_Write', 'POST:/api/categorydeliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('categorydeliveryAddresses_Read', 'GET:/api/categorydeliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('categorydeliveryAddressesById_Read', 'GET:/api/categorydeliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('categorydeliveryAddresses_Delete', 'DELETE:/api/categorydeliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('categorydeliveryAddresses_Update', 'PUT:/api/categorydeliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('categorydeliveryAddresses_PartialUpdate', 'PATCH:/api/categorydeliveryAddresses/');
-- customer
INSERT INTO authorities (name, endpoint) values ('Authority_Write', 'POST:/api/authority/');
INSERT INTO authorities (name, endpoint) values ('Authority_Read', 'GET:/api/authority/');
INSERT INTO authorities (name, endpoint) values ('AuthorityById_Read', 'GET:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_Delete', 'DELETE:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_Update', 'PUT:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('Authority_PartialUpdate', 'PATCH:/api/authority/{id}/');
INSERT INTO authorities (name, endpoint) values ('AuthorityBycomentAndRating_Read', 'GET:/api/authority/bycomentAndRating/{id}/');
-- deliveries
INSERT INTO authorities (name, endpoint) values ('deliveries_Write', 'POST:/api/deliveries/');
INSERT INTO authorities (name, endpoint) values ('deliveries_Read', 'GET:/api/deliveries/');
INSERT INTO authorities (name, endpoint) values ('deliveriesById_Read', 'GET:/api/deliveries/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveries_Delete', 'DELETE:/api/deliveries/{id}');
INSERT INTO authorities (name, endpoint) values ('deliveries_Update', 'PUT:/api/deliveries/{id}');
INSERT INTO authorities (name, endpoint) values ('deliveries_PartialUpdate', 'PATCH:/api/deliveries/{id}');
-- deliveryAddresses
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Write', 'POST:/api/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Read', 'GET:/api/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddressesById_Read', 'GET:/api/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Delete', 'DELETE:/api/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Update', 'PUT:/api/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_PartialUpdate', 'PATCH:/api/deliveryAddresses/{id}/');
-- deliveryPerson
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_Write', 'POST:/api/deliveryPerson/');
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_Read', 'GET:/api/deliveryPerson/');
INSERT INTO authorities (name, endpoint) values ('deliveryPersonById_Read', 'GET:/api/deliveryPerson/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_Delete', 'DELETE:/api/deliveryPerson/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_Update', 'PUT:/api/deliveryPerson/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryPerson_PartialUpdate', 'PATCH:/api/deliveryPerson/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryPersonPdf_Read', 'GET:/api/deliveryPerson/pdf/{id}/');
-- inventory
INSERT INTO authorities (name, endpoint) values ('inventory_Write', 'POST:/api/inventory/');
INSERT INTO authorities (name, endpoint) values ('inventory_Read', 'GET:/api/inventory/');
INSERT INTO authorities (name, endpoint) values ('inventoryById_Read', 'GET:/api/inventory/{id}/');
INSERT INTO authorities (name, endpoint) values ('inventory_Delete', 'DELETE:/api/inventory/{id}/');
INSERT INTO authorities (name, endpoint) values ('inventory_Update', 'PUT:/api/inventory/{id}/');
INSERT INTO authorities (name, endpoint) values ('inventory_PartialUpdate', 'PATCH:/api/inventory/{id}/');
INSERT INTO authorities (name, endpoint) values ('inventoryPdf_Read', 'GET:/api/inventory/pdf/{id}/');
-- order
INSERT INTO authorities (name, endpoint) values ('order_Write', 'POST:/api/order/');
INSERT INTO authorities (name, endpoint) values ('order_Read', 'GET:/api/order/');
INSERT INTO authorities (name, endpoint) values ('orderById_Read', 'GET:/api/order/{id}/');
INSERT INTO authorities (name, endpoint) values ('order_Delete', 'DELETE:/api/order/{id}/');
INSERT INTO authorities (name, endpoint) values ('order_Update', 'PUT:/api/order/{id}/');
INSERT INTO authorities (name, endpoint) values ('order_PartialUpdate', 'PATCH:/api/order/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderPdf_Read', 'GET:/api/order/pdf/{id}/');
-- orderStatus
INSERT INTO authorities (name, endpoint) values ('orderStatus_Write', 'POST:/api/orderStatus/');
INSERT INTO authorities (name, endpoint) values ('orderStatus_Read', 'GET:/api/orderStatus/');
INSERT INTO authorities (name, endpoint) values ('orderStatusById_Read', 'GET:/api/orderStatus/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderStatus_Delete', 'DELETE:/api/orderStatus/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderStatus_Update', 'PUT:/api/orderStatus/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderStatus_PartialUpdate', 'PATCH:/api/orderStatus/{id}/');
INSERT INTO authorities (name, endpoint) values ('orderStatusPdf_Read', 'GET:/api/orderStatus/pdf/{id}/');
-- paymentMethod
INSERT INTO authorities (name, endpoint) values ('paymentMethod_Write', 'POST:/api/paymentMethod/');
INSERT INTO authorities (name, endpoint) values ('paymentMethod_Read', 'GET:/api/paymentMethod/');
INSERT INTO authorities (name, endpoint) values ('paymentMethodById_Read', 'GET:/api/paymentMethod/{id}/');
INSERT INTO authorities (name, endpoint) values ('paymentMethod_Delete', 'DELETE:/api/paymentMethod/{id}/');
INSERT INTO authorities (name, endpoint) values ('paymentMethod_Update', 'PUT:/api/paymentMethod/{id}/');
INSERT INTO authorities (name, endpoint) values ('paymentMethod_PartialUpdate', 'PATCH:/api/paymentMethod/{id}/');
INSERT INTO authorities (name, endpoint) values ('paymentMethodPdf_Read', 'GET:/api/paymentMethod/pdf/{id}/');
-- deliveryAddresses
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Write', 'POST:/api/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Read', 'GET:/api/deliveryAddresses/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddressesById_Read', 'GET:/api/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Delete', 'DELETE:/api/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_Update', 'PUT:/api/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddresses_PartialUpdate', 'PATCH:/api/deliveryAddresses/{id}/');
INSERT INTO authorities (name, endpoint) values ('deliveryAddressesPdf_Read', 'GET:/api/deliveryAddresses/pdf/{id}/');
-- purchaseList
INSERT INTO authorities (name, endpoint) values ('purchaseList_Write', 'POST:/api/purchaseList/');
INSERT INTO authorities (name, endpoint) values ('purchaseList_Read', 'GET:/api/purchaseList/');
INSERT INTO authorities (name, endpoint) values ('purchaseListById_Read', 'GET:/api/purchaseList/{id}/');
INSERT INTO authorities (name, endpoint) values ('purchaseList_Delete', 'DELETE:/api/purchaseList/{id}/');
INSERT INTO authorities (name, endpoint) values ('purchaseList_Update', 'PUT:/api/purchaseList/{id}/');
INSERT INTO authorities (name, endpoint) values ('purchaseList_PartialUpdate', 'PATCH:/api/purchaseList/{id}/');
INSERT INTO authorities (name, endpoint) values ('purchaseListPdf_Read', 'GET:/api/purchaseList/pdf/{id}/');
-- rol
INSERT INTO authorities (name, endpoint) values ('rol_Write', 'POST:/api/rol/');
INSERT INTO authorities (name, endpoint) values ('rol_Read', 'GET:/api/rol/');
INSERT INTO authorities (name, endpoint) values ('rolById_Read', 'GET:/api/rol/{id}/');
INSERT INTO authorities (name, endpoint) values ('rol_Delete', 'DELETE:/api/rol/{id}/');
INSERT INTO authorities (name, endpoint) values ('rol_Update', 'PUT:/api/rol/{id}/');
INSERT INTO authorities (name, endpoint) values ('rol_PartialUpdate', 'PATCH:/api/rol/{id}/');
INSERT INTO authorities (name, endpoint) values ('rolPdf_Read', 'GET:/api/rol/pdf/{id}/');
-- shppingCar
INSERT INTO authorities (name, endpoint) values ('shppingCar_Write', 'POST:/api/shppingCar/');
INSERT INTO authorities (name, endpoint) values ('shppingCar_Read', 'GET:/api/shppingCar/');
INSERT INTO authorities (name, endpoint) values ('shppingCarById_Read', 'GET:/api/shppingCar/{id}/');
INSERT INTO authorities (name, endpoint) values ('shppingCar_Delete', 'DELETE:/api/shppingCar/{id}/');
INSERT INTO authorities (name, endpoint) values ('shppingCar_Update', 'PUT:/api/shppingCar/{id}/');
INSERT INTO authorities (name, endpoint) values ('shppingCar_PartialUpdate', 'PATCH:/api/shppingCar/{id}/');
INSERT INTO authorities (name, endpoint) values ('shppingCarPdf_Read', 'GET:/api/shppingCar/pdf/{id}/');
-- store
INSERT INTO authorities (name, endpoint) values ('store_Write', 'POST:/api/store/');
INSERT INTO authorities (name, endpoint) values ('store_Read', 'GET:/api/store/');
INSERT INTO authorities (name, endpoint) values ('storeById_Read', 'GET:/api/store/{id}/');
INSERT INTO authorities (name, endpoint) values ('store_Delete', 'DELETE:/api/store/{id}/');
INSERT INTO authorities (name, endpoint) values ('store_Update', 'PUT:/api/store/{id}/');
INSERT INTO authorities (name, endpoint) values ('store_PartialUpdate', 'PATCH:/api/store/{id}/');
INSERT INTO authorities (name, endpoint) values ('storePdf_Read', 'GET:/api/store/pdf/{id}/');
-- comentAndRating
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Write', 'POST:/api/comentAndRating/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Read', 'GET:/api/comentAndRating/');
INSERT INTO authorities (name, endpoint) values ('comentAndRatingById_Read', 'GET:/api/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Delete', 'DELETE:/api/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_Update', 'PUT:/api/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRating_PartialUpdate', 'PATCH:/api/comentAndRating/{id}/');
INSERT INTO authorities (name, endpoint) values ('comentAndRatingPdf_Read', 'GET:/api/comentAndRating/pdf/{id}/');
