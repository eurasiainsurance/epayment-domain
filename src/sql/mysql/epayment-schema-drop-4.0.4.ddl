ALTER TABLE INVOICE DROP FOREIGN KEY FK_INVOICE_PAYMENT_ID
ALTER TABLE ITEM DROP FOREIGN KEY FK_ITEM_INVOICE_ID
ALTER TABLE QAZKOM_ERROR DROP FOREIGN KEY FK_QAZKOM_ERROR_ERROR_DOC_ID
ALTER TABLE QAZKOM_ERROR DROP FOREIGN KEY FK_QAZKOM_ERROR_QAZKOM_ORDER_ID
ALTER TABLE QAZKOM_ORDER DROP FOREIGN KEY FK_QAZKOM_ORDER_INVOICE_ID
ALTER TABLE QAZKOM_ORDER DROP FOREIGN KEY FK_QAZKOM_ORDER_CART_DOC_ID
ALTER TABLE QAZKOM_ORDER DROP FOREIGN KEY FK_QAZKOM_ORDER_ORDER_DOC_ID
ALTER TABLE QAZKOM_ORDER DROP FOREIGN KEY FK_QAZKOM_ORDER_PAYMENT_ID
ALTER TABLE QAZKOM_PAYMENT DROP FOREIGN KEY FK_QAZKOM_PAYMENT_PAYMENT_DOC_ID
ALTER TABLE QAZKOM_PAYMENT DROP FOREIGN KEY FK_QAZKOM_PAYMENT_ID
DROP TABLE INVOICE
DROP TABLE ITEM
DROP TABLE PAYMENT
DROP TABLE QAZKOM_ERROR
DROP TABLE QAZKOM_ORDER
DROP TABLE QAZKOM_PAYMENT
DROP TABLE QAZKOM_XML_DOCUMENT
DROP TABLE EPAYMENT_VER_4_0_4
