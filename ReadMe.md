

#Spécifications fonctionnelles #

## 3Plan interactif de la BU (application mobile)#

    
-Reformuler besoin BU
 -UML (use case, activité/état transition, classe)
Nos solutions

#I) Le besoin de la Bibliothèque Universitaire#
<br>
Le Service Commun de la Documentation de l’Université Paris Ouest souhaite mettre à disposition des étudiants ainsi que du personnel de l’université une application permettant de se déplacer au sein de la bibliothèque universitaire. 
Pour ce faire, l’application devra permettre aux utilisateurs d’accéder au plan de la bibliothèque mais aussi de pouvoir effectuer différents types de recherche afin de connaître l’emplacement de la collection de livres désirée. 
Ces recherches doivent pouvoir être effectuées de manières différentes. En premier lieu, l’utilisateur doit pouvoir sélectionner une discipline, une sous-discipline ou une racine de cote par l’intermédiaire d’un menu dédié. L’autre choix devant s’offrir à l’utilisateur est la possibilité d’une recherche directe via les racines de cotes. A l’issue de ces recherches, l’application doit afficher sur le plan de la bibliothèque l’étagère où se situent les livres recherchés.

L’application sera livrée le Jeudi 25 Février avec une documentation précise afin de faciliter sa maintenance par le service informatique de la bibliothèque universitaire.

#Digramme globale de cas d'utilisation:#
<br>
Voici un diagramme des principaux cas d’utilisations de plan interactif de BU Afin d’avoir un meilleur point de vue sur les principales fonctionnalités de l'application :
</br>
![Google logo](http://img15.hostingpics.net/pics/280593BibliothequeUseCase1.png "google logo")

###III) Nos solutions#
<br>
Étant donné qu’il nous est laissé le choix du format de l’application, à savoir application web ou application smartphone, nous avons opté pour l’application smartphone car ce format semble mieux adapté aux besoins de la bibliothèque universitaire. 
En effet, l’application devant permettre de se déplacer au sein de la bibliothèque, une application mobile sera plus appropriée pour une utilisation rapide, pratique et surtout à portée de main de l’utilisateur en permanence.
Concernant le choix du système d'exploitation mobile, nous avons choisi de développer l’application pour Android car il s’agit du système d’exploitation le plus largement répandu sur smartphone. </br>


* A son ouverture, l’application affichera trois éléments: un plan général de la bibliothèque universitaire, un bouton permettant d’ouvrir le menu de sélection sous forme de pop-up ainsi qu’un second bouton (SearchView) permettant à l’utilisateur d’effectuer directement une recherche

* Le plan général de la bibliothèque affichera les deux étages de celle-ci. A chacun des étages on trouvera les différentes salles avec les disciplines concernées.

* Le menu de sélection contiendra un item correspondant aux disciplines et un item correspondant aux racines de cotes. Chacun de ces deux items redirigera respectivement l’utilisateur vers une liste de sélection de disciplines et de sous disciplines, ainsi qu’une liste de sélection d’indices de cote.
La barre de recherche permettra à l’utilisateur de rechercher une cote et d’accéder directement à l’affichage de sa position  sur le plan.
Lors du choix d’une ou plusieurs disciplines, l’application affichera un plan détaillé contenant la (/les) section(s) demandée(s).



#Les améliorations possibles:#


*  Chaque salle se verra attribué un code couleur correspondant à celui utilisé à la BU afin de mieux se repérer sur la carte.

*  L’affichage dans la page d’accueil du plan par niveau grâce à des boutons permettant de passer du plan général au plan par étage ( général, 0 et 1).
*  Les Services pourront être affichés ou non sur le plan à l’aide d’un bouton (ON/OFF)
*  L’affichage des horaires de la BU 
* L’affichage de l’accès à la BU au sein du campus à l’aide d’une map.
* L’affichage du règlement intérieur et de la charte de la BU
*  L’affichage des Services détaillés proposés par la BU
* item La gestion du “contact” (envoi de demande d’informations direct)
*  La gestion de l’application en anglais pour les erasmus ? (FR|ENG)
*  La gestion d’un onglet “Actualités” lié à celui du site ?
*  L’itinéraire d’un point A (position actuelle) à un Point B (la discipline/sous-discipline/racine de cote choisie)


 
#Logiciels de développement :#
 Android Studio est l’environnement de développement officiel de Google qui remplace l’IDE  d’Eclipse (avec donc exactement les mêmes fonctionnalités) depuis le 8 décembre 2014.
 
Gradle a pour fonctionnalités de :
* Permettre la construction de projet
* Combiner (Ant et Maven)
* Permettre d'écrire des tâches de construction utilisant le langage Groovy (tests
unitaires, ...)
* Faciliter l’intégration des plugins(comme Google l'a fait pour Android Studio)
* Gérer automatiquement des dépendances

GIT est un logiciel de gestion de versions décentralisé. C'est un logiciel libre créé par Linus Torvalds, créateur du noyau Linux, et distribué selon les termes de la licence publique générale GNU version 2
 GitHub est un service web d'hébergement et de gestion de développement de logiciels, utilisant le programme Git.
