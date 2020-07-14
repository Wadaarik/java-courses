//déclaration d'une variable avec un type int
//le type est défini avant la variable

int a = 500;
int b = 1000;

//une variable peut être défini sans présiser son type

c = 1000;

// Version d'affectation normale
savings = savings + 100;

// Version raccourcie d'affectation
savings += 100;

//        +=  addition
//
//        -=  soustraction
//
//        *=  multiplication
//
//        /=  division


//les types de variables génériques :
//        String = texte
//
//        int = nombre entier
//
//        double = nombre en virgule flottante
//
//        float = nombre en virgule flottante à max 7 au dessus de la virgule

String text = "A wonderful string that consists of multiple characters"
int numberOfVowels = 1
float length = 1876.79;
double width = 1876.79797657;

//Une variable avec une valeur qui ne change pas s'appelle une constante
//En java cette constante s'appelle "final"

final int numberOfWeekdays = 7; //constante de type int de valeur 7 nommée numberOfWeekdays
final String myFavouriteFood = "Icecream";//constante de type string de valeur "Icecream" nommée myFavoutiteFood

//Si on essaye de modifier les valeurs de toutes ces constantes, les constantes généreront des erreurs
numberOfWeekdays = numberOfWeekdays + 1; // Error
myFavouriteFood = "Cake"; // Error



//TODO Etape 1 : créez une variable daysInWeek avec une valeur de 7
int daysInWeek = 7;
//TODO Etape 2 : ajoutez la valeur de la variable daysInWeek à la variable firstDay, en utilisant un opérateur raccourci
daysInWeek += firstDay;
//TODO Etape 3 : créez une constante numérique nommé startingDay avec la nouvelle valeur de la variable firstDay
final int startingDay = firstDay;
// Affiche le résultat
startingDay = 10;



int numerator = 10;
int denominator = 4;

//TODO Modifiez la déclaration ci-dessous pour que la réponse "answer" soit une valeur décimale
double answer = numerator/denominator;

//Affiche 10/4=2.0


String firstString = "dogs";
String secondString = "cats";

//TODO : créez une nouvelle variable appelée "animals" qui dit "I love both dogs and cats!"
String animals = "I love both " + firstString + " and " + secondString + "!";
