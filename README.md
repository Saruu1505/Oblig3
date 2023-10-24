# Oblig 3

- Det jeg gjorde først var å lage et repository inne på github. 
- Så la jeg til filene fra oppgave 2 inn i dette repoet
- Deretter gikk jeg inne på Actions, og valgte en template som heter "Java with Maven"
- Den var allerede satt opp fra før av så jeg gjorde noen småendringer inne på pom.xml fila mi og maven.yml fila mi. 
- Inne på pom-fila mi måtte jeg legge til en testSourceDirectory fordi Github Action ikke gjenkjente eller klarte å hente testene mine
- Inne på maven.yml fila mi satt jeg opp stepsa workflowen skulle gjøre
  - jeg skrev mvn clean install for at den kjører maven fra scratch uten noe avhengigheter. 
  - inne i denne run-koden, kjører den også testene mine som man ser passerer
 
