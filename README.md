# https://github.com/Flooooooooooorian/Ecosystem-exception-task
Verwendet unsere o.g. Lösung für eine StudentDB und erweitert sie entsprechend der u.g. Anforderungen. 
Ladet euch dafür am besten das Repo herunter und pusht es in ein neues Github Repository in eurem Account.
(Oder erstellt euch einen Fork.)


### Schritt 1:
Erweitere die StudentDB um eine findById Methode mit einem Parameter id, die einen Student zurückgibt.
Für Selbstsichere: Wenn Ihr testgetrieben vorgehen willst (TDD, test driven development) dürft ihr auch mit Punkt 3 beginnen.

### Schritt 2:
Die findById Methode soll eine passende Exception werfen, wenn kein Student mit der Id existiert.
Überlege auch, was die "passende Exception" hier sein mag.
Eine CheckedException oder eine UncheckedException? 
Eine Instanz einer vordefinierten oder einer selbstgeschriebenen Exceptionklasse?

### Schritt 3:
Schreibe mindestens einen Test, der dieses Verhalten überprüft.


# BONUSAUFGABE

Der Kunde möchte gerne eine Gästeliste haben, auf welcher die Namen aller Gäste stehen sollen.
Damit die Liste nicht verloren geht, soll diese in eine Textdatei gespeichert und auch aus dieser ausgelesen werden.
Diese Aufgabe wird Euch in Form von Testfällen gestellt. Schreibt zuerst den Test, dann die Implementierung.
Gehe erst dann zum nächsten Test weiter, wenn alle bisherigen Tests grün sind.


#### Test 1:
Schreibe einen Test _shouldBeEmptyInitially_, der 

1. eine Instanz von der Klasse GuestList erzeugt,

2. darauf die Methode setGuests mit einer leeren Liste aufruft

3. dann getGuests aufruft (Ergebnis soll eine Liste von Strings sein)

4. und prüft, dass dieses Ergebnis eine leere Liste ist



#### Test 2:
Schreibe einen Test shouldReadSameGuestsAsWrittenBefore, der

1. eine Instanz von der Klasse GuestList erzeugt

2. darauf die Methode setGuests mit Karl und Ute aufruft

3. dann getGuests aufruft (Ergebnis soll eine Liste von Strings sein)

4. und prüft, dass dieses Ergebnis Karl und Ute enthält



#### Test 3:
Schreibe einen Test shouldWriteToFileSystem, der

1. eine Instanz von der Klasse GuestList erzeugt

2. darauf die Methode setGuests mit Theodor und Anette aufruft

3. und prüft, dass die Datei guests.txt angelegt wurde und die Zeilen "Theodor" und "Anette" enthält

Tipp: Dateipfad definieren mit Path.of("guests.txt")
Tipp: Lesen und Schreiben mit der java.nio.file.Files-Klasse



#### Test 4:
Schreibe einen Test shouldReadFromFileSystem, der

1. In die Datei guests.txt Stephan und Max schreibt (als Zeilen)

2. eine Instanz von der Klasse "GuestList" erzeugt

3. dann getGuests aufruft

4. und prüft, dass "Stephan" und "Max" gelesen wurden

Tipp: Dateipfad definieren mit Path.of("guests.txt")
Tipp: Lesen und Schreiben mit der java.nio.file.Files-Klasse



#### Test 5:
Schreibe einen Test, der prüft, dass beim Lesen eine Exception auftritt, wenn die Datei nicht existiert

#### Test 6:
Füge eine addGuest-Methode hinzu, die als Parameter einen String guest
erhält und diesen als zusätzliche Zeile in die Datei schreibt.
