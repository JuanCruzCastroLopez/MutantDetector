# MutantDetector

## ¿Qué es?
MutantDetector es un proyecto creado para detectar si un humano es mutante o no en función de su ADN.

## ¿Cómo funciona?
El programa presenta un método como interfaz de consulta con la firma *boolean isMutant(String[] dna)*. 
Por otro lado, MutantDetector no es una aplicación standalone, sino que esta pensada para ser consultada a través del método antedicho. Para acceder a él se sugiere el uso de la API REST desarrollada para este proyecto.

### Ejemplos

* ADN Humano NO-Mutante: ["ACGCGA","CTGTCC","TTATGT","AGGAGG","TCACTA","TCACTG"]
* ADN Humano Mutante: ["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]

## Links
  * Repositorio de Travis CI: https://travis-ci.org/JuanCruzCastroLopez/MutantDetector
  * Repositorio MutantDetectorAPI en github: https://github.com/JuanCruzCastroLopez/MutantDetectorAPI.git
