INSERT INTO magazynier(id, login, haslo) VALUES(1, 'magazynier1', 'haslo1');
INSERT INTO magazynier(id, login, haslo) VALUES(2, 'magazynier2', 'haslo2');
INSERT INTO magazynier(id, login, haslo) VALUES(3, 'magazynier3', 'haslo3');
INSERT INTO magazynier(id, login, haslo) VALUES(4, 'magazynier4', 'haslo4');





INSERT INTO lista_rozwozowa(id, data, magazynier_id) VALUES(1, '2019-01-22', 1);
INSERT INTO lista_rozwozowa(id, data, magazynier_id) VALUES(2, '2019-01-22', 2);
INSERT INTO lista_rozwozowa(id, data, magazynier_id) VALUES(3, '2019-01-21', 2);
INSERT INTO lista_rozwozowa(id, data, magazynier_id) VALUES(4, '2019-01-20', 3);



INSERT INTO kurier (id, login, haslo, imie_i_nazwisko, lista_rozwozowa_id)
            VALUES (1, 'kurier1', 'haslo1', 'Jan Kowalski', 1);
INSERT INTO kurier (id, login, haslo, imie_i_nazwisko, lista_rozwozowa_id)
            VALUES (2, 'kurier2', 'haslo2', 'Adam Szewczyk', null);
INSERT INTO kurier (id, login, haslo, imie_i_nazwisko, lista_rozwozowa_id)
            VALUES (3, 'kurier3', 'haslo3', 'Michal Janiak', null);
INSERT INTO kurier (id, login, haslo, imie_i_nazwisko, lista_rozwozowa_id)
            VALUES (4, 'kurier4', 'haslo4', 'Karol Nowak', null);
INSERT INTO kurier (id, login, haslo, imie_i_nazwisko, lista_rozwozowa_id)
            VALUES (5, 'kurier5', 'haslo5', 'Kacper Staniszewski', 2);
INSERT INTO kurier (id, login, haslo, imie_i_nazwisko, lista_rozwozowa_id)
            VALUES (6, 'kurier6', 'haslo6', 'Lukasz Adamczewski', null);
INSERT INTO kurier (id, login, haslo, imie_i_nazwisko, lista_rozwozowa_id)
            VALUES (7, 'kurier7', 'haslo7', 'Krzysztof Piekarski', null);
INSERT INTO kurier (id, login, haslo, imie_i_nazwisko, lista_rozwozowa_id)
            VALUES (8, 'kurier8', 'haslo8', 'Jakub Adamiak', 3);
INSERT INTO kurier (id, login, haslo, imie_i_nazwisko, lista_rozwozowa_id)
            VALUES (9, 'kurier9', 'haslo9', 'Aleksandra Marczak', 4);



INSERT INTO nadawca(id, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, numer_konta, login, haslo)
            VALUES(1, 'Andrzej Duda', 'Grunwaldzka 1', '50-365', 'Wroclaw', '23 1234 1234 0000 4321 4321 4321', 'nadawca1', 'haslo1');
INSERT INTO nadawca(id, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, numer_konta, login, haslo)
            VALUES(2, 'Jan Kowalski', 'Grunwaldzka 2', '50-365', 'Wroclaw', 'PL23 1234 1234 0000 4321 4321 4322', 'nadawca1', 'haslo1');
INSERT INTO nadawca(id, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, numer_konta, login, haslo)
            VALUES(3, 'Adam Nowak', 'Grunwaldzka 4', '50-365', 'Wroclaw', 'GB23 1234 1234 0000 4321 4321 4323', 'nadawca1', 'haslo1');
INSERT INTO nadawca(id, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, numer_konta, login, haslo)
            VALUES(4, 'Grzegorz Janiak', 'Grunwaldzka 5', '50-365', 'Wroclaw', 'US23 1234 1234 0000 4321 4321 4324', 'nadawca1', 'haslo1');
INSERT INTO nadawca(id, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, numer_konta, login, haslo)
            VALUES(5, 'Michal Pawlak', 'Grunwaldzka 6', '50-365', 'Wroclaw', 'PL23 1234 1234 0000 4321 4321 4325', 'nadawca1', 'haslo1');
INSERT INTO nadawca(id, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, numer_konta, login, haslo)
            VALUES(6, 'Magdalena Nowacka', 'Grunwaldzka 7', '50-365', 'Wroclaw', '23 1234 1234 0000 4321 4321 4326', 'nadawca1', 'haslo1');
INSERT INTO nadawca(id, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, numer_konta, login, haslo)
            VALUES(7, 'Andrzej Michalski', 'Grunwaldzka 8', '50-365', 'Wroclaw', '23 1234 1234 0000 4321 4321 4327', 'nadawca1', 'haslo1');
INSERT INTO nadawca(id, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, numer_konta, login, haslo)
            VALUES(8, 'Anna Pietrzak', 'Grunwaldzka 12', '50-365', 'Wroclaw', '23 1234 1234 0000 4321 4321 4328', 'nadawca1', 'haslo1');



INSERT INTO odbiorca(id, adnotacje, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, login, haslo)
            VALUES(1, '', 'Jan Nowak', 'Grunwaldzka 11', '50-365', 'Wroclaw', 'nadawca1', 'haslo2');
