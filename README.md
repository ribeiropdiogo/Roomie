<p align="center">
  <img src="https://user-images.githubusercontent.com/32687881/122273712-a7995100-ced9-11eb-8119-3f9518470334.png">
</p>

## 📖 Description

Roomie consists in a web platform where landlord can post their houses, and tenants can search for openings in houses. Each tenant has his evaluation scores that other users can access in order to decide if they want to live with them. Landlords can accept application or reject them. This repository contains all stages of developoment, from low-fidelity prototypes, to a fully functional production version.

## ✏️ Low-Fidelity Prototype

Our low.didelity prototypes are located in the `prototypes`folder. We have static representations with images, and a dynamic prototype that we built using [figma](https://www.figma.com/proto/QI3glrnfyr5FPTlQFCQNmb/Prototype?node-id=10%3A1356&scaling=min-zoom&page-id=2%3A1302).

## 🏢 Backend

### Prerequisites

In order to run our backend you need the to have the following installed on your machine:
- JDK 11+
- PostgreSQL

### 🧰 Running

To run our backend and maintain it operational you need to follow these steps:

#### 1. Create the Database and the User

```bash
sudo -u postgres psql
postgres=# create database roomie;
postgres=# create user roomie with encrypted password 'passw0rd';
postgres=# grant all privileges on database roomie to roomie;
```

#### 2. Run the Project

In order to keep it as simple as possible, you can run the backend, for example, in IntelliJ. To do so, you just need to run the `RestApiApplication.java` file.

#### 3. Create the Database Schema

To create the database schema you just need to access the following endpoint: http://localhost:8083/api/admin/create-db

## 💻 Frontend

To run the frontend of our application, just navigate to the `frontend` folder. First you will need to install `node`. After that, install all required packages using:

```bash
npm i
```

After installing all packages you are ready to run the frontend. To do so just run:

```bash
npm run serve
```

## 🛠️ Extras

### Population

We created a small program to populate ou system with users and houses. To do so, navigate to the `populate` folder and run:

```bash
python3 populate.py
```

### Documentation 

In order to help developing our frontend and to make ou backend more understandable, we used swagger to generate some documentation related to our api. This can be accessed by running the backend and opening [thispage](http://localhost:8083/api/swagger-ui/index.html?configUrl=/api/docs/json/swagger-config).

### Benchmarks

To test our applications capacity and performance we created some usefull tests with locust. These tests can be found in the `benchmarking`folder.

## 💪 Authors

This project was built as part of **Application Engineering & Interactive Systems @ University of Minho**:

-   **Diogo Ribeiro:** [ribeiropdiogo](https://github.com/ribeiropdiogo)
-   **José Diogo Monteiro:** [dxmonteiro](https://github.com/DxMonteiro)
-   **João Nuno Abreu:** [JoaoNunoAbreu](https://github.com/JoaoNunoAbreu)
-   **Rui Mendes:** [ruimendes29](https://github.com/ruimendes29)
-   **Vasco Ramos:** [vascoalramos](https://vascoalramos.me)


## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
