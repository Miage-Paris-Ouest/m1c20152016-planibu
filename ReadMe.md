
 
[![travis project](https://travis-ci.org/Miage-Paris-Ouest/m1c20152016-planibu.svg)](https://travis-ci.org/Miage-Paris-Ouest/m1c20152016-planibu/)


#Spécifications fonctionnelles  #

## Plan interactif de la BU (application mobile)#

###I) Le besoin de la Bibliothèque Universitaire :#
<br>
Le Service Commun de la Documentation de l’Université Paris Ouest souhaite mettre à disposition des étudiants ainsi que du personnel de l’université une application permettant de se déplacer au sein de la bibliothèque universitaire. 
Pour ce faire, l’application devra permettre aux utilisateurs d’accéder au plan de la bibliothèque mais aussi de pouvoir effectuer différents types de recherche afin de connaître l’emplacement de la collection de livres désirée. 
Ces recherches doivent pouvoir être effectuées de manières différentes. En premier lieu, l’utilisateur doit pouvoir sélectionner une discipline, une sous-discipline ou une racine de cote par l’intermédiaire d’un menu dédié. L’autre choix devant s’offrir à l’utilisateur est la possibilité d’une recherche directe via les racines de cotes. A l’issue de ces recherches, l’application doit afficher sur le plan de la bibliothèque l’étagère où se situent les livres recherchés.

L’application sera livrée le Jeudi 25 Février avec une documentation précise afin de faciliter sa maintenance par le service informatique de la bibliothèque universitaire.

####II) Digramme globale de cas d'utilisation :#
<br>
Voici un diagramme des principaux cas d’utilisations de plan interactif de BU Afin d’avoir un meilleur point de vue sur les principales fonctionnalités de l'application :
</br>
![Google logo](http://img11.hostingpics.net/pics/411028Diagrammedecasdutilisation.png "google logo")




###III) Nos solutions :#
<br>
Étant donné qu’il nous est laissé le choix du format de l’application, à savoir application web ou application smartphone, nous avons opté pour l’application smartphone car ce format semble mieux adapté aux besoins de la bibliothèque universitaire. 
</br>

<br>En effet, l’application devant permettre de se déplacer au sein de la bibliothèque, une application mobile sera plus appropriée pour une utilisation rapide, pratique et surtout à portée de main de l’utilisateur en permanence.
Concernant le choix du système d'exploitation mobile, nous avons choisi de développer l’application pour Android car il s’agit du système d’exploitation le plus largement répandu sur smartphone. </br>


* A son ouverture, l’application affichera trois éléments: un plan général de la bibliothèque universitaire, un bouton permettant d’ouvrir le menu de sélection sous forme de pop-up ainsi qu’un second bouton (SearchView) permettant à l’utilisateur d’effectuer directement une recherche

* Le plan général de la bibliothèque affichera les deux étages de celle-ci. A chacun des étages on trouvera les différentes salles avec les disciplines concernées.

* Le menu de sélection contiendra un item correspondant aux disciplines et un item correspondant aux racines de cotes. Chacun de ces deux items redirigera respectivement l’utilisateur vers une liste de sélection de disciplines et de sous disciplines, ainsi qu’une liste de sélection d’indices de cote.
La barre de recherche permettra à l’utilisateur de rechercher une cote et d’accéder directement à l’affichage de sa position  sur le plan.
Lors du choix d’une ou plusieurs disciplines, l’application affichera un plan détaillé contenant la (/les) section(s) demandée(s).

#Manuel :#
#Description textuelle d'un cas d'utilisation#

Nom: Plan interactif BU 
Acteur: Utilisateur
Données d'entrée: Salle sélectionnés par un utilisateur
Le cas d'utilisation commence lorsque l’utilisateur ouvre l’application

Scénario principal:

* 1. L’application affiche un plan général de la BU, propose de rechercher directement une cote dans la barre de recherche ou d’accéder à un menu.
* 2. L’utilisateur choisit de chercher un livre par discipline dans le menu.
* 3. L’application propose à l’utilisateur de sélectionner une sous-discipline parmi une liste rangée par discipline.

* 4. L’utilisateur choisit une sous-discipline et valide.
* 5. L’application affiche la zone sélectionnée sur la map.
* 6. L’utilisateur choisit de tracer l’itinéraire pour y aller ou non.

<br>
Scénario d'erreur: Tracé d’itinéraire indisponible
</br>
* 6a. L’application affiche un message d'erreur
Retour à l'étape 5.

Scénario alternatif:
* 2a. L’utilisateur choisit de chercher un livre par racine de cote dans le menu.
Le scénario reprend à l'étape 5
Scénario alternatif:
* 2b. L’utilisateur choisit de rechercher un service dans le menu.
Le scénario reprend à l’étape 5
Scénario alternatif:
* 2c. L’utilisateur choisit de rechercher une cote dans la barre de recherche 
* 
#Groupe m1c20152016-planibu : #
* Leyla EL ATTAR
* Pascal ORSINI
* Khedidja EL M'RABET
