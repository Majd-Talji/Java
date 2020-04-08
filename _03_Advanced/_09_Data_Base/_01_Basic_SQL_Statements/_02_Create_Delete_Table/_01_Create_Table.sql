/**
 * Author:  Majd Talji <en.majd.talji@gmail.com>
 * Created: 07.04.2020
 */

CREATE TABLE clients(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    phone VARCHAR(50)
);