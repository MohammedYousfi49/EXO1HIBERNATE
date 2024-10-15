# JPA-Hibernate

Ce projet implémente un système de gestion de stock, de projets et de produits en Java. Il permet de gérer les projets et les tâches associées via des opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) grâce à l'intégration du framework de persistance JPA-Hibernate, facilitant la manipulation des données en base de données. Le développement a été réalisé avec l'IDE NetBeans.

## Technologies Utilisées

- **Java** : Langage principal pour la logique métier et les opérations de gestion de données.
- **JDBC (Java Database Connectivity)** : Pour interagir avec la base de données MySQL.
- **MySQL** : SGBD utilisé pour stocker les informations liées aux projets, produits et tâches.
- **Hibernate** : Framework de persistance pour simplifier la gestion des entités Java en base de données.
- **NetBeans** : IDE recommandé pour développer, tester, et déployer l'application.

## Prérequis

Avant de commencer, assurez-vous d'avoir installé les éléments suivants :

- **Java JDK 8+** : [Téléchargez ici](https://www.oracle.com/java/technologies/javase-downloads.html)
- **MySQL** : [Téléchargez ici](https://dev.mysql.com/downloads/installer/)
- **Pilote JDBC MySQL** : [Téléchargez ici](https://dev.mysql.com/downloads/connector/j/)
- **Hibernate** : Les dépendances peuvent être gérées via Maven ou ajoutées manuellement dans NetBeans.
- **NetBeans** ou un autre IDE Java : [Téléchargez ici](https://netbeans.apache.org/download/index.html)

## Installation

### 1. Configuration de la Base de Données
- Installez MySQL et créez une base de données nommée `messagerie` ou autre nom souhaité.
- Créez les tables pour gérer les projets, produits et tâches. Vous pouvez utiliser le script SQL fourni dans le fichier `setup.sql` du projet.

### 2. Configuration de Hibernate
- Créez un fichier de configuration Hibernate (`hibernate.cfg.xml`) dans le package `ma.projet.config`. Ce fichier doit inclure les informations de connexion à la base de données MySQL, notamment l'URL, le nom d'utilisateur, et le mot de passe.
  
Exemple de fichier `hibernate.cfg.xml` :

```xml
<!DOCTYPE hibernate-configuration PUBLIC "-//Hibernate/Hibernate Configuration DTD 3.0//EN" "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
    <session-factory>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/nom_de_la_base</property>
        <property name="hibernate.connection.username">votre_utilisateur</property>
        <property name="hibernate.connection.password">votre_mot_de_passe</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
        <property name="hibernate.hbm2ddl.auto">update</property>
        <property name="hibernate.show_sql">true</property>
    </session-factory>
</hibernate-configuration>
## Fonctionnalités Principales

- **Requêtes SQL** :  
  Le système prend en charge l'exécution des requêtes SQL suivantes :  
  - Identifier le développeur ayant généré le plus de scripts en une journée.
  - Classer les développeurs selon leur production hebdomadaire.
  - Calculer le nombre total de scripts réalisés par un développeur spécifique.

### 1. Gestion des Projets
- **Création de projets** :  
  Créez de nouveaux projets avec des informations telles que le nom du projet, la date de début et les membres de l'équipe.
- **Suivi des tâches** :  
  Gère les tâches associées à chaque projet, y compris les dates de début et de fin, ainsi que le statut de chaque tâche.
- **Affichage des projets** :  
  Liste tous les projets en cours, affichant les détails comme les tâches assignées et l'avancement de chaque projet.
- **Recherche et filtrage des projets** :  
  Permet de rechercher et de filtrer des projets en fonction de critères spécifiques comme les membres de l'équipe ou les dates importantes.

### 2. Gestion des Stocks
- **Ajout de nouveaux articles** :  
  Ajoutez de nouveaux articles avec des informations telles que la quantité, le prix, et la catégorie.
- **Mise à jour des niveaux de stock** :  
  Suivez et ajustez les niveaux de stock en fonction des entrées et sorties d'articles.
- **Affichage de l'état des stocks** :  
  Visualisez l'état des stocks avec la possibilité de filtrer par catégorie ou par date d'ajout.
- **Alertes de stock bas** :  
  Recevez des notifications lorsque le niveau de stock d'un article descend sous un seuil défini.

### 3. Gestion des Produits
- **Création de produits** :  
  Créez de nouveaux produits avec des détails tels que la description, le prix, et la catégorie associée.
- **Modification des produits** :  
  Mettez à jour les informations des produits existants selon les besoins.
- **Suppression de produits** :  
  Supprimez des produits du système si nécessaire.
- **Affichage et filtrage des produits** :  
  Listez les produits disponibles avec des options de filtrage par catégorie ou par gamme de prix.

