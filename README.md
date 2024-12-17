
# BeerHelper

**BeerHelper** is een Java-programma ontwikkeld als een propedeuseproject. Het helpt gebruikers bij het samenstellen van een bierrecept op basis van hun smaakprofiel. Dit project is ontworpen met een sterke focus op het gebruik van objectgeoriënteerde programmeerprincipes (OOP) en het SOLID-principe om de code onderhoudbaar, uitbreidbaar en modulair te maken.

---

## Installatie

### Vereisten
- **Java 8+**: Zorg ervoor dat je Java op je machine hebt geïnstalleerd.
- **IDE (optioneel)**: IntelliJ IDEA, Eclipse of een andere Java IDE.

### Installatiestappen
1. Clone of download de broncode:
   ```bash
   git clone <repository-url>


## Casting
Casting wordt gebruikt bij het verwerken van invoer als een TasteProfile-object en het doorgeven ervan aan methoden die specifieke berekeningen uitvoeren. Dit zorgt ervoor dat typeveiligheid behouden blijft.

## SOLID-Principes
### Single Responsibility Principle (SRP):

Elke klasse heeft één duidelijke verantwoordelijkheid.
TasteProfile beheert alleen gebruikersvoorkeuren.
IngredientSelector berekent alleen de ingrediënten.
### Open/Closed Principle (OCP):
Het systeem is uitbreidbaar. 
Je kunt bijvoorbeeld nieuwe ingrediënten of bierrecepten toevoegen zonder bestaande code te wijzigen.

### Liskov Substitution Principle (LSP):

De structuur van de klassen zorgt ervoor dat objecten uitwisselbaar zijn zonder dat het gedrag van het programma verandert.
Interface Segregation Principle (ISP):

Interfaces worden klein gehouden en bevatten alleen de methoden die relevant zijn voor hun rol.
### Dependency Inversion Principle (DIP):

Hoge niveau klassen zoals `Recipe` vertrouwen niet direct op lage niveau implementaties zoals `IngredientSelector`, maar werken via abstracties (interfaces).

---

## Projectstructuur

```bash
BeerHelper/
│
├── Main.java             # De hoofdklasse voor gebruikersinteractie
├── TasteProfile.java     # Beheert gebruikersvoorkeuren
├── Recipe.java           # Beheert het recept en print de output
├── IngredientSelector.java # Berekent de ingrediënten op basis van het smaakprofiel
└── interfaces/           # Bevat interfaces voor uitbreidbaarheid (bijv. IngredientCalculator)
```

## Bijdragen
Dit project was een onderdeel van mijn propedeuse en is bedoeld om mijn begrip van Java en OOP-principes te demonstreren. Als je ideeën hebt om het verder te verbeteren, kun je een pull request openen.