INSERT INTO odbiorca(id, adnotacje, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, login, haslo)
            VALUES(2, '', 'Adam Piekarski', 'Grunwaldzka 12', '50-365', 'Wroclaw', 'nadawca2', 'haslo3');
INSERT INTO odbiorca(id, adnotacje, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, login, haslo)
            VALUES(3, '', 'Andrzej Piaseczny', 'Grunwaldzka 13', '50-365', 'Wroclaw', 'nadawca3', 'haslo4');
INSERT INTO odbiorca(id, adnotacje, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, login, haslo)
            VALUES(4, '', 'Karol Pietraszko', 'Grunwaldzka 14', '50-365', 'Wroclaw', 'nadawca4', 'haslo5');
INSERT INTO odbiorca(id, adnotacje, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, login, haslo)
            VALUES(5, '', 'Agata Majkowska', 'Grunwaldzka 15', '50-365', 'Wroclaw', 'nadawca5', 'haslo6');
INSERT INTO odbiorca(id, adnotacje, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, login, haslo)
            VALUES(6, '', 'Agnieszka Kowalczyk', 'Grunwaldzka 16', '50-365', 'Wroclaw', 'nadawca6', 'haslo7');
INSERT INTO odbiorca(id, adnotacje, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, login, haslo)
            VALUES(7, '', 'Antoni Strzelecki', 'Grunwaldzka 17', '50-365', 'Wroclaw', 'nadawca7', 'haslo8');
INSERT INTO odbiorca(id, adnotacje, imie_i_nazwisko, adres, kod_pocztowy, miejscowosc, login, haslo)
            VALUES(8, '', 'Gracjan Skowronski', 'Grunwaldzka 18', '50-365', 'Wroclaw', 'nadawca8', 'haslo9');



INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(1, '2019-01-01', 22.54, true, 'Oplacona', '2019-01-14', 2, 'Nadana', 1, 1, 1);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(2, '2019-01-01', 9.24, true, 'Oplacona', '2019-01-14', 2, 'Nadana', 1, 2, 2);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(3, '2019-01-01', 8.89, true, 'Oplacona', '2019-01-14', 2, 'Nadana', 1, 3, 3);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(4, '2019-01-01', 4.12, true, 'Oplacona', '2019-01-14', 1, 'Nadana', 1, 4, 4);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(5, '2019-01-02', 3.11, true, 'Oplacona', '2019-01-14', 1, 'Nadana', 2, 5, 5);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(6, '2019-01-02', 8.11, true, 'Oplacona', '2019-01-14', 1, 'Nadana', 2, 6, 6);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(7, '2019-01-02', 9.01, true, 'Oplacona', '2019-01-14', 1, 'Nadana', 2, 7, 7);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(8, '2019-01-02', 6.15, true, 'Oplacona', '2019-01-14', 1, 'Nadana', 3, 8, 8);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(9, '2019-01-02', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 1, 2);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(10, '2019-01-03', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 1, 3);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(11, '2019-01-03', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 1, 4);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(12, '2019-01-03', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 1, 5);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(13, '2019-01-03', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 2, 1);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(14, '2019-01-03', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 2, 2);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(15, '2019-01-03', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 2, 3);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(16, '2019-01-03', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 3, 1);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(17, '2019-01-04', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 3, 2);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(18, '2019-01-05', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 3, 3);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(19, '2019-01-05', 5.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 3, 4);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(20, '2019-01-05', 6.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 4, 1);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(21, '2019-01-05', 6.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 4, 2);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(22, '2019-01-05', 6.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 4, 3);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(23, '2019-01-06', 6.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 4, 4);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(24, '2019-01-06', 6.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 5, 1);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(25, '2019-01-06', 6.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 6, 1);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(26, '2019-01-06', 6.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 6, 2);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(27, '2019-01-06', 6.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 6, 3);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(28, '2019-01-06', 8.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 6, 4);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(29, '2019-01-06', 8.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 6, 5);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(30, '2019-01-07', 8.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 6, 6);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(31, '2019-01-07', 8.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 6, 7);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(32, '2019-01-07', 8.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 6, 8);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(33, '2019-01-07', 8.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 7, 1);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(34, '2019-01-07', 8.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 7, 2);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(35, '2019-01-07', 8.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 7, 3);
INSERT INTO przesylka(id, data_nadania, koszt_do_zaplaty, na_liscie_rozwozowej, opcja_dostawy,
            ostatnia_zmiana_statusu, proba_dostarczenia, status_przesylki, lista_rozwozowa_id, nadawca_id, odbiorca_id)
            VALUES(36, '2019-01-07', 8.50, false, 'Oplacona', '2019-01-14', 1, 'Nadana', null, 7, 4);



INSERT INTO awizo(id, data_zostawienia, przesylka_id) VALUES(1, '2019-01-16', 1);
INSERT INTO awizo(id, data_zostawienia, przesylka_id) VALUES(2, '2019-01-18', 2);
INSERT INTO awizo(id, data_zostawienia, przesylka_id) VALUES(3, '2019-01-18', 3);