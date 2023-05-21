# 2. Tjek passwords

I denne ogpave skal du skrive et program, som kan undersøge om et password opfylder
et antal regler. Lav så meget af opgaven, som du kan nå.

1. Skriv en klasse **PasswordValidator** med attributterne
* minLength
* maxLength
* numbersRequired

Attributterne skal sættes i klassens konstruktør.

2. Skriv metoden **public boolean isValid(String password)** i klassen. Metoden skal 
undersøge om **password** opfylder følgende regler:

a. **password** må ikke være kortere end minLength eller længere end maxLength.

b. **password** skal indeholde minimum et tal, hvis numbersRequired er true. Du kan bruge
metoden **Character.isDigit()** til dette.

Hvis **password** opfylder begge krav, skal metoden returnere true og ellers skal den returnere false

3. Skriv en klasse **Main** med en **main**-metode, hvor du tester, at din metode virker. 


**Hvis du har tid:**

Udvid reglerne, så det er påkrævet, at passwordet indeholder både store og små bogstaver
(**Character.isUpperCase()**).