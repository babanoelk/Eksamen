# 1. Beregning af Areal

I denne opgave skal du skrive et program, som beregner
arealet af forskellige former. Lav så meget af opgaven,
du kan nå.

**1**. Skriv et interface **Shape** med metoden: **public double calculateArea()**

**2**. Skriv to klasser, som implementerer interfacet.

Klassen **Square** skal have følgende attributter(som skal sættes via klassens konstruktør):
* Height
* Length

Klassen skal implementere metoden **calculateArea()**. Arealberegningen foretages ved
at gange højde med længden.

Klassen **Circle** skal have følgende attribut (som skal sættes via klassens konstruktør):
* Radius

Klassen skal implementere metoden **calculateArea()**. Arealet af en cirkel er
pi * radius^2. Hvilket kan skrives som: Math.PI * (Radius * Radius).

**3**. Skriv en klasse Main med en main-metode.

Opret et **Square**-objekt og et **Circle**-objekt i main-metoden og test at deres **calculateArea()**-metoder virker.

**Hvis du har tid:**

1. Skriv en klasse **Shapes**, som har en samling af **Shape**-objekter.
2. Skriv en metode **addShape(Shape s)** i klassen, som kan bruges til at tilføje **Shape**-objekter til samlingen.
3. Skriv en metode **public double totalArea()** som beregner areal af alle **Shape**-objekter.
4. Test at metoden virker.