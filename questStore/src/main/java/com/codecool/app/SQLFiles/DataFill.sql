
INSERT INTO systemUser 
(name, surname, email, phone, password)
VALUES
('Jerzy','Szewowski','bigj@cc.com','420213769','admin'),
('Darek','Grzybowski','darek@snooker.com','54004345','shelbysux'),
('Piotrek','Studencki','panda3@wp.pl','565656111','haslo123'),
('Zosia','Samosia','zofia@buziaczek.pl','333444111','notfat'),
('Lolek','Bolkowski','bolo@prl.pl','1110000999','ymca'),
('Ania','Zielonogorska','ania@cypreshill.org','420531642','lowryder'),
('Robert','Naklowicz','papryka@eee.pl','012200000','eeeyyy'),
('Katerina','Rakietova','katiusza@specnaz.su','84130932','kalinka'),
('Борис','ленин','рассия@спесназ.ру','84130932','блять'),
('Barbara','Karwasz-Barabasz','karwasz@barabasz.mig','444333222','hasło'),
('Krzysztof','Dzięcioł','dziupla@drzewo.las','778993009','czesławniemen1'),
('Mariusz','Przecier','pomidory@pudliszki.pl','443892511','hhh334DM');

INSERT INTO manager 
(id_systemuser)
VALUES (1);

INSERT INTO mentor 
(id_systemuser)
VALUES (2),
(3),
(4);

INSERT INTO class_ 
(name)
VALUES ('python basic'),
('python advanced'),
('java room'),
('java web'),
('java advanced');

INSERT INTO mentor_class 
(id_mentor, id_class)
VALUES (1, 1),
(1,2),
(2,3),
(3,4);

INSERT INTO student 
(id_systemuser, id_class)
VALUES (5, 1),
(6,1),
(7,1),
(8,1),
(9,2),
(10,2),
(11,3),
(12,3);


