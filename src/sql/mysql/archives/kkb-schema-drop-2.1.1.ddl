ALTER TABLE KKB_ORDER_ITEM DROP FOREIGN KEY FK_KKB_ORDER_ITEM_KKB_ORDER_ID;
ALTER TABLE KKB_DOCUMENT DROP FOREIGN KEY FK_KKB_DOCUMENT_KKB_ORDER_ID;
ALTER TABLE KKB_NOTIFICATION DROP FOREIGN KEY FK_KKB_NOTIFICATION_KKB_ORDER_ID;
ALTER TABLE KKB_ORDER DROP FOREIGN KEY FK_KKB_ORDER_REQUEST_DOCUMENT_ID;
ALTER TABLE KKB_ORDER DROP FOREIGN KEY FK_KKB_ORDER_CART_DOCUMENT_ID;
ALTER TABLE KKB_ORDER DROP FOREIGN KEY FK_KKB_ORDER_RESPONSE_DOCUMENT_ID;
DROP TABLE KKB_ORDER_ITEM;
DROP TABLE KKB_DOCUMENT;
DROP INDEX KKB_NOTIFICATION_IDX01 ON KKB_NOTIFICATION;
DROP TABLE KKB_NOTIFICATION;
DROP TABLE VER_2_1_1;
DROP INDEX KKB_ORDER_IDX01 ON KKB_ORDER;
DROP INDEX KKB_ORDER_IDX02 ON KKB_ORDER;
DROP TABLE KKB_ORDER;
