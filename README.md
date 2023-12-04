# Jaar2_Sem4_DSAL_Opdr4_Virus

Algemene Beschrijving:
Een algoritme om het spel Virus te spelen.

Spelregels Virus:
Bij het spel Virus is het de bedoeling om zoveel mogelijk vakjes met je eigen virus (Rood of Groen) te bezetten. Het spel wordt gespeeld op een rechthoek van 7 bij 7 met in twee hoeken een collectie virussen.

![tabelvirus](https://github.com/Ayrtonko/Jaar2_Sem4_DSAL_Opdr4_Virus/blob/master/images/tabelvirus.png?raw=true)

Om de beurt mogen de twee spelers één van hun virussen verplaatsen. Verplaatsen kan op twee manieren:
1.	Het virus wordt verplaatst naar een aangrenzend leeg vakje (inclusief diagonaal). Het virus wordt dan gekopieerd, oftewel, de speler heeft op het oude en het nieuwe vakje een virus.
2.	Het virus wordt verplaatst naar een leeg vakje dat twee vakjes van het bron-vakje verwijderd is. Het virus springt dan, oftewel, het virus verschijnt op de nieuwe locatie en verdwijnt op de oude locatie.
Zodra een virus verplaatst is worden alle virussen van de tegenstander die aangrenzend (inclusief diagonaal) zijn aan het nieuwe vakje van het virus besmet en zijn nu van de kleur die zojuist verplaatst is.

Het spel is gewonnen zodra of alle virussen van de tegenstander zijn ‘opgegeten’, of een speler, zodra geen van beide meer een geldige zet kan doen, de meeste virussen over heeft.
