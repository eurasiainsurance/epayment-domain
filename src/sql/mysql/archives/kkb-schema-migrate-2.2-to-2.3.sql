-- MIGRATION SCRIPT FROM 2.2 TO 2.3

/*
 * VERSION TABLE
 */
DROP TABLE KKB_VER_2_2;
CREATE TABLE KKB_VER_2_3 (DUMMY INTEGER NOT NULL, PRIMARY KEY (DUMMY))
