# cinelist
permite consultar información de películas mediante un servicio externo y organizar una biblioteca personal en la que los usuarios puedan guardar películas, clasificarlas según su estado de visualización y asignarles una calificación personal.

---

# Usage

### ApiKey

primero debes ingresar a la pagina de [OMDB](https://www.omdbapi.com/), resgistrate y obtener el apikey del servicio.

despues clona el proyecto y en la raiz del mismo crea un archivo llamado "secrets.properties".
En el se deben añadir las siguientes lineas

#### FILE: secrets.properties
```bash
OMDB_API_KEY=tu_api_key
OMDB_BASE_URL=https://www.omdbapi.com/
```

con esto el proyecto estará en condiciones de acceder al servicio de la api.

---

