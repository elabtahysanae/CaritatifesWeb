# <span style="color:green;">🌍 Plateforme de Dons Caritatifs</span>

📚 **Sommaire**

- 📌 **Contexte**
- ❓ **Problématique**
- 🎯 **Objectifs**
- 🧩 **Diagramme de Classe**
- 🗃️ **Modèle Conceptuel de la Base**
- ⚙️ **Exécution des Tests**
- 🛠 **Technologies**

---

## 📌 **Contexte**

Ce projet est une application web développée en **Java** pour la gestion des dons caritatifs. Elle permet :

- Aux **organisations caritatives** de gérer des **causes** et des **dons**.
- Aux **donneurs** de consulter et faire des dons à des causes spécifiques.
- À l'**administration** de suivre les statistiques des dons par cause.

---

## ❓ **Problématique**

La gestion manuelle des dons caritatifs présente plusieurs défis :

- Difficulté à suivre l’évolution des dons par cause.
- Manque de visibilité sur l'impact des dons collectés.
- Processus d’attribution de dons aux causes chronophage.
- Absence de suivi des statistiques pour analyser les performances des campagnes.

---

## 🎯 **Objectifs**

Créer une plateforme centralisée pour :

- 📋 **Lister toutes les causes** disponibles.
- 👥 **Permettre aux donneurs de faire des dons** en ligne.
- 📊 **Générer des statistiques par cause** (par exemple, montant total collecté, nombre de donneurs).
- Fournir aux **donneurs** :
  - 👀 **Visualisation des causes** auxquelles ils peuvent participer.
  - 🔔 **Notifications de la progression des causes** et des campagnes.

---

## 🧩 **Diagramme de Classe**

![WhatsApp Image 2025-04-10 at 04 44 04_ea2fc900](https://github.com/user-attachments/assets/8766881e-4603-4cb8-9009-e38dfef2d505)

---

## 🗃️ **Modèle Conceptuel de la Base**

Voici les principales entités du modèle de base de données :

- **Cause** : Titre, Description, Objectif, Catégorie.
- **Don** : Montant, Date, Cause (relation avec `Cause`), Donneur (relation avec `User`).
- **Catégorie** : Nom de la catégorie (ex. : Santé, Éducation, Environnement).
- **User** : Nom, Email, Mot de passe.
- **Admin** : il va heriter du user (Nom, Email, Mot de passe).
- **Donneur** : il va heriter du user (Nom, Email, Mot de passe).
 

---

## ⚙️ **Exécution des Tests**


### 1. **Création des tables**

Création de la base de données et des tables :

- **Cause** : `id`, `titre`, `description`, `objectif`, `categorie_id` (clé étrangère).
- **Don** : `id`, `montant`, `date`, `cause_id` (clé étrangère), `donneur_id` (clé étrangère).
- **Categorie** : `id`, `nom`.
- **User** : `id`, `nom`, `email`, `motDePasse`.
- **Donneur** : il y'a un heritage du table User.
- **Admin** : il y'a un heritage du table User.

### 2. **Ajout de clés étrangères**
Les relations entre les tables sont gérées par les clés étrangères (par exemple, `cause_id` dans la table `Don`).

### 3. **Insertion des données**
Exemples de données insérées dans les tables `Cause`, `Don`, `Categorie`, et `User`.

### 4. **Sélection des données**
- Affichage des dons effectués pour une cause donnée.
- Visualisation des statistiques par cause (nombre de dons, montant total collecté).

---

## 🛠 **Technologies**

### ⚙️ **Côté serveur (Backend)**

- **Java Web** – Technologie principale pour la logique métier.
- **Hibernate** – Pour la gestion de la persistance des données de manière orientée objet.
- **JDBC** – Utilisé ponctuellement pour des requêtes spécifiques non prises en charge par l'ORM.

### 🗃️ **Base de données**

- **MySQL** – Système relationnel pour la gestion des données des causes, dons, utilisateurs et catégories.

---

