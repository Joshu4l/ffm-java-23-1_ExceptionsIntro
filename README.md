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