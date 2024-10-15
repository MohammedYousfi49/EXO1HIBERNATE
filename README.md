# JPA-Hibernate

Ce projet propose un système de gestion de stock, de projets et de produits, développé en Java. Il permet la gestion des projets, des tâches associées, ainsi que la manipulation de données à travers diverses opérations CRUD (Create, Read, Update, Delete). Le framework de persistance JPA Hibernate est utilisé pour simplifier ces interactions avec la base de données. Le développement est principalement réalisé avec l'IDE NetBeans.

## Technologies Utilisées

- **Java** : Langage principal pour la logique métier et les opérations de gestion de données.
- **JDBC (Java Database Connectivity)** : Pour interagir avec la base de données MySQL.
- **MySQL** : SGBD utilisé pour stocker les informations liées aux projets, produits et tâches.
- **Hibernate** : Framework de persistance pour simplifier la gestion des entités Java en base de données.
- **NetBeans** : IDE recommandé pour développer, tester et déployer l'application.

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
- Créez un fichier de configuration Hibernate (`hibernate.cfg.xml`) dans le package `ma.projet.config`. Ce fichier doit inclure les informations de connexion à la base de données MySQL, notamment l'URL, le nom d'utilisateur et le mot de passe.

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

- *Requêtes SQL :*  
  Le système permet d'exécuter des requêtes SQL telles que :  
  - Identifier le développeur ayant généré le plus de scripts en une journée.
  - Classer les développeurs selon leur production hebdomadaire.
  - Calculer le nombre total de scripts réalisés par un développeur spécifique.

### 1. Gestion des Projets
- *Création de projets* : Crée de nouveaux projets avec des informations détaillées comme le nom, la date de début et les membres de l'équipe.
- *Suivi des tâches* : Gère les tâches liées à chaque projet, en incluant les dates de début et de fin, ainsi que leur statut.
- *Affichage des projets* : Liste tous les projets avec leurs détails, incluant les tâches assignées et leur avancement.
- *Recherche et filtrage des projets* : Permet de rechercher des projets selon des critères spécifiques, tels que les membres de l'équipe ou les dates clés.

### 2. Gestion des Stocks
- *Ajout de nouveaux articles* : Permet d'ajouter de nouveaux articles avec des informations telles que la quantité, le prix et la catégorie.
- *Mise à jour des niveaux de stock* : Suit les niveaux de stock et ajuste les quantités en fonction des entrées et sorties.
- *Affichage de l'état des stocks* : Offre une vue d'ensemble des articles en stock avec des options de filtrage par catégorie ou par date.
- *Alertes de stock bas* : Émet des notifications pour les articles dont les niveaux de stock sont sous un seuil défini.

### 3. Gestion des Produits
- *Création de produits* : Crée de nouveaux produits avec des détails comme la description, le prix et la catégorie.
- *Modification des produits* : Permet de mettre à jour les informations des produits existants.
- *Suppression de produits* : Offre la possibilité de supprimer des produits du système si nécessaire.
- *Affichage et filtrage des produits* : Liste les produits disponibles avec des options de filtrage par catégorie ou par gamme de prix.
