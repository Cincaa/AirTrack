# TravelByPlane

## Utilitate
Aceasta aplicatie are ca scop gestiunea calatoriilor cu avionul din perspectiva unui administrator ori a unui simplu client. Se pot realiza actiuni cu privire la aeroporturi, zborurile dintre doua aeroporturi, avioanele utilizate, angajatii care se afla la bordul avionului pe parcursul unui zbor, air clientii pot achizitiona bilete sau afla informatii specifice despre un zbor.

## Reguli de business
* Administrator:
1. Operatii specifice pentru un aeroport: adaugarea unui aeroport nou; editare; stergere si sa vizualizarea zborurilor care pleaca dintr-un anumit aeroport
2. Operatii legate de angajati: adaugare angajat nou; editare; eliminare; vizualiazara angajatior si a zborurilor pe care acestia lucreaza.
3. Operatii la nivel de zbor: adaugare zbor nou doar in cazul in care aeroporturile din care pleaca sau ajunge exista; elimina un zbor in cazul in care nu are pasageri(adica nu s-au cumparat bilete); editeze si sa vizualizeze toate zborurile
4. Poate sa asigneze un avion disponibil la un zbor
5. Poate sa asigneze/elimine un angajat care e disponibil la un zbor
6. Poate sa vizualizeze biletete cumparate pentru un anumit zbor
7. Poate sa vizualizeze toate biletele cumparate in ordine alfabetica
8. Poate sa faca urmatoarele operatii pentru un avion: sa adauge o configuratie noua pentru un model de avion din cadrul unei companii; editeze; sa elimine avionul in cazul in care nu realizeaza niciun zbor si sa vizualizezw toate avioanele
9. Poate sa vada toti clientii care si-au facut cont sau care nu au cont dar au un bilet de avion achizitionat

* Client:
1. Poate sa isi faca cont pentru a putea afla informatiile dorite sau sa isi cumpere un bilet
2. Poate sa isi modifice contul sau sa il stearga daca nu are bilete cumparate in viitor
3. Poate sa caute zborurile pentru o anumita data de plecare, incluzand orasul de plecare si orasul in care sa ajunga(se afiseaza zborurile care au un avion asignat si un pilot si un insotitor de zbor senior, de asemenea se afiseaza si cazurile in care este necesarea o escala)
4. Poate sa cumpere unul sau mai multe bilete pentru un zbor, inclusiv pentru alte persoane(acele persoane se inregistreaza ca fiind clienti fara cont)
5. Poate sa isi anuleze propriile bilete

## Functionalitatile principale
1. Concepte crud pentru aeroporturi, avioane, zboruri, angajazi, clienti
2. Afisarea zborurilor pentru un oras de plecare si un oras destinatie pentru o data anume
3. Cumpararea biletelor de avion pentru un zbor
4. Vizualizarea biletelor pentru un anumit zbor
5. Vizualizarea zborurilor care pleaca dintr-un anumit aeroport
